abstract Class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String a, String t, String i, String c){
	author = a;
	title = t;
	ISBN =i;
	callNumber = c;
    }

    public String getCallNumber(){
	return callNumber;
    }
    public void setCallNumber(String n){
	callNumber = n;
    }

    


}
						   
