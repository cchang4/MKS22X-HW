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

}
