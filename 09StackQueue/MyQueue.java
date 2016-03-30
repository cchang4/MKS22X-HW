import java.util.*;
public class MyQueue<T>{

    MyLinkedList<T> data;

    /**
     * Adds the given item to the rear of the queue.
     */
    public void enqueue(T item){
	data.add(size()-1, item);
    }

    /**
     * Removes the front item from the queue and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T dequeue(){
	if(size() == 0){ throw new NoSuchElementException();};

	T ans = data.get(0);
	data.remove(0);
	return ans;	
    }

    /**
     * Returns the front item from the queue without popping it.
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


}
