package date0408.smarthome;

public class Thermostat extends SmartDevice{
    private double temperature;
    Thermostat(String deviceName){
     super(deviceName);
    }
    public void setTemperature(double temp){
        this.temperature=temp;
    }
    public void performFunction(){
        System.out.println("temperature set:"+temperature);
    }
}
