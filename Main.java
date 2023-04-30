package buffer4;
import java.util.*;
import buffer4.Patient_Info;
import buffer4.Bed;
import buffer4.Hospital;
import buffer4.Resource_Man;
public class Main {
public static void main(String []args) {
	Scanner sc= new Scanner(System.in);
	int ch=0;
	int och=0;
	Hospital h = new Hospital();
	Patient_Info p = new Patient_Info();
	Bed b = new Bed();
	Resource_Man rm = new Resource_Man();
	h.displayName();
	System.out.println("----------------------------------------------");
    System.out.println("The available Resources and their Quantity:");
	System.out.println(" Resources               Quantity");
	 //System.out.println(".Oxygen_Cylinder\n1.Ventilator\n2.Surgery_Kit\n3.Patient_Monitor\n4.Cotton_balls_pack\n5.Dialysis_Machine\n6.Wheel_Chair\n7.Blood_Pressure_Monitor");
	 System.out.println("0.Oxygen_Cylinder         15");
	 System.out.println("1.Ventilator              20");
	 System.out.println("2.Surgery_Kit             25");
	 System.out.println("3.Patient_Monitor         30");
	 System.out.println("4.Cotton_balls_pack       10");
	 System.out.println("5.Dialysis_Machine        15");
	 System.out.println("6.Wheel_Chair             20");
	 System.out.println("7.Blood_Pressure_Monitor  10");
	 System.out.println("----------------------------------------------");


	do
	{
		System.out.println("Enter the record no:");
		int  record=sc.nextInt();
		
		System.out.println("Enter the name of Patient:");
		String name=sc.next();
		
		System.out.println("Enter the age of Patient:");
		int age=sc.nextInt();
		
		System.out.println("Enter the weight of Patient:");
		float weight=sc.nextFloat();
		
		System.out.println("Enter the gender of Patient: 1.Male\t 2.Female\t 3.Other");
		int gender=sc.nextInt();
		
		System.out.println("Enter the bloodgrp of Patient: 1.A+\t 2.B+\t 3.O+\t 4.AB+\t 5.A-\t 6.B-\t 7.O-\t 8.AB-");
		int bloodgrp=sc.nextInt();
		
		p.Addnode(p,record,name,age,gender,weight,bloodgrp);
		
		System.out.println("----------------------------------------------");
		
		System.out.println("Bed alloted is:"+b.BedAllotment(record));
		
		System.out.println("----------------------------------------------");
		
		
		do
		{
			
            rm.addRequirement();
			System.out.println("Do you want more resources?\n1.Yes\n2.No");
		    och=sc.nextInt();
		    
		}while(och!=2);
	   double total= rm.computeSubTotal();
	   System.out.println("Total no. of Resources used by Patient: "+total);
	   
	   System.out.println("------------------------------------------------");
	   
	  
	   System.out.println("\nAre there more Patients?\n1.Yes\n2.No");
	   ch=sc.nextInt();
	}while(ch!=2);
	System.out.println("----------------------------------------------");
	System.out.println("Stay Healthy ,Stay Safe!!!");
	System.out.println("----------------------------------------------");
}
}
