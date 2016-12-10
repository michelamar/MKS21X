import java.util.Iterator;
public class SuperArray implements Iterable<String>{
  private String[] data;
  private int size;

    public Iterator<String> iterator(){
	return new SuperArrayIterator(this);
    }
    
    public SuperArray(){
	data = new String[10];
	size = 0;
    }
    public SuperArray(int capacity){
	if (capacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[capacity];
	size = 0;
    }

  public int size(){
    return size;
  }

  
  public boolean add(String n){
      if (size < data.length){
	  data[size]= n;
	  size++;
      }
      else {
	  this.grow();
	  data[size] = n;
      }
      return true;
  }

    public void add(int index, String element){
	if (index>size){
	    throw new IndexOutOfBoundsException();
	}
	if (size == data.length){
	    this.grow();
	}
	for(int i = size; i>index; i--){
	    data[i] = data[i-1];
	}
	data[index] = element;
	size++;
    }

    public String remove (int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String removing = data[index];
	for (int i = index; i<size; i++){
	    data[i]= data[i+1];
	}
	size--;
	return removing;
    }	    

  private void grow(){
      String[] temp = new String[data.length +10];
      for (int i = 0; i<data.length; i++){
	  temp[i] = data[i];
      }
      data = temp;
  }

    public String get (int index){
       	if (index < 0 || index >= size()){
       	    throw new IndexOutOfBoundsException();
       	}
	else{
	    return data[index];
	}
    }

    public void clear(){
	size = 0;
    }

    public boolean isEmpty(){
	return (size==0);
    }

    public String set(int index, String element){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	String replaced = data[index];
	data[index] = element;
	return replaced;
    }

    public String[] toArray(){
	String[] array = new String[size];
	for (int i=0; i<size; i++){
	    array[i] = data[i];
	}
	return array;
    }

    public int indexOf(String i){
	for(int pos= 0; pos<size; pos++){
	    if (data[pos].compareTo(i) == 0){
		return pos;
	    }
	}
	return -1;
    }

    public int lastIndexOf(String i){
	for(int pos = size()-1; pos>=0; pos--){
	    if (data[pos].compareTo(i) == 0){
		return pos;
	   } 
	}
	return -1;
    }
     
  public String toString(){
      String ans = "[";
      for (int i = 0; i < size; i ++){
	  ans += data[i] + ",";
      }
      ans += "]";
      return ans;
  }

  public String toStringDebug(){
      String ans = "[";
      for (int i = 0; i < size; i ++){
	  ans += data[i] + ",";
      }
      for (int i = 0; i < data.length - size; i++){
	  ans += "_,";
      }
      ans += "]";
      return ans; 
  }
    public static void main (String[]args){
	SuperArray a = new SuperArray(10);
	a.add("pizza");
	a.add("pasta");
	a.add("pasta");
	System.out.println(a);
	System.out.println(a.indexOf("pasta"));
	System.out.println(a.lastIndexOf("pasta"));
	System.out.println(a.indexOf("ravioli"));
	System.out.println(a.lastIndexOf("ravioli"));
      
    }
}
