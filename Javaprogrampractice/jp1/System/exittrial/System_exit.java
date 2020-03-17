package System.exittrial;

import java.sql.SQLException;

class sachin extends System_exit{
	
   protected static void show() throws SQLException{
		
		System.out.println("sachin class show");
	}
	
}

public class System_exit {

	protected static void show() throws SQLException{
		
		System.out.println("system class show");
	}
	
	
	
	public static void main(String[] args) {
		
		try{
			
			show();
			System.out.println(1/0);
			//System.exit(0);
			//System.exit(-199);
			//return ;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			String s=null;
			try{
			if(s.equals("a")){
				
				System.out.println("a");
			}
			}catch(Exception e1){
				
				System.out.println(e1.getMessage());
			}
			//return ;
		}
		finally{
			
			System.out.println("i m in finally");
		}
		
		
		
	}
}
