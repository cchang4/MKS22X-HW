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

    /*HELP FROM you&dad&internet especially http://www.codenlearn.com/2011/10/simple-merge-sort.html
     */

    public static void mergesort(int[]data){

	mergesortHelper(data, 0, data.length - 1);
	printArray(data);

    }


    private static void mergesortHelper(int[] data, int start, int end){


	if(start < end){

	    int mid = (start+end) / 2;

	    mergesortHelper(data, start, mid);
	    mergesortHelper(data, mid+1, end);

	    merge(data, start, mid, mid+1, end);
	}
	 
    }
  

   private static void merge(int[]data, int startA, int endA, int startB, int endB){

       int size = endB - startA + 1;
       int[] temp = new int[data.length];
       int i = 0;


	while(startA <= endA && startB <= endB){
	    if(data[startA] <= data[startB]){
		temp[i++] = data[startA++];
   
	    } else {
		temp[i++] = data[startB++];
	    }	      
	    
	}


	while(startA <= endA){
	    temp[i++] = data[startA++];
	}

	while(startB <= endB){
	    temp[i++] = data[startB++];
	}

	for(int j = size - 1; j >=0; j--,endB--){
	    data[endB] = temp[j];
	}


    }

    /*
    
      public static void main(String[] args) 
    {
	
        //Unsorted array
        int[] a = {4, 2, 5, 3, 1, 2, 4};
	int[] b = {2, 3, 5, 3};
         
        //Call merge sort
	System.out.println("odd");
	mergesort(a);
	System.out.println("even");
	mergesort(b);

	
    }
    */
        
    
    
    public static String name(){
	return "6,Chang,Catherine, im super extra late rip";  }

}
