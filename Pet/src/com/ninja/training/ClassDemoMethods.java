package com.ninja.training;

//import homework.Classdemo;

public class ClassDemoMethods {

	//public static void main(String[] args) {


	private String name;
	private double area;
	private int noOfRooms;
	private int noOfFloors;

	ClassDemoMethods(){
		name="";
		area=0.0;
		noOfRooms=0;
		noOfFloors=0;
	}

	ClassDemoMethods(String n,double a, int r,int f){
		name=n;
		area=a;
		noOfRooms=r;
		noOfFloors=f;
	}

	public void setName(String homeName) {
		name=homeName;
	}

	public void setArea(double homeArea) {
		area=homeArea;
	}

	public void setRooms(int rooms) {
		noOfRooms=rooms;
	}

	public void setFloors(int floors) {
		noOfFloors=floors;
	}

	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public int getRooms() {
		return noOfRooms;
	}

	public int getFloors() {
		return noOfFloors;
	}

	public void cleanUp() {
		System.out.println(name +" is cleaned!!");
	}

	public void paintIt() {
		System.out.println(name+" is painted!!");
	}





	//class DemoHome {

	public static void main(String[] args) {

		// Create an object of class Home
		ClassDemoMethods home1=new ClassDemoMethods();

		//Set the values of the instance variables	
		home1.setName("The Barn");
		home1.setArea(3000);
		home1.setRooms(5);
		home1.setFloors(2);

		System.out.println("Home Details:");
		System.out.println("Name: "+home1.getName());
		System.out.println("Area: "+home1.getArea());
		System.out.println("No. of rooms: " +home1.getRooms());
		System.out.println("No. of Floors: "+home1.getFloors());
		System.out.println("-----------------------------------");

		//Create another object of class Home 
		ClassDemoMethods home2=new ClassDemoMethods();
		home2.setName("The BrickHouse");
		home2.setArea(2000);
		home2.setRooms(3);
		home2.setFloors(1);

		System.out.println("Home Details:");
		System.out.println("Name: "+home2.getName());
		System.out.println("Area: "+home2.getArea());
		System.out.println("No. of rooms: " +home2.getRooms());
		System.out.println("No. of Floors: "+home2.getFloors());
		System.out.println("-------------------------------------");

		home1.cleanUp();
		home2.paintIt();

	}




}


