package hierarchicalinheritance;

class car extends vehicle{
    int regno;
    int modelno;
    String modelname;
    car(String vehicletype,String wheeltype,int regno,int modelno,String modelname){
        super(vehicletype,wheeltype);
        this.regno = regno;
        this.modelno = modelno;
        this.modelname = modelname;
    }
    void display(){
        System.out.println("regno:"+regno);
        System.out.println("modelno:"+modelno);
        System.out.println("modelname:"+modelname);
        super.display();
    }
}

