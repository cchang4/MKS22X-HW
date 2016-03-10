public class Sorts{
    public static void printArray(int[]data){
	if (data.length == 0){
	    System.out.println("[]");
	}else{
	    System.out.print("[");
	    for (int i = 0; i < data.length-1; i++){
		System.out.print( data[i] + ", ");
	    }
	    System.out.print( data[data.length-1] + "]");
	    System.out.println();
	}
    }

    public static void insertionSort(int[]data){
	int storedValue;
	for (int i = 1; i < data.length; i++){
	    //loop to cycle thru given list
	    for (int s = i; s > 0; s--){
		//to cycle thru previous indeces and replace if needed
		if (data[s] < data[s-1]){
		    storedValue = data[s];
		    //take value you found&store
		    data[s] = data[s - 1];
		    //change current index's value to previous index's value
		    //now there is a larger number
		    data[s - 1] = storedValue;
		    //change previous index's value to current index's value
		    //previous index has smaller number now
		    
		    printArray(data);
		}
	    }
	}
    }

     /*help from
 http://www.java2novice.com/java-sorting-algorithms/selection-sort/#sthash.DaG5n8Dx.dpuf

    */
    
    public static void selectionSort(int[]data){
	int index = 0;
	for (int i = 0; i < data.length - 1; i++){
	    for (int s = i + 1; s < data.length; s++){

                if (data[s] < data[index]){
                    index = s;
		    int smallerNumber = data[index]; 
		    data[index] = data[i];
		    data[i] = smallerNumber;
		}
	    }
        }
    }

    public static void mergesort(int[]data){
	//calls helper functions
	split(data, 0, data.length / 2,  data.length / 2, data.length);
	
    }

    private static void sort(int[] left, int[] right){
	//sort the two arrays

	//left array
	for (int i = 0; i < left.length-1; i++){
	    if (left[i] > left[i + 1]){
		int store = left[i];
		left[i] = left[i+1];
		left[i+1] = store;
	    }
	}

	//	printArray(left);
	/*

	for (int i = 0; i < right.length-1; i++){
	    if (right[i] > right[i + 1]){
		int store2 = right[i];
		right[i] = right[i+1];
		right[i+1] = store2;
	    }
	}

	printArray(right);
	*/

    }

    private static void split(int[]data, int startA, int endA, int startB, int endB){
	//splits original array into 2, stores them into new ones, sorts


	int[] left = new int [endA - startA];
	int[] right = new int [endB - startB];

	for (int i = 0; i < endA; i++){
	    left[i] = data[i];
	}
	
	for (int i = 0; i < right.length; i++){
	    for (int j = startB; j < endB; j++){
		right[i++] = data[j];
	    }
	}
	/*
		printArray(left);
		printArray(right);
	*/
		sort(left,right);
    }
    
    /*
      public static void main(String[] args) 
    {
        //Unsorted array
        int[] a = {2, 4, 5, 3, 1};
         
        //Call merge sort
        mergesort(a);

    }

    */

    

    public static String name(){
	return "6,Chang,Catherine, SORRY IM NOT DONE YET";  
}

}
