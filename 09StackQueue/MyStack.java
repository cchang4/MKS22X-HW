import java.util.*;
public class MyStack<T>{

     MyLinkedList<T> data;
    
    public MyStack(){
	data = new MyLinkedList<T>();
    }


    /**
     * Adds the given item to the top of the stack.
     */
    public void push(T item){
       data.add(0, item);
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop(){
	if(data.size == 0){ throw new NoSuchElementException();};
	T ans = data.get(0);
	data.remove(0);
	return ans;
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek(){
	if(data.size == 0){ throw new NoSuchElementException();};
	return data.get(0);
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size(){
	return data.size;
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty(){
	if(size()> 0){
	    return false;
	}
	
	return true;
    }

    public String toString(){
	return data.toString();
    }
   
    public static void main(String[]asdsad){
        MyStack<String> m = new MyStack<String>();
	Stack<String> n = new Stack<String>();


	m.push("hi");
	n.push("hi");
	m.push("asd");
	n.push("asd");
	
	System.out.println(m);
	System.out.println(m.size());
	System.out.println("built in: " + n);

	System.out.println(m.pop());

	System.out.println(m);
	System.out.println(m.size());     
    }
    

}
   
