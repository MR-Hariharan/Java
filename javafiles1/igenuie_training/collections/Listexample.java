package collections;
import java.util.*;
import java.util.ArrayList;

public class Listexample {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("chittu");
        name.add("buttu");
        name.add("chattu");
        name.add("hattu");
        name.add("sattu");
        name.add("kottu");
        name.remove(0);
        System.out.println(name);
        System.out.println(name.get(4));
        name.remove("buttu");
        System.out.println(name);
        name.addFirst("yy da");
        System.out.println(name);

    }
}
