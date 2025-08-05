package date0108.encapsulation;
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
         System.out.println("vehicletype:"+getVehicletype());
        System.out.println("wheeltype:"+getWheeltype());
    }
}

