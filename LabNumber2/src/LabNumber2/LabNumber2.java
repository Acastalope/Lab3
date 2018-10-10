package LabNumber2;
import java.util.Scanner;
public class LabNumber2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter length in meters: ");
		double length = sc.nextDouble();
	
		System.out.println("Enter width in meters: ");
		double width = sc.nextDouble();
	
		double area = length * width; 
		System.out.println("Area of the room is " + area + " meters.");
		
		double perimeter = 2*length + 2*width;
		System.out.println("Perimeter of the room is " + perimeter + " meters.");
	

	
		}
	
	
	

	}
