//SORRY AGAIN;;;;

import java.util.*;
import java.io.*;

public class Bronze{

    public static void main(String[] arjsfd){

	File f = new File("makelake.in");
       
	try{
	    Scanner sc = new Scanner(f);

	    while(sc.hasNextInt()){
		int i = sc.nextInt();
		//	System.out.println(i);
	    }

	    sc.close();
	} catch(FileNotFoundException e){
	    System.out.println("File not found");
	}

	System.out.println("342144, Period 6, Chang, Catherine");
    }

        
	
}
