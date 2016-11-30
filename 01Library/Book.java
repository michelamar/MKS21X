public class Book{
    private String author;
    private String title;
    private String ISBN;

    public Book(){
    }

    public Book(String a, String t, String i){
	author = a;
	title = t;
	ISBN = i;
    }

    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }

    public void setAuthor(String n){
	author =  n;
    }
    public void setTitle(String n){
	title = n;
    }
    public void setISBN(String n){
	ISBN = n;
    }

    public String toString(){
	return(getTitle() + ", " +getAuthor()+ ", " +getISBN());
    }

    public static void main(String[]args){
    }
}
