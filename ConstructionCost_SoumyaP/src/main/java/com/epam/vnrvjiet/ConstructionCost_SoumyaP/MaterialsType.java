package com.epam.vnrvjiet.ConstructionCost_SoumyaP;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MaterialsType {
	private static final Logger objectoflog=LogManager.getLogger(MaterialsType.class);
	Scanner sc=new Scanner(System.in);
	
	public int MaterialCost() {
	int costArray[]= {1200,1500,1800,2300};
	objectoflog.info("Select the specification from the following options:");
	objectoflog.info("\n1.Standard Material:INR 1200/- only\n2.Above Standard Material:INR 1500/- only\n3.High Standard Material:INR 1800/- only\n4.High Standard Material and Fully Automated Home:INR 2500/- only\n");
	int materialType;
	materialType=sc.nextInt();
	return costArray[materialType-1];
   
	}

}
