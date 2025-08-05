package multilevelinheritance;
class subject extends student{
    int scode;
    String sname;
    subject(String collegename,String dept,int regno,String name,int scode,String sname){
        super(collegename,dept,regno,name);
        this.scode = scode;
        this.sname = sname;
    }
    void display(){
        System.out.println("scode:"+scode);
        System.out.println("sname:"+sname);
        super.display();
    }
}



