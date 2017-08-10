package com.syn.basic;

public class TestExamplePojo {
	/*public void pojoValues(){
	ExamplePojo ep=new ExamplePojo();
	ep.setAge(10);
	ep.setPhonenumber(642648924);
	ep.setSname("madhu sudhan reddy");
	}*/
	public static void main(String[] args) {
		
		TestExamplePojo txp=new TestExamplePojo();
		//txp.pojoValues();
		ExamplePojo ep=new ExamplePojo();
		ep.setPhonenumber(642648924);
		ep.setSname("madhu sudhan reddy");
		ep.setAge(20);
		System.out.println("the student age is:"+ep.getAge());
		System.out.println("the student phone number  is:"+ep.getPhonenumber());
		System.out.println("the student Sudent name is is:"+ep.getSname());
		System.out.println("the pojo class oblect vlaue is:"+ep);
		
	}

}
