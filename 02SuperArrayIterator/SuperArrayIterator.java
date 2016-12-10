import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    private SuperArray name = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray n){
	name = n;
    }

    public boolean hasNext(){
	return (element < name.size());
    }

    public String next(){
	if (hasNext()){
	    element++;
	    return (name.get(element-1));
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
        

}
