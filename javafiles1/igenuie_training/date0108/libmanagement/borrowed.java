package date0108.libmanagement;

public class borrowed extends book implements borrowable{
private String name;
private String duedate;
borrowed(String author,String title,String genre,String name,String duedate){
    super(title,author,genre);
    this.name=name;
    this.duedate=duedate;
}
void display(){
    System.out.println("title:"+getTitle());
    System.out.println("autor:"+getAuthor());
    System.out.println("genre:"+getGenre());
    System.out.println("name:"+name);
    System.out.println("duedate:"+duedate);
}
public String getName() {
    return name;
}
public String getDuedate() {
    return duedate;
}
public void instructions(){
    System.out.println("return the book");
}
}
