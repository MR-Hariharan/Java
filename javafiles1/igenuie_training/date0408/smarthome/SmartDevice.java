package date0408.smarthome;

public abstract class SmartDevice {
    private String deviceName;
    SmartDevice(String deviceName){
        this.deviceName=deviceName;
    }
    public String getDeviceName() {
        return deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public abstract void performFunction();
}
