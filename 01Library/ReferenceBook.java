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

}
