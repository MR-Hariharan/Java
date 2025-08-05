package multilevelinheritance;
class college{
    static int code = 100;
    String collegename;
    String dept;
    college(String collegename,String dept){
        this.collegename = collegename;
        this.dept = dept;
    }
     void display(){
        System.out.println("collegecode:"+code);
        System.out.println("collegename:"+collegename);
        System.out.println("department:"+dept);
        code++;
     }
}

