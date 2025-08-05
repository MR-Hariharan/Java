package date0408.smarthome;

public class House {
    private Room room1;
    private Room room2;
    House(Room room1,Room room2){
        this.room1=room1;
        this.room2=room2;
    }
    public void showallDevices(){
        System.out.println("room1:"+room1);
        System.out.println("room2:"+room2);
    }
    public void controlAlldevices(){
        room1.controlAlldevices();;
        room2.controlAlldevices();
    }
}
