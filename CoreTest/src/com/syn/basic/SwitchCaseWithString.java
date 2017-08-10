package com.syn.basic;


public class SwitchCaseWithString {

	public String getComanieslevel(String level){
		String cmLevel = null;
		switch(level){
		case "CMM Level 0":
			cmLevel="CMM – Level 0 companies are the ones, which do not have any structured Processes, Tracking Mechanisms & Plans. It is left to the developer or any person responsible for Quality to ensure that the product meets the expectations.";
			System.out.println("CMM Level 0 Done :"+cmLevel);
		break;
		case "CMM Level 1":
			cmLevel="Work is Performed Informally ";
			System.out.println("CMM Level 1 Done :"+cmLevel);

			break;
		case "CMM Level 2":
			cmLevel="CMM – Level 2 companies are the ones, which follow two main guidelines like 1) Defined guidelines 2) Focus on reusability. These companies have some planned processes within the teams and the teams are made to repeat them or follow these processes for all projects being handled by them. However these process are not standardized across the organization. All the teams within the organization do not follow the same standard.";
			System.out.println("CMM Level 2 Done :"+cmLevel);

			break;
		case "CMM Level 3":
			cmLevel="CMM – Level 3 companies are the ones, where the processes are well defined and are followed throughout the organization. Such companies have strong team, well-defined guidelines, Focus on reusability & lay major focus on documentation.";
			System.out.println("CMM Level 3 Done :"+cmLevel);

			break;
		case "CMM Level 4":
			cmLevel="CMM – Level 4 companies are the ones, where the processes are well defined and are followed throughout the organization. In such companies, Goals to be achieved are well defined and the actual output is measured. Such companies have proper mechanism to collect the Metrics to measure each and every work in the organization, hence future performance can predicted.";
			System.out.println("CMM Level 4 Done :"+cmLevel);

			break;
		case "CMM Level 5":
			cmLevel="CMM – Level 5 companies are the ones, which have well defined processes, which are properly measured. Such organizations have good understanding of IT projects which have good effect on the Organizational goals. Level – 5 organizations lay major emphasis on Research and development & are able to continuously improve their processes.";
			System.out.println("CMM Level 5 Done :"+cmLevel);

			break;
		default:
            //throw new IllegalArgumentException("This is invalid level: " + level);
            System.out.println("this is invalid level::please try correct level" );
            break;
		
		}
		return cmLevel;
		
		
	}
	public static void main(String[] args) {
		SwitchCaseWithString sc=new SwitchCaseWithString();
		//sc.getComanieslevel("CMM Level 10");
		sc.getComanieslevel("CMM Level 0");
		sc.getComanieslevel("CMM Level 1");
		sc.getComanieslevel("CMM Level 2");
		sc.getComanieslevel("CMM Level 3");
		sc.getComanieslevel("CMM Level 4");
		sc.getComanieslevel("CMM Level 5");
		sc.getComanieslevel("CMM Level 10");
	}
}
