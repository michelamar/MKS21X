abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	setAuthor(a);
	setTitle(t);
	setISBN(i);
	callNumber = c;
    }

    public String getCallNumber(){
	return callNumber;
    }
    public void setCallNumber(String n){
	callNumber = n;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public int compareTo(LibraryBook x){
        return this.getCallNumber().compareTo(callNumber);
    }
    
    public String toString(){
        return super.toString()+", " + circulationStatus() + ", " + getCallNumber();
    }
   
    public static void main(String[]args){
    }
}
						   
