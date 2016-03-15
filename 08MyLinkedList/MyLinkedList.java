public class MyLinkedList{

    //Linked lists are made up of nodes, where each node contains a reference to the next node in the list
    //help from http://www.mycstutorials.com/articles/data_structures/linkedlists

    //variables
    LNode start;
    int size;

    public MyLinkedList(){
	
    }

    /*
    //  methods:

  int get(int index)- get the value of the element at the specified index (0 based)

int set(int index,int newValue) - change the value of the element at the specified index to the newValue, return the old value

    */

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
	size = size + 1;

	LNode temp = new LNode(value);
	LNode current = start;
	
	return true;
    }

/*
int indexOf(int value) - returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
    */

    public String toString() {
	//- returns a list formatted like: [ v1, v2, v3, ... vn-1, vn ]

	if(start == null){
	    return "[ ]";
	}

	return "skdfjdsl";
    }

    private class LNode{
        LNode next;
	int number;

	public LNode(int cvalue){
	    next = null;
	    number = cvalue;
	}
	
    }
    /*
    public static void main(String[]fuckthis){
	MyLinkedList a = new MyLinkedList();

	System.out.println(a);
	a.add(2);
        System.out.println(a.size());
    }
    */
}
