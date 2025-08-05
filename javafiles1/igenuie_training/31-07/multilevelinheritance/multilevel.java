package multilevelinheritance;
public class multilevel {
    public static void main(String[] args) {
        college clg1 = new college("hicet","aiml");
        student stu1 = new student("hicet","Aiml", 25, "hari");
        subject sub1 = new subject("hicet","cse",24, "hari",17363, "com");
        clg1.display();
        System.out.println("-----------------------------------------");
        stu1.display();
         System.out.println("-----------------------------------------");
         sub1.display();
    }
}

