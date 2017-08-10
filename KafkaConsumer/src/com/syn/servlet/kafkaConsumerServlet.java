package com.syn.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

/**
 * Servlet implementation class kafkaConsumerServlet
 */
//@WebServlet("/kafkaConsumerServlet")
public class kafkaConsumerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static ConsumerConnector consumer;
	private static String topic = "test";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public kafkaConsumerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() throws ServletException {
		System.out.println("kafkaConsumerServlet.init()");
		consumerService("localhost:2181", "testgroup2", topic);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	public  String consumerService(String zookeeper, String groupId,
			String topic) {

		Properties props = new Properties();
		props.put("zookeeper.connect", zookeeper);
		props.put("group.id", groupId);
		props.put("zookeeper.session.timeout.ms", "500");
		props.put("zookeeper.sync.time.ms", "250");
		props.put("auto.commit.interval.ms", "1000");

		consumer = Consumer.createJavaConsumerConnector(new ConsumerConfig(props));

		Map<String, Integer> topicCount = new HashMap<>();
		topicCount.put(topic, 1);
		String result = null;
		Map<String, List<KafkaStream<byte[], byte[]>>> consumerStreams = consumer
				.createMessageStreams(topicCount);
		List<KafkaStream<byte[], byte[]>> streams = consumerStreams.get(topic);
		for (final KafkaStream stream : streams) {
			ConsumerIterator<byte[], byte[]> it = stream.iterator();
			while (it.hasNext()) {

				result = new String(it.next().message());
				Client client = ClientBuilder.newClient();
				WebTarget webTarget = client
						.target("http://localhost:1111/SSEKafkaConsumer/rest/broadcast");
				Response response = webTarget.request().post(
						Entity.text(result));
				System.out.println(response.toString());

			}
		}
		if (consumer == null) {
			consumer.shutdown();
		}
		return result;
	}

}
