import java.util.*;
public class course{
public static void main (String[]args){
Scanner sc =  new Scanner(System.in);
System.out.println("Enter no of course:");
int a = sc.nextInt();
sc.nextLine();
int maxcourse=20;
if(a<=0 || a>maxcourse){
System.out.println("Invalid Range");
return;
}
System.out.println("Enter course names");
String course[]=new String[a];
for(int i =0;i<a;i++){
course[i]=sc.nextLine().trim();
}
System.out.println("Enter the course to be searched:");
String searchedcourse=sc.nextLine().trim();
boolean found = false;
for(String c : course){
if(c.equals(searchedcourse)){
found = true;
break;
}
}
if(found){
System.out.println(searchedcourse+" is available");
}
else{
System.out.println(searchedcourse+" is not available");
}
sc.close();
}
}
