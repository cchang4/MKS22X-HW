public class BSTree<T extends Comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;
	// set/get: data/left/right

	public T getData(){ return data;}
	
	public Node getLeft(){ return left;}

	public Node getRight(){ return right;}

	public void setData(T d){ data = d;}

	public void setLeft(Node l){ left = l;}
	
	public void setRight(Node r){ right = r;}

	//real methods here
	public int height(){ 
	    int ans=0;

	    return ans;
	}
	public void add(T value){
	
	}
	public String toString(){
	    return "gods";
	}
	public boolean contains(T value){
	    return false;
	}
    
    }

    private Node root;

    //OUTER methods here are wrapper methods for the root
    public int getHeight(){
	//call the root's methods
	//check for empty first!
	return root.height();
    }

    public void add(T value){
	//check for empty before you do things with root.
    }
    public String toString(){
	//check for empty before you do things with root.
	return "";
    }
    public boolean contains(T value){
	//check for empty before you do things with root.
	return false;
    }
}
