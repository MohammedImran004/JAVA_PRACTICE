// Java program to demonstrate the 
// real-world example of Interfaces

import java.io.*;

interface Vehicle {
	
    void add();
}
 interface  car{
 void sub();
    
}

class Bicycle implements Vehicle,car{
	
	public void add(){
        System.out.println("Bike added");
    }
    public void sub(){
        System.out.println("Bike removed");
    }
	
}
class rocket implements Vehicle{
	
	public void add(){
        System.out.println("rocket added");
    }
    
}
public class GFG {
	
	public static void main (String[] args) {
	
		
		rocket bicycle = new rocket();
		bicycle.add();
        
	}
}
