package date0108.encapsulation;

abstract class vehicle {
private String vehicletype;
private String wheeltype;
    vehicle(String vehicletype,String wheeltype){
        this.vehicletype = vehicletype;
        this.wheeltype = wheeltype;
    }
     abstract void display();
        //System.out.println("vehicletype:"+vehicletype);
        //System.out.println("wheeltype:"+wheeltype);
   
     public String getVehicletype() {
        return vehicletype;
    }
    public String getWheeltype() {
        return wheeltype;
    }
}