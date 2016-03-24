public class MyLinkedList<T>{

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

	public void setValue(T thing){
	    data = thing;
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

	if(index <=0 || index > size()){throw new IndexOutOfBoundsException();}
	int i = 0;
	LNode p = start;

	while(i < index){
	    p= p.getNext();
	    i++;
	}
	return p.getValue();
    }



 

    public T set(int index,T newValue) {
//- change the value of the element at the specified index to the newValue, return the old value

	if(index <=0 || index > size()){throw new IndexOutOfBoundsException();}
        T old = get(index);
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
    
    public T remove(int index){
	//- remove the element at the specified index, returns the value removed
	if(index <=0 || index > size()){throw new IndexOutOfBoundsException();}
	
	size -= 1;

        T old = get(index);

	int i = 0;
	LNode p = start;

	while(i < index){
	    p= p.getNext();
	    i++;
	}

	p.setNext(p.getNext().getNext());
	
	return old;
	
    }


    public boolean add(int index, T value){
	//- insert a new element at the specified index, 0 at the front, size() at the end.

	if(index <=0 || index >= size()){return false;}

	LNode p = start;
	LNode n = new LNode(value);
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

	while(p.getNext() != null){

	    if(p.getValue() == value){
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
	return "head";
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
