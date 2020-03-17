package exceptionhandlin;


	
	public class exceptionhandl
	{
		
		public static String  hello(){
			try{
				System.out.println("j");
				System.exit(0);
				return "s";
				
			}catch(Exception e){
			
			return "sachi6n";
			}
			finally{
				
			  System.out.println("1");
			  //return "ssa";
			}
			//return "sachin";
		}
	    public static void main(String[] args)
	    {  try
           {
	    	String s=hello();
	       System.out.println("s"+s);
	            System.out.printf("31");
	            int data = 5 / 0;
	        }
	        catch(ArithmeticException e)
	        {
	            Throwable obj = new Throwable("Sample");
	            try
	            {
	            	
	                throw obj;
	                
	            } 
	            catch (Throwable e1) 
	            {
	                System.out.printf("8");
	              
	            }
	        }
	        finally
	        {
	            System.out.printf("3");
	        }
	        System.out.printf("4");
	    }
	
}
