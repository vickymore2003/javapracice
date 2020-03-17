package QuizsProrams;

class student_ {
	
	// understanding parent child relation rules .implemntqation for contructor and inheritance undertanding
	
	
	// rule 1 : if parent has a parametrized constructor then child class must have paramterized and call to super class constructor.
	// rule 2: if parent class has default constructor means no argument constructor then  child class need to call parent class consctructor or 
	// no need to write constructor
	//rule 3. if parent class has a both paramterized and default construcor then no need to mandtory write a paramterized consttructor in child class
	// rule 4 : if parent class has more than 1 parametreized constructor then mandrory to write one paramterized constructor in child class 
	// who must have call any one parent class parameterized constuctor 
	
	
	
	int id;
	String name;
	student_(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	student_(int id,String name,String cls,String fathername){
		
		this.id=id;
	}
	/*
	student_(){
		
		
	}
	*/
	
}



public class InterfaceorParent_child_implementation_rules extends student_ {

	InterfaceorParent_child_implementation_rules(int id, String name, String cls, String fathername) {
		super(id, name, cls, fathername);
		// TODO Auto-generated constructor stub
	}


	
	/*
	InterfaceorParent_child_implementation_rules(int id, String name,String childname) {
		super(id, name);
		// TODO Auto-generated constructor stub
		childname=name;
		
	}
	*/
	



}




