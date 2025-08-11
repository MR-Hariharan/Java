package collections.linkedlist;
import java.util.*;
public class LinkedListMain {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addAtFirst(5);
        list.addLast(40);
        list.display();
        // System.out.println();
        // list.addMid(35,3);
        // list.addlast(50);
        // list.addAtFirst(5);
        // list.display();
        // System.out.println();
    }
}
