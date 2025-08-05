package date0408.smarthome;

public class Room {
    private String roomName;
    private SmartDevice device1;
    private SmartDevice device2;
    Room(String roomName,SmartDevice device1,SmartDevice device2){
        this.roomName=roomName;
        this.device1=device1;
        this.device2=device2;
    }
    public void showRoomDevices(){
        System.out.println("room:"+roomName);
        System.out.println("device1:"+device1.getDeviceName());
        System.out.println("device2:"+device2.getDeviceName());
    }
    public void controlAlldevices(){
        device1.performFunction();
        device2.performFunction();
    }
}