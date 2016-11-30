class ReferenceBook extends LibraryBook{
    private String collection;

    public ReferenceBook(String a, String t, String i, String call, String coll){
	setAuthor(a);
	setTitle(t);
	setISBN(i);
	setCallNumber(call);
        collection = coll;
    }

    public String getCollection(){
        return collection;
    }
    public void setCollection(String coll){
        collection = coll;
    }

    public void checkout(String patron, String due){
	System.out.println("cannot check out a reference book");
    }  
    public void returned(){
	System.out.println("reference book could not have been checked out -- return impossible");
    }

}
