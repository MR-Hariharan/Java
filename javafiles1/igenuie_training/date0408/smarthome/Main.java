package date0408.smarthome;

public class Main {
    public static void main(String[] args) {
        light livingroomLight = new light("hall light");
        livingroomLight.setBrightness(22);
        Thermostat livThermostat = new Thermostat("hall light");
        livThermostat.setTemperature(33);
        light betrLight = new light("bedroom light");
        betrLight.setBrightness(45);
        Thermostat bThermostat = new Thermostat("bedroom light:");
        bThermostat.setTemperature(22.5);
        Room livingRoom = new Room("livingroom", betrLight, bThermostat);
        Room bedRoom = new Room("bedroom", betrLight, bThermostat);
        House myHouse = new House(livingRoom, bedRoom);
        myHouse.showallDevices();
        myHouse.controlAlldevices();
    }
}
