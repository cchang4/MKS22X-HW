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

   private void pushDown(int k){
   }

   private void pushUp(int k){
   }

   private void heapify(){
   }

   public T delete(){
   }

   public void add(T x){
   }

   private void doubleSize(){
   }

   public String toString(){
   }

   public static void main(String[]ssssss){

   }

   /*
   //do this last
   public MyHeap(boolean isMax){
   }

   public MyHeap(T[] array, boolean isMax){
   }
   */

}
