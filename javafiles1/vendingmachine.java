import java.util.*;
public class vendingmachine{
public static void main(String[]args){
System.out.println("coffee");
System.out.println("1. Espresso Coffee");
System.out.println("2. Cappuccino Coffee");
System.out.println("3. Latte Coffee");
System.out.println("Tea");
System.out.println("1. Plain Tea");
System.out.println("2. Assam Tea");
System.out.println("3. Ginger Tea");
System.out.println("4. Cardamom Tea");
System.out.println("5. Masala Tea");
System.out.println("6. Lemon Tea");
System.out.println("7. Green Tea");
System.out.println("8. Organic Darjeeling Tea");
System.out.println("Soups");
System.out.println("1. Hot and Sour Soup");
System.out.println("2. Veg Corn Soup");
System.out.println("3. Tomato Soup");
System.out.println("4. Spicy Tomato Soup");
System.out.println("Beverages");
System.out.println("1. Hot Chocolate Drink");
System.out.println("2. Badam Drink");
System.out.println("3. Badam-Pista Drink");
System.out.println("4. magic moments");
System.out.println("5. barcadi");
System.out.println("6. old monk");
System.out.println("7. brokode");
Scanner sc = new Scanner(System.in);
System.out.print("enter the type:");
String a=sc.nextLine();
System.out.print("enter the dish:");
int b =sc.nextInt();
sc.close();
String co="coffee";
String tea="tea";
String so="soups";
String be="beverages";
if(a.equals(co)){
System.out.println("welcome to CCD!");
if(b==1){
System.out.println("enjoy your Espresso coffee!");
}
else if(b==2){
System.out.println("enjoy your Cappuccino coffee!");
}
else if(b==3){
System.out.println("enjoy your latte coffee!");
}
else{
System.out.println("invalid input");
}
}
else if(a.equals(tea)){
System.out.println("welcome to CCD!");
if(b==1){
System.out.println("enjoy your plain tea!");
}
else if(b==2){
System.out.println("enjoy your Assam tea!");
}
else if(b==3){
System.out.println("enjoy your Ginger tea!");
}
else if(b==4){
System.out.println("enjoy your Cardomom tea!");
}
else if(b==5){
System.out.println("enjoy your masala tea!");
}
else if(b==6){
System.out.println("enjoy your lemon tea!");
}
else if(b==7){
System.out.println("enjoy your green tea!");
}
else if(b==8){
System.out.println("enjoy your organic tea!");
}
else{
System.out.println("invalid input");
}
}
else if(a.equals(so)){
System.out.println("welcome to CCD!");
if(b==1){
System.out.println("enjoy your hot and sour soup!");
}
else if(b==2){
System.out.println("enjoy your veg corn soup!");
}
else if(b==3){
System.out.println("enjoy your tomato soup!");
}
else if(b==4){
System.out.println("enjoy your spicy tomato soup!");
}
else{
System.out.println("invalid input");
}
}
else if(a.equals(be)){
System.out.println("welcome to CCD!");
if(b==1){
System.out.println("enjoy your hot chocolate!");
}
else if(b==2){
System.out.println("enjoy your badam milk!");
}
else if(b==3){
System.out.println("enjoy your badam-pista drink!");  
}
else if(b==4){
System.out.println("enjoy your magic moments!");  
}
else if(b==5){
System.out.println("enjoy your barcadi!");  
}
else if(b==6){
System.out.println("enjoy your old monk!");  
}
else if(b==7){
System.out.println("enjoy your brokode!");  
}
else{
System.out.println("invalid input");
}
}
else{
System.out.println("invalid input");
}
}
}


