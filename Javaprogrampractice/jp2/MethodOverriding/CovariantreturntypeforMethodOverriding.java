package MethodOverriding;

class A1{  
	A1 get(){
		return this;
		}  
	} 
		  
	public class CovariantreturntypeforMethodOverriding extends A1{  
			@Override
			CovariantreturntypeforMethodOverriding get(){
				return this;
				}  
			
		void message(){
			System.out.println("welcome to covariant return type");
			}  
		  
		public static void main(String args[]){  
			
		new CovariantreturntypeforMethodOverriding().get().message();  
		}  
		}  

