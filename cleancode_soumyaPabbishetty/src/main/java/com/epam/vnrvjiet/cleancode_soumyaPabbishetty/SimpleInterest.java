package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleInterest {
	double principalAmount;
	double timePeriodInMonths;
	double rateOfInterest;
	double simpleInterest=0;
	double totalAmount=0;
	Scanner sc=new Scanner(System.in);
	private static final Logger objectoflog=LogManager.getLogger(SimpleInterest.class);
	void readInput()
	{
		objectoflog.info("Enter the Principal Amount:");
		 principalAmount=sc.nextInt();
		 objectoflog.info("Enter the Time period in months:");
		 timePeriodInMonths=sc.nextInt();
		 objectoflog.info("Enter the Rate of Interest(in %):");
		rateOfInterest=sc.nextInt();
		
	 }
	void caluclateSimpleInterest()
	{
		
		timePeriodInMonths=timePeriodInMonths/12;
	
		
		simpleInterest=(principalAmount*timePeriodInMonths*rateOfInterest)/100;
		totalAmount=(principalAmount+simpleInterest);
		
	   objectoflog.debug("SimpleInterest : Rs."+simpleInterest);
       objectoflog.debug("Total amount to be paid including interest : Rs."+totalAmount+"\n");
	
		 
	 }
	

}
