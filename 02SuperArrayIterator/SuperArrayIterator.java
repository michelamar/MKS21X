import java.util.Iterator;
public class SuperArrayIterator impliments Iterator<String>{
    private SuperArray name = new SuperArray();
    private int element = 0;

    public SuperArrayIterator(SuperArray n){
	name = n;
    }

    public boolean hasnext(){

    }

    public String next(){

    }

    public void remove(){
	throw UnsopportedOperationException();
    }
        

}
