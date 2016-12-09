import java.util.Iterator;
public class SuperArrayIterator impliments Iterator<String>{
    private SuperArray name = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray n){
	name = n;
    }

<<<<<<< HEAD
    public boolean hasNext(){

=======
    public boolean hasnext(){
	return (element < name.size());
>>>>>>> 0e8cbe894533094c81dd0d60fe03e672c6546933
    }

    public String next(){
	if (name.hasNext()){
	    return (name.get(element+1));
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw UnsopportedOperationException();
    }
        

}
