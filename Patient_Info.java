package buffer4;
import java.util.*;

public class Patient_Info {
	Scanner sc =new Scanner(System.in);
	Node head;
	class Node{
	int record;
	String name;
	int age;
	int gender;
	float weight;
	int bloodgrp;
	     
	     Node next;
	     int Bedno;
	     public Node( int record,String name,int age,int gender,float weight,int bloodgrp) {
	    super();
	    this.record=record;
	    this.name= name;
	       this.age=age;
	       this.gender=gender;
	       this.weight=weight;
	       this.bloodgrp=bloodgrp;
	       this.next=null;
	     }
	 
	}
	public Patient_Info Addnode(Patient_Info List,int record,String name,int age,int gender,float weight,int bloodgrp) {
	Scanner sc1=new Scanner(System.in);
	Node curr_node=null;
	int Bedno=0;
	Node new_node = new Node(record, name, age,gender, weight, bloodgrp);
	new_node.next=null;
	if(List.head==null) {
	List.head=new_node;
	}
	else {
	curr_node =List.head;
	while(curr_node.next !=null) {
	curr_node = curr_node.next;
	}
	curr_node.next = new_node;
	}
	System.out.println("-----------***********PATIENT DETAILS************------------");
	curr_node = List.head;
	while(curr_node!=null) {
	System.out.println("RecordNo:" +curr_node.record);
	System.out.println("Name:" +curr_node.name);
	System.out.println("Age:" +curr_node.age);
	System.out.println("Gender:" +curr_node.gender);
	System.out.println("Weight:" +curr_node.weight);
	System.out.println("Bloodgroup:" +curr_node.bloodgrp);
	
	 curr_node.next;
	}
	
	return List;
	}
	public Patient_Info DeleteNode(Patient_Info List,int Bedno)//more precisely bedno likh
	{
	Scanner sc2 = new Scanner(System.in);
	Node curr_node;
	Node temp;
	int key=0;
	if(List.head==null) {
	System.out.println("List is EMPTY !!");
	}
	else {
	System.out.println("Enter the bedno to be free :");
	key=sc2.nextInt();
	if(key == List.head.Bedno && List.head.next == null) {
	System.out.println("List has only one element !");
	List.head = null;
	System.out.println("Have a nice day:)");
	}
	else if(key == List.head.Bedno && List.head.next != null) {
	temp =List.head;
	List.head = temp.next;
	temp = null;
	}
	else {
	curr_node = List.head;
	while(curr_node.next != null && key!=curr_node.next.Bedno) {
	curr_node = curr_node.next;
	}
	temp = curr_node.next;
	if(temp.next == null) {
	   curr_node.next = null;
	}
	else {
	curr_node.next = temp.next;
	temp.next = null;
	temp = null;
	}
	}
	}
	return List;
}}


