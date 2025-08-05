package multilevelinheritance;
class student extends college{
    int regno;
    String name;
    student(String collegename,String dept,int regno,String name){
        super(collegename,dept);
        this.regno = regno;
        this.name = name;
    }
    void display(){
        System.out.println("regno:"+regno);
        System.out.println("name:"+name);
        super.display();
    }
}

