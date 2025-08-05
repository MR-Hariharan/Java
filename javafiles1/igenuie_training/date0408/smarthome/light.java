package date0408.smarthome;

public class light extends SmartDevice {
    private int brightnesslevel;
    public light(String deviceName){
        super(deviceName);
    }
public void setBrightness(int level){
    this.brightnesslevel=level;
}
public void performFunction(){
    System.out.println("brightnesslevel:"+brightnesslevel);
}
}
