import java.util.*;
public class magic{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("enter the digits:");
int numbers[]=new int[4];
for(int i=0;i<4;i++){
while(true){
String input=sc.nextLine();
numbers[i]=Integer.parseInt(input);
break;
}
}
for(int num : numbers){
char ch =(char)num;
System.out.println(num+"-"+ ch);
}
sc.close();
}
}