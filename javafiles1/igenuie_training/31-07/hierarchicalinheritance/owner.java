package hierarchicalinheritance;
class owner extends vehicle{
    String name;
    int dlno;
    owner(String vehicletype,String wheeltype,String name,int dlno){
        super(vehicletype,wheeltype);
        this.name = name;
        this.dlno = dlno;
    }
    void display(){
        System.out.println("owner name:"+name);
        System.out.println("driving lisence no:"+dlno);
        super.display();
    }
}

