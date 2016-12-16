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
	for (int pos = 1; pos < data.length; pos++){
	    int currentVal = data[pos];
	    int properPlace=pos;
	    while (properPlace!=0 && currentVal < data[properPlace-1]){
		properPlace--;
	    }
	    for (int move = pos; move >= properPlace && move !=0 ; move--){
		data[move] = data[move-1];
	    }
	    data[properPlace] = currentVal;
	}
    }
		

		    
   
    public static void bubbleSort(int[] data){
	int swaps = 0;
	for (int last = data.length-1; last > 0; last--){
	    for (int pos = 0; pos < last; pos++){
	        if (data[pos] > data[pos+1]){
		    //  System.out.println (""+data[pos]+ data[pos+1]);
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
	int[] e = {6,3,1,7,5,9,4,0,2};
	bubbleSort(e);
	System.out.println(Arrays.toString(e));
	int[] f = {};
	bubbleSort(f);
	System.out.println(Arrays.toString(f));
	int[] g = {10};
	bubbleSort(g);
	System.out.println(Arrays.toString(g));
	int[] h = {400,303,1500,1759,1618,13,11,1436,2168,1172,5280,2016,38387};
	bubbleSort(h);
	System.out.println(Arrays.toString(h));
	int[] i = {6,3,1,7,5,9,4,0,2};
	insertionSort(i);
	System.out.println(Arrays.toString(i));
	int[] j = {};
	insertionSort(j);
	System.out.println(Arrays.toString(j));
	int[] k = {10};
	insertionSort(k);
	System.out.println(Arrays.toString(k));
	int[] l = {400,303,1500,1759,1618,13,11,1436,2168,1172,5280,2016,38387};
	insertionSort(l);
	System.out.println(Arrays.toString(l));
    }

}
