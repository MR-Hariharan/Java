package date0108.libmanagement;
abstract class item {
private String title;
private String author;
item(String title,String author){
    this.title=title;
    this.author=author;
}
 abstract void display();
 public String getTitle() {
    return title;
 }
 public String getAuthor() {
    return author;
 }
 }
