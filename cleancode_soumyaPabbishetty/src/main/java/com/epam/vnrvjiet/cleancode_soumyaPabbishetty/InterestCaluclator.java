package com.epam.vnrvjiet.cleancode_soumyaPabbishetty;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class InterestCaluclator {
	private static final Logger objectoflog=LogManager.getLogger(InterestCaluclator.class);
	public static void main(String args[])
	{   
		Scanner sc=new Scanner(System.in);
		
		int doYouContinue=1;

		do {
		objectoflog.info("What do you want us to caluclate!!");
		objectoflog.info("1.SimpleInterest\t2.CompoundInterest");
		int interestType=sc.nextInt();
		
			switch(interestType)
			{
			case 1:SimpleInterest si=new SimpleInterest();
			       si.readInput();
			       si.caluclateSimpleInterest();break;
			case 2:CompoundInterest ci=new CompoundInterest();
			       ci.readInput();
			       ci.caluclateSimpleInterest();break;
			       
			   default:objectoflog.error("You can select only 2 choices(1/2)");
			}
			
			objectoflog.info("Do you want to Continue enter( 1 for yes/0 for no):");
			
			doYouContinue=sc.nextInt();
		
		       
		    
		
		
		}while(doYouContinue==1);
	
		sc.close();
	}
	

}
