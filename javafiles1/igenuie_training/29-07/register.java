import java.util.*;
class student{
    static int startingregisterno =1000;
    int registerno;
    String name;
    String department;
    String email;
    student(String name,String department,String email){
        registerno = startingregisterno++;
        this.name = name;
        this.department = department;
        this.email = email;
    }
    void print(){
        System.out.println("regno:"+registerno);
        System.out.println("name:"+name);
        System.out.println("dept:"+department);
        System.out.println("email:"+email);
    }
}
class register {
    public static void main(String[] args) {
        student s1 = new student("hari","aiml","abc@gmail.com");
         student s2 = new student("siva","aiml","avc@gmail.com");
        s1.print();
        s2.print();  
    }
}
