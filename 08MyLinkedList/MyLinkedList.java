public class MyLinkedList{

    //Linked lists are made up of nodes, where each node contains a reference to the next node in the list
    //help from http://www.mycstutorials.com/articles/data_structures/linkedlists


    private class LNode{
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
	return 0;

    }

   

    public int size(){
	//- return the number of elements in the list
	return size;
    }
/*
int remove(int index) - remove the element at the specified index, returns the value removed

boolean add(int index, int value) - insert a new elmeent at the specified index, 0 at the front, size() at the end.
    */

    public boolean add(int value){
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

/*
int indexOf(int value) - returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
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

	
    
    
    public static void main(String[]fuckthis){
	MyLinkedList a = new MyLinkedList();

	System.out.println(a);
	a.add(2);
	a.add(3894197);
	a.add(-10);
	a.add(100);
        System.out.println(a.size());
	System.out.println(a);
	System.out.println(a.get(3));
    }
    
}
