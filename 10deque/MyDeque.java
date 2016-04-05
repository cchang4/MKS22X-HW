import java.util.*;

public class MyDeque<T>{


    private T[] data;

    @SuppressWarnings("unchecked")	

	public MyDeque(){
	data = (T[]) new Object[10];

    }

    public void add(T n){
	data[0]=n;
    }

    public T get(){
	
	return data[0];
    }

    //  0. You need a private method to grow the array and copy over the values.
 
  @SuppressWarnings("unchecked")	
    private void grow(){

    }

    //	There are 6 public methods:

    public void addFirst(T value){

    }
    
    public void addLast(T value){
	//	-When the array is full, re-size, then add. 
	//	-No exceptions are required since you will re-size.

    }


    public T removeFirst(){

	

    }  
    
    public T removeLast(){  
	//	-NoSuchElementException is thrown when there are no elements.
    } 

    public T getFirst(){

    }

    public T getLast(){
	//	-NoSuchElementException is thrown when there are no elements. 

    }

    public String toString(){
	return ".";
    }

    public static void main(String[]args){
        MyDeque<String> x = new MyDeque<String>();
	x.add("fish");
	System.out.println(x.get());
    }

}

