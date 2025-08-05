package date0108.encapsulation;

public class encapsulation {
public static void main(String[] args) {
        owner s1 = new owner("fuel","two wheel","hari",122);
        car c1 = new car("ev", "two", 1234, 764, "audi");
        s1.display();
        System.out.println("-----------------------------------");
        c1.display();
    }
}
