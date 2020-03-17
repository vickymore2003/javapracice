package numberofspaceinstring;

public class Numberofspaceinstring {

	public static void main(String[] args) {
		
		String str=" sachin sahebrao funde walunj";
		
		String whitespaces[]=str.split(" ");
		
		int whitespace=whitespaces.length-1 ;
		
       System.out.println("no of whitespaces:: " +whitespace);	
       
       char ch[]=str.toCharArray();
       int whitespacescount=0;
       for(int i=0;i<ch.length;i++){
       boolean status=Character.isWhitespace(ch[i]);
             if(status==true){
            	 whitespacescount=whitespacescount+1;
             }
       }
       System.out.println("no of whitesapces using other method :="+ whitespacescount);
       
	}
	
	
}
