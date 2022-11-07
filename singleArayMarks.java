package singleDimensional;

public class singleArayMarks {
	public static void main(String[] args) {
		// int marks[] =  new int [5];   // can also give like this way
		int marks [];  // creating array(symbol of array[]) with variable marks
		marks = new int [6];   // Memory is allocated with length 5 starts from 0,1,2,3,4,5
		
		marks[1]=20;    //assigning values for variable array marks
		marks[2]=10;    // for array length mark[0],mark[6] the value is not initiated but memory allocated with default value 0
		marks[3]=40;
		marks[4]=30;   
		                          
		System.out.println(marks[0]);       //at length 0 value not assign so default value 0 displays   
		System.out.println(marks[2]);       //at length 1 value 10 is assigned so the assigned value 10 displays
		System.out.println(marks[1]);       //at length 2 value 20 is assigned so the assigned value 20 displays
		System.out.println(marks[4]);       //at length 3 value 30 is assigned so the assigned value 30 displays
		System.out.println(marks[3]);       //at length 4 value 40 is assigned so the assigned value 40 displays
		System.out.println(marks[5]);       //at length 5 value not assign so default value 0 displays
	}
}
