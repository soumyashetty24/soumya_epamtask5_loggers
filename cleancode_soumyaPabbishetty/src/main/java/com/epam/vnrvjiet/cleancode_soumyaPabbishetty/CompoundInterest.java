package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundInterest {
	double principalAmount;
	double timePeriodInMonths;
	double rateOfInterest;
	int compoundedType;
	double totalAmount;
	double CompoundInterest=0;
	Scanner sc=new Scanner(System.in);
	private static final Logger objectoflog=LogManager.getLogger(CompoundInterest.class);
	void readInput()
	{
		objectoflog.info("Enter the Principal Amount:");
		 principalAmount=sc.nextInt();
		objectoflog.info("Enter the Time period in months:");
		 timePeriodInMonths=sc.nextInt();
		objectoflog.info("Enter the Rate of Interest(in %):");
		rateOfInterest=sc.nextInt();
		objectoflog.info("Select an option how amount is compounded:");
		objectoflog.info("\n1.Annually\n2.Half-Yearly\n3.Quarterly\n");
		compoundedType=sc.nextInt();
		
		
	 }
	void caluclateSimpleInterest()
	 {  if(compoundedType==1)
	    timePeriodInMonths=timePeriodInMonths/12;
	    else if(compoundedType==2)
		timePeriodInMonths=timePeriodInMonths/6;
     	else
		timePeriodInMonths=timePeriodInMonths/3;
	 
   totalAmount=(principalAmount*Math.pow(1+(rateOfInterest/100),timePeriodInMonths));
   CompoundInterest=(totalAmount-principalAmount);
       
		objectoflog.debug("CompoundInterest  :Rs."+CompoundInterest);
		objectoflog.debug("TotalAmount  :Rs."+ totalAmount+"\n");
		 
	 }
	

}
