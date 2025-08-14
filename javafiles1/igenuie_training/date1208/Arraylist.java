package date1208;

import java.util.ArrayList;

public class Arraylist {
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("AIML");
    list.add("AERO");
    list.add("CSE");
    list.add("IT");
    list.add("ECE");
    //list.set(2, "EEE");
    //System.out.println(list);
    list.removeIf(lists -> lists.length() %2==0);
System.out.println(list);
}
}
