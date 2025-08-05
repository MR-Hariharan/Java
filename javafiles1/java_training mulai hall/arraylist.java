import java.util.*;
public class arraylist{
public static void main (String[] args){
Scanner sc = new Scanner(System.in);
/*ArrayList<Integer> list = new ArrayList<>(10);
list.add(12);
list.add(34);
list.add(43);
list.add(446);
System.out.println(list.contains(2453));
System.out.println(list);
list.remove(1); 
list.set(0,45);
System.out.println(list);
for(int i = 0; i < 5; i++){
list.add(sc.nextInt());
}*/

//initialization

ArrayList<ArrayList<Integer>> list = new ArrayList<>();
for(int i = 0; i <  3; i++){
list.add(new ArrayList<>());
}

//input 

for(int i = 0;i< 3;i++){
for(int j = 0;j<3;j++){
list.get(i).add(sc.nextInt());;
}
}

//print arraylist

System.out.println(list);


















}
}