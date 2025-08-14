package date1208;
import java.util.LinkedList;
import java.util.*;
public class list {
public static void main(String[] args) {
//     String s = "better than yesterday";
//     //output "yesterday than better "
//    String[] words = s.split(" ");
//     LinkedList<String> list = new LinkedList<>(Arrays.asList(words));
//     System.out.println(list);
//     Collections.reverse(list);
//     System.out.println(list);
    // list.add(25);
    // list.add(1,3);
    // list.addLast(8);
    // list.addFirst(3);
    // list.add(4,9);
    // list.add(15);
    // list.add(20);
    // System.out.println(list);
    // list.remove(2);
    // System.out.println(list);
    // list.remove();
    // System.out.println(list);
    // list.clone();
    // System.out.println(list);
    // System.out.println(list.contains(9));
//     list.add(25);
//     list.add(20);
//     list.add(15);
//     list.add(10);
//     list.add(6);
//        int k  = 5;
//     if(list.contains(k)){
//         list.remove(Integer.valueOf(k));
//     }
//     else{
//         list.clear();
//     }
//   System.out.println(list);
    //int sum = 0;
    //int max = list.get(0);
    //int avg = 0;
 
    // for(int i : list){
    //     sum += i;
    // }
    // for(int i = 1; i < list.size(); i++){
    //     max = Math.max(max, i);
    // }
    // System.out.println(sum);
    // System.out.println(max);
    LinkedList<Integer> input = new LinkedList<>();
    LinkedList<Integer> even = new LinkedList<>();
    input.add(2);
    input.add(5);
    input.add(8);
    input.add(11);
    input.add(14);
    input.add(7);
    int k =2;
    for(int i : input){
    if(input.indexOf(i)%2==0){
        even.add(i);
    }
    }
    System.out.println(even);
   Collections.rotate(even,k);
   System.out.println(even);
   int index = 0;
   for(int i = 0; i < input.size(); i++){
    if(input.get(i)%2==0){
        input.set(i,even.get(index++));
    }
   }
   System.out.println(input);
}
}
