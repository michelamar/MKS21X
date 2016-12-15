import java.util.*;

public class Sorts{
  /**EDIT THIS METHOD TO MATCH YOUR NAME 
  */
  public static String name(){
    return "10.Marchini.Michela"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
    public static void selectionSort(int[] data){
      for (int start = 0; start <data.length; start++){
	  int smallest = start;
	  for (int current = start; current < data.length; current++){
	      if (data[current] < data[smallest]){
		  smallest = current;
	      }
	      if (current == data.length-1){
		 int temp = data[start]; 
		 data[start] = data[smallest];
		 data[smallest] = temp;
	      }
	  }
      }		  
    }
  
    public static void insertionSort(int[] data){
	for (int pos = 1; pos < data.length; pos ++){
	    for (int 
	    int current = data[pos];
	    while (current < data[pos-1]){
		data[pos] = data[pos-1]
   
    public static void bubbleSort(int[] data){
	boolean done = false
	int swaps = 0;
	for (int end = data.length; end < 0; end--){
	    for (int pos = 0; pos <end; pos++){
	        if (data[pos] > data[pos+1]){
		    int temp = data[pos]; 
		    data[pos] = data[pos+1];
		    data[pos+1] = temp;
		    swaps++;
	        }
	    }
	    if (swaps == 0){
		return;
	    }
	}

    public static void main(String[]args){
	int[] a = {6,3,1,7,5,9,4,0,2};
	selectionSort(a);
	System.out.println(Arrays.toString(a));
	int[] b = {};
	selectionSort(b);
	System.out.println(Arrays.toString(b));
	int[] c = {10};
	selectionSort(c);
	System.out.println(Arrays.toString(c));
	int[] d = {400,303,1500,1759,1618,13,11,1436,2168,1172,5280,2016,38387};
	selectionSort(d);
	System.out.println(Arrays.toString(d));
    }

}
