public class MyStack<T>{

    MyLinkedList m = new MyLinkedList<T>();

    /**
     * Adds the given item to the top of the stack.
     */
    void push(T item){

	m.add(0, item);

    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T pop(){
	T ans = m.get(0);
	m.remove(0);
	return ans;

    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek(){

    }

    /**
     * Returns the number of items currently in the stack.
     */
    int size(){
	return 0;
    }

    /**
     * Returns whether the stack is empty or not.
     */
    boolean isEmpty(){
	return true;
    }
}
