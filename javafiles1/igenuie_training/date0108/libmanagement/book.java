package date0108.libmanagement;

public class book extends item {
private String genre;
book(String title,String author,String genre){
super(title, author);
this.genre = genre;
}
void display(){
    System.out.println("title:"+getTitle());
    System.out.println("author:"+getAuthor());
    System.out.println("genre:"+genre);
}
public String getGenre() {
    return genre;
}
}
