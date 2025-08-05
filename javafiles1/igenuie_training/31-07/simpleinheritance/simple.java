package simpleinheritance;
import java.util.*;
public class simple {
     public static void main(String[] args) {
        college clg1 = new college("hicet","aiml");
        student stu1 = new student("hicet","Aiml", 25, "hari");
        clg1.display();
        System.out.println("-----------------------------------------");
        stu1.display();
}
}
