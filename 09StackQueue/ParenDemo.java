import java.util.*;
public class ParenDemo{
    //gggggg
    //aghh will work on laterrr

    public static boolean isMatching(String s){
	MyStack<Character> openparens = new MyStack<Character>();
	for(char next: s.toCharArray()){
	    if (next == '(' || next == '[' || next == '<' || next == '{'){
		char WhatShouldBeOnStack = getMatch(next);
	    }
	}
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
}
