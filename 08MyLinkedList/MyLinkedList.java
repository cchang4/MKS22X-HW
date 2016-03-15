public class MyLinkedList{

    //Linked lists are made up of nodes, where each node contains a reference to the next node in the list

    //variables
    LNode start;
    int size;

    public MyLinkedList(){

    }

    /*
    //  methods:

  int get(int index)- get the value of the element at the specified index (0 based)

int set(int index,int newValue) - change the value of the element at the specified index to the newValue, return the old value

int size() - return the number of elements in the list

int remove(int index) - remove the element at the specified index, returns the value removed

boolean add(int index, int value) - insert a new elmeent at the specified index, 0 at the front, size() at the end.
    */

    public boolean add(int value){
	// - adds to end
	return false;
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
	//node???like in vectors??????
	//ddddd


	//points to next one?????
    }

}
