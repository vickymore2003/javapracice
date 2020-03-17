package com.ObjectClonning;

public class Object_Clonning_Implementation implements Cloneable {

	int id;
	String name;
	
	public Object_Clonning_Implementation(int id,String name){
		
		this.id=id;
		this.name=name;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
	
	public static void main(String[] args) throws CloneNotSupportedException  {
		
		Object_Clonning_Implementation ob1=new Object_Clonning_Implementation(11,"Sachin");
		
		
		Object_Clonning_Implementation ob2=(Object_Clonning_Implementation) ob1.clone();
		System.out.println("id:="+ob1.id);
		System.out.println("name:="+ob1.name);
		System.out.println(ob2.toString());
		System.out.println("id:="+ob2.id);
		System.out.println("name:="+ob2.name);
		System.out.println(ob1.equals(ob2));

		System.out.println(ob1==ob2);
	}
	
	
	
}
