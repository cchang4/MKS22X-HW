import java.util.*;

public class FrontierStack<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/

    /***You can use your classes or built in ones***/

    /***You can extend another class OR wrap around it***/

    private Stack<T> s;

    public FrontierStack(){
	s = new Stack<T>();
    }

    public void add(T element){
	s.push(element);
    }

    public T next(){
        return s.peek();
    }

    public boolean hasNext(){
	if (s.size() > 0){
	    return false;
	}
	return true;
    }


}
