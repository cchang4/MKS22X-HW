import java.util.*;
public class MyLinkedList<T> implements Iterable<T>{

    //Linked lists are made up of nodes, where each node contains a reference to the next node in the list
    //help from http://www.mycstutorials.com/articles/data_structures/linkedlists


    private class LNode{
	T data;
        LNode next;
	int value;

	public LNode(T thing){
	    data = thing;
	}


	public T getValue(){
	    return data;
	}

	public LNode getNext(){
	    return next;
	}

	public T setValue(T thing){
	    T old = data;
	    data = thing;
	    return old;
	}

	public void setNext(LNode n){
	    next = n;
	}
    }

    //variables
    LNode start;
    int size;
    
    //  methods:
   

    public T get(int index){
	//- get the value of the element at the specified index (0 based)

	if(index < 0 || index >= size()){throw new IndexOutOfBoundsException("index: " +index + " " + "size: " + size);}
	LNode p = start;

        while(index > 0){
	    p = p.getNext();
	    index--;
	}
	return p.getValue();
    }



 

    public T set(int index,T newValue) {
//- change the value of the element at the specified index to the newValue, return the old value

	if(index < 0 || index >= size()){throw new IndexOutOfBoundsException("index: " +index+ " " + "size: " + size);}
        T old = get(index);
	LNode p = start;


	while(index > 0){
	    p= p.getNext();
	    index--;
	}

	p.setValue(newValue);
	
	return old;

    }

   

    public int size(){
	//- return the number of elements in the list
	return size;
    }
    
    public T remove(int index){
	//- remove the element at the specified index, returns the value removed
	if(index < 0 || index >= size()){throw new IndexOutOfBoundsException("index: " +index + " " + "size: " + size);}
	

        T old = get(index);

	int i = 0;
	LNode p = start;

	while(i < index-1){
     	    p= p.getNext();
	    i++;
	}

	p.setNext(p.getNext().getNext());
	size -= 1;
	
	return old;
	
    }


    public boolean add(int index, T value){
	//- insert a new element at the specified index, 0 at the front, size() at the end.

	if(index < 0 || index > size()){throw new IndexOutOfBoundsException("index: " +index + " " + "size: " + size);}

	LNode p = start;
	LNode n = new LNode(value);
	int i = 0;


	if(i == 0){
	    temp.setNext(head);
	    head = temp;
	    if(size==0){
		tail = head;
	    }
	}else{ 
	    LNode p = getNth(index-1);
	    temp.setNext(p.getNext());
	    p.setNext(temp);
	    if(tail.getNext() != null){
		tail=tail.getNext();
	    }
	}
	size++;
	return true;
    }
   

    public boolean add(T value){
	// - adds to end

	if(start == null){
	    start = new LNode(value);
	}else{
	    LNode p = start;			
	    while(p.getNext()!=null){
		p = p.getNext();
	    }
	    p.setNext(new LNode(value));

	}
	size += 1;
	
	return true;
    }

    
    public int indexOf(T value){
	//- returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
	LNode p = start;
	int i = 0;
	int ans = -1;

	while(p != null){

	    if(p.getValue().equals(value)){
		ans = i;
	    }

	    i++;
	    p = p.getNext();

	}

	return ans;
    }
   

    public String toString() {
	//- returns a list formatted like: [ v1, v2, v3, ... vn-1, vn ]


	String ans = "[";
	LNode p = start;
	while(p != null){
	    ans += p.getValue();
	    if(p.getNext()!= null){
		ans += ", ";
	    }
	    p = p.getNext();
	}
	return ans + "]";
    }

    public String toString(boolean b){
	return "head" + " " + get(0)+ ", " + "tail" + " " + get(size()-1) + " " + toString();
    }
    
    public Iterator<T> iterator(){
	return new Iterator<T>(){
	    private LNode current = start;

	    public boolean hasNext(){
		return current != null;
	    }
	    public T next(){
		if(!hasNext()){
		    throw new NoSuchElementException();
		}
		T value = current.getValue();
		current = current.getNext();
		return value;
	    }
	    public void remove(){
		throw new UnsupportedOperationException();
	    }
	};
    
    }

    
    public static void main(String[]laksjdla){
	MyLinkedList<String> a = new MyLinkedList<String>();

	int i = 0;
	while(i < 10){
	    a.add("_");
	    i++;
	}
	a.add("lol");
	a.add("what is happen");
	a.add("merp");
	System.out.println(a.toString(true));
     	System.out.println(a);
	a.set(3, "haha");
       	System.out.println(a);
	a.remove(-1);
	System.out.println(a);
	System.out.println(a.size);
        a.add(13, "hmm");
	System.out.println(a);
	System.out.println(a.size);
	System.out.println(a.indexOf("hmm"));
    }
    

    
   
    
}
