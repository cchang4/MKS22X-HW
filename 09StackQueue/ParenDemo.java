public class ParenDemo{
    //gggggg

    public static boolean isMatching(String s){
	return true;    
    }

    public static char getMatch(char c){
	return '.';
    }

    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println( isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
    }
