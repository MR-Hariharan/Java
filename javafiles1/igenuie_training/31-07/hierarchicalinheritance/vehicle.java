package hierarchicalinheritance;

public class vehicle {
    String vehicletype;
    String wheeltype;
    vehicle(String vehicletype,String wheeltype){
        this.vehicletype = vehicletype;
        this.wheeltype = wheeltype;
    }
    void display(){
        System.out.println("vehicletype:"+vehicletype);
        System.out.println("wheeltype:"+wheeltype);
    }
}

