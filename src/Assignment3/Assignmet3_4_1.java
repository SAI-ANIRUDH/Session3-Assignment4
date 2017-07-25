package Assignment3; // Declaring of the package is compulsory.

public class Assignmet3_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s2= new Student(); // Initializing the student class.
		  
	      s2.set("Ani",96325,86,'A'); // Calling the parameterized constructor Student 
	      s2.get(); //Using getters 
	      StudentResultProcesing s1=new StudentResultProcesing(); // Initializing the Class StudentResult Processing  
	      System.out.println(s1.result(45,60,50,3665)); // Calling and printing the result of s1 instance.
	}

}
class Student 
{
 String name; //Declaring the name variable.
private int phone_number; // Delaring the private variable Phone number
private int roll_number; // Declaring the priate variable roll number.
private char section; // Declaring the private variable secion.
int math,science,social; // Declaring the variables of marks math, science, social.
public void set(String n,int i,int j,char k) // Decalring the void parameterized method 
{ 
  name=n;
   phone_number=i;
   roll_number=j;
   section=k;
} 
public void get() // Using Getter method
{
  System.out.println("Name "+ name+'\n'+"phone number "+phone_number+'\n'+"roll number "+roll_number+'\n'+"class "+section+'\n');
}
  String result(int i,int j,int k,int l)
  {
   math=i;
   science=j;
   social=k;
   roll_number=l;

   if(((i+j+k)/3)>50) // Invoking conditions to find average of the marks.
     { 
	  return "pass";
     }
    else
    {
    return "fail";	
     }
  }
}
class StudentResultProcesing extends Student // Creating child class.
{
	
}
