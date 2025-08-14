package date1308;
import java.util.*;
public class missingelement {
public static void main(String[] args) {
    int[] num = {1,2,3,2,3,4,7,8};
    HashMap<Integer,Boolean> map = new HashMap<>();
    ArrayList<Integer> list = new ArrayList<>();
    for(int n : num){
        map.put(n, true);
    }
    for(int i = 1; i <= 8; i++){
        if(!map.containsKey(i)){
            list.add(i);
        }
    }
    System.out.println(list);
}
}
