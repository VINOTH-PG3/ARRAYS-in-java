package singleDimensional;

import java.util.Scanner;

public class singleArrayEx2 {
private static Scanner user;

public static void main(String[] args) {
	int rows; 
	System.out.println("Enter array Size");
	user = new Scanner(System.in);
	rows=user.nextInt();
	
	int ary[]= new int[rows];
	System.out.println("Enter Elements");
	for(int j=0;j<rows;j++){
		ary[j]=user.nextInt();
		}
	
	System.out.println("Entered elements are");
	for (int xy:ary){
		
		System.out.println(xy);
	}
}
}
