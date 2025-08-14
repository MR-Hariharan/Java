package date1308;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class hashmap {
public static void main(String[] args) {
    String s = "successaaaaaaaaaaaaaaaahhhhhhhhhhhhhhhhhrrrrrrrrrrrrrrrruvhuvhhbrbgrjgrydudhthghhghhghbghjrgrrnununhbiebijbigbijgrjrgbjegjbbijrb egijij";
    HashMap<Character,Integer> map = new HashMap<>();
    int count = 0;
    for(char c : s.toCharArray()){
    if(map.containsKey(c)){
        count++;
    }
    else{
        count = 1;
    }
     map.put(c, count);
}
System.out.println(map);
}
}
