import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    private SuperArray name = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray n){
	name = n;
    }

<<<<<<< HEAD
    public boolean hasNext(){
=======
<<<<<<< HEAD
    public boolean hasNext(){

=======
    public boolean hasnext(){
>>>>>>> d7d1fef97978942f39a5d9995db44f1ddf2da83a
	return (element < name.size());
>>>>>>> 0e8cbe894533094c81dd0d60fe03e672c6546933
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
