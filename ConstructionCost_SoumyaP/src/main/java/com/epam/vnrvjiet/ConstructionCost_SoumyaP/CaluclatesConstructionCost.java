package com.epam.vnrvjiet.ConstructionCost_SoumyaP;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CaluclatesConstructionCost {
	
	
	private static final Logger objectoflog=LogManager.getLogger(CaluclatesConstructionCost.class);
	
	public static void main(String args[])
	{ 
		double landArea;
	    long costOfMaterial;
	    
	    Scanner sc=new Scanner(System.in);
		objectoflog.info("Enter land size in(sq yards):");
		landArea=sc.nextInt();
		
		objectoflog.info("Select the type of Materials:");
		
		MaterialsType materialsTypeObject = new MaterialsType();
		costOfMaterial=materialsTypeObject.MaterialCost();
		objectoflog.debug("The Total Cost To Construct Your Land With your Specification is INR: "+(costOfMaterial*landArea)+"/-");
		sc.close();
	}
	
}
