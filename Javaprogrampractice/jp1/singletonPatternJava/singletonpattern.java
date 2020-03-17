package singletonPatternJava;

//Java program implementing Singleton class
//with getInstance() method
class singletonc
{
	
 // static variable single_instance of type Singleton
 private static singletonc single_instance = null;

 // variable of type String
 public String s;

 // private constructor restricted to this class itself
 private singletonc()
 {
     s = "Hello I am a string part of Singleton class";
 }

 // static method to create instance of Singleton class
 public static singletonc getInstance()
 {
     if (single_instance == null)
         single_instance = new singletonc();

     return single_instance;
 }
}

//Driver Class
public class singletonpattern
{
 public static void main(String args[])
 {
     // instantiating Singleton class with variable x
	 singletonc x = singletonc.getInstance();

     // instantiating Singleton class with variable y
	 singletonc y = singletonc.getInstance();

     // instantiating Singleton class with variable z
	 singletonc z = singletonc.getInstance();

     // changing variable of instance x
     x.s = (x.s).toUpperCase();

     System.out.println("String from x is " + x.s);
     System.out.println("String from y is " + y.s);
     System.out.println("String from z is " + z.s);
     System.out.println("\n");

     // changing variable of instance z
     z.s = (z.s).toLowerCase();

     System.out.println("String from x is " + x.s);
     System.out.println("String from y is " + y.s);
     System.out.println("String from z is " + z.s);
 }
}