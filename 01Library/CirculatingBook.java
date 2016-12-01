class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String t, String i, String c){
	super(a, t, i, c);
    }

    public String getCurrentHolder(){
	return currentHolder;
    }
    public String getDueDate(){
	return dueDate;
    }
    public void setCurrentHolder(String x){
	currentHolder = x;
    }
    public void setDueDate(String x){
        dueDate=x;
    }

    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }

    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
	if (currentHolder!=null && dueDate!=null){
	    return getCurrentHolder()+", "+getDueDate();
	}
	else{
	    return "book available on shelves";
	}
    }

    public String toString(){
	if (currentHolder!=null && dueDate!=null){
	    return super.toString()+", "+getCurrentHolder()+", "+getDueDate();
	}
	else{
	    return super.toString();
	}
    }

    public static void main(String[]args){
    }

    


}
