package hierarchicalinheritance;
public class hierarchical {
    public static void main(String[] args) {
        vehicle v1 = new vehicle("fuel", "four");
        car c1 = new car("ev", "two", 1234, 764, "audi");
        owner s1 = new owner("fuel","two wheel","hari",122);
        vehicle obj = new car("fuel", "two", 23, 45, "bmw");
        v1.display();
        System.out.println("----------------------------------------------");
        c1.display();
        System.out.println("----------------------------------------------");
        s1.display();
        System.out.println("----------------------------------------------");
        obj.display();
    }
}

