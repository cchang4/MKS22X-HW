import java.util.*;
@SuppressWarnings("unchecked")

public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;

   public MyHeap(){
       size = 10;
       data = (T[])new Comparable[10];
   }

   public MyHeap(T[] array){
       data = array;
       size = data.length;
   }
     /**pushDown
      precondition: datas[k]'s children are valid heaps
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data[k] and is a valid heap
   **/

   private void pushDown(int k){
       for(int i = 0; i < data.length; i++){
	   if(data[i] == null) data[i] = k;
       }
   }

     /**pushUp
      precondition: data is a heap with at most one item
      out of place (element at k)
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data is a valid heap
   **/
   private void pushUp(int k){
   }

   private void heapify(){
   }
   /*

   public T delete(){
   }
   */
   public void add(T x){
   }

   private void doubleSize(){
       data = Arrays.copyOf(data, data.length * 2);
   }

   public String toString(){
       return Arrays.toString(data);
   }

   public static void main(String[]ssssss){

       MyHeap<Integer> h = new MyHeap<Integer>();

       h.pushDown(2);
       System.out.println(h);

   }

   /*
   //do this last
   public MyHeap(boolean isMax){
   }

   public MyHeap(T[] array, boolean isMax){
   }
   */

   /*
public RunningMedian()  :
    Create an empty running median set.

public double getMedian() :
    When empty: throws new NoSuchElementException()
    Returns the median value

public void add(Integer x)
    add to the "SmallValue" heap if  x < median, 
    add to the "BigValue" heap otherwise. 
    balance the two heaps so that their size differ by no more than 1. 

   */

}
