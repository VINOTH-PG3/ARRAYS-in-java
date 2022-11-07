package singleDimensional;

public class singleEx1 {
public static void main(String[] args) {
	        // arrays symbol is [].And its used  to give multiple values in single variable
	int num[]={10,20,30,40};                       // Variables can be assigned and initialize values in one way
	     for (int j=0;j<4;j++)                     // by loop we can print variable and get all initialized value
		     System.out.println(num[j]);
	   
	     
	     System.out.println("      TRYING ANOTHER WAY WITH STRING");
	    // in other way of initialization and printing
	    	String ruleS[]=new  String[5];        // Sting variable is assigned and initialized
	    	
	    	 ruleS[0]="wake up yearly";          // Initializing values in string
	    	 ruleS[1]="Complete your morning routine";
	    	 ruleS[2]="Eat morning at 8.00 to 9.00 am";
	    	 ruleS[3]="GO to work fallow the rules and regulations";
	    	 ruleS[4]="Return home before 8.00 pm";
	    	 
	    	 System.out.println(ruleS[0]);
	    	 System.out.println(ruleS[1]);
	    	 System.out.println(ruleS[2]);
	    	 System.out.println(ruleS[3]);
	    	 System.out.println(ruleS[4]);

}
}

