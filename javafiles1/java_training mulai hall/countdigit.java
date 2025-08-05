public class countdigit {
public static void main (String []args){
long n = 1234567819;
long count=0;
while(n>0){
n=n/10;
count++;
}
System.out.println(count);
}
}