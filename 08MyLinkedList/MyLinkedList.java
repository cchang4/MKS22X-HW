public class MyLinkedList<T>{

    //Linked lists are made up of nodes, where each node contains a reference to the next node in the list
    //help from http://www.mycstutorials.com/articles/data_structures/linkedlists


    private class LNode<T>{
        LNode next;
	int value;

	public LNode(int cv){
	    value = cv;
	}

	public int getValue(){
	    return value;
	}

	public LNode getNext(){
	    return next;
	}

	public void setValue(int cv){
	    value = cv;
	}

	public void setNext(LNode n){
	    next = n;
	}
    }

    //variables
    LNode start;
    int size;
    
    //  methods:
   

    public int get(int index){
	//- get the value of the element at the specified index (0 based)
	int i = 0;
	LNode p = start;

	while(i < index){
	    p= p.getNext();
	    i++;
	}
	return p.getValue();
    }

 

    public int set(int index,int newValue) {
//- change the value of the element at the specified index to the newValue, return the old value
	int old = get(index);

	int i = 0;
	LNode p = start;

	while(i < index){
	    p= p.getNext();
	    i++;
	}

	p.setValue(newValue);
	
	return old;

    }

   

    public int size(){
	//- return the number of elements in the list
	return size;
    }
    
    public int remove(int index){
	//- remove the element at the specified index, returns the value removed
	size -= 1;

	int old = get(index);

	int i = 0;
	LNode p = start;

	while(i < index){
	    p= p.getNext();
	    i++;
	}

	p.setNext(p.getNext().getNext());
	
	return old;
	
    }


    public boolean add(int index, int value){
	//- insert a new element at the specified index, 0 at the front, size() at the end.


	LNode p = start;
	LNode n = new LNode<T>(value);
	int i = 0;

	while(p.getNext() != null){
	    i++;
	    p = p.getNext();
	    if(i == index -1){
		n.setNext(p.getNext());
		p.setNext(n);
		
	    }


	}
	size += 1;
	return true;
    }
   

    public boolean add(int value){
	// - adds to end

	if(start == null){
	    start = new LNode<T>(value);
	}else{
	    LNode p = start;			
	    while(p.getNext()!=null){
		p = p.getNext();
	    }
	    p.setNext(new LNode<T>(value));

	}
	size += 1;
	
	return true;
    }

    /*
    public int indexOf(int value){
	//- returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
	LNode p = start;
	int i = 0;
	int ans = -1;

	while(p.getNext() != null){

	    if(p.getValue() == value){
		ans = i;
	    }

	    i++;
	    p = p.getNext();

	}

	return ans;
    }
    */

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

	
    
    
    public static void main(String[]laksjdla){
	MyLinkedList<T> a = new MyLinkedList<T>();

	int i = 0;
	while(i < 100){
	    a.add(i);
	    i++;
	}
	a.add(54);
	a.add(-10);
	a.add(47);
	System.out.println(a);
	a.set(3, 12);
	System.out.println(a);
	a.remove(1);
	System.out.println(a);
	System.out.println(a.size);
        a.add(3, 0);
	System.out.println(a);
	System.out.println(a.size);
    }
    
    
}
