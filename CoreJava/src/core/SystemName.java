package core;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemName {
public static void main(String[] args) throws UnknownHostException {
	InetAddress localMachine = InetAddress.getLocalHost();
	System.out.println("Hostname of local machine: " + localMachine.getHostName());
	System.out.println(System.getenv("COMPUTERNAME"));
}
}
