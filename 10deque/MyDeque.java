import java.util.*;

public class MyDeque<T>{

    //  0. You need a private method to grow the array and copy over the values.

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

}
