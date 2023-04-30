package buffer4;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Resource_Man {
	private Patient_Info patientInfo;
    private double subTotal;
   // private double ReAvNow;

PriorityQueue<String> resource = new PriorityQueue<>();
ArrayList<Integer> Quantity = new ArrayList<>();

Scanner inp = new Scanner(System.in);
int a[]= new int [] {
		15,20,25,30,10,15,20,10
};


public void addRequirement() {

System.out.println("Enter  the Resources you require : ");
int  ch = inp.nextInt();


switch(ch) {

case 0:
	resource.add("Oxygen_Cylinder");//changed the name Resources_Man to resource
    Quantity.add(1);
    a[ch]--;
    break;

case 1:
   resource.add("Ventilator");
   Quantity.add(1);
   // len(x)-1
   a[ch]= a[ch]-1;
break;

 case 2:
 resource.add("Surgery_Kit");
Quantity.add(1);
a[ch]--;
break;

case 3:
resource.add("Patient_Monitor");
Quantity.add(1);
a[ch]--;
break;

case 4:
resource.add("Cotton_balls_pack");
Quantity.add(1);
a[ch]--;
break;

case 5:
resource.add("Dialysis_Machine");
//System.out.print("How many surgery cloths kit you want:");
//int x2 =inp.nextInt();
Quantity.add(1);
a[ch]--;

break;

case 6:
resource.add("Wheel_Chair");
Quantity.add(1);
a[ch]--;
break;

case 7:
resource.add("Blood_Pressure_Monitor");
Quantity.add(1);
a[ch]--;
break;
}
System.out.println("Your resources: "+resource);
System.out.println("No_of_euipments : "+Quantity);
System.out.println("The available Resources and their Quantity:");
System.out.println(" Resources               Quantity");
 //System.out.println(".Oxygen_Cylinder\n1.Ventilator\n2.Surgery_Kit\n3.Patient_Monitor\n4.Cotton_balls_pack\n5.Dialysis_Machine\n6.Wheel_Chair\n7.Blood_Pressure_Monitor");
 System.out.println("0.Oxygen_Cylinder        "+a[0]);
 System.out.println("1.Ventilator             "+a[1]);
 System.out.println("2.Surgery_Kit            "+a[2]);
 System.out.println("3.Patient_Monitor        "+a[3]);
 System.out.println("4.Cotton_balls_pack      "+a[4]);
 System.out.println("5.Dialysis_Machine       "+a[5]);
 System.out.println("6.Wheel_Chair            "+a[6]);
 System.out.println("7.Blood_Pressure_Monitor "+a[7]);
}

public ArrayList<Integer> getQuantity() {
return Quantity;
}
public double computeSubTotal() {
for(int i=0 ; i<this. Quantity.size();i++) {
this.subTotal =this.subTotal + this. Quantity.get(i);
}
return this.subTotal;
}
public void removeResource()
{
	resource.clear();
	Quantity.clear();
	this.subTotal=0;
}
  public double getSubTotal()
  {
	  return subTotal;
  }
	 

 
 
}

