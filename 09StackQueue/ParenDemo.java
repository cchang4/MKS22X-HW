public class ParenDemo{

    //NEED TO FINISH LATER STILL NEED TO CHECK IF THE OTHER THINGS WORK

    public static boolean isMatching(String s){
	return true;    
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
