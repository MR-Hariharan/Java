import java.util.*; 
class aiml{
public int display(int a,int b){
        int addition =a+b;
        return addition;
}
public long display(long a,long b){
        long subraction =a-b;
        return subraction;
}
public int display( int a,int b,int c){
    int multiply =a*b*c;
    return multiply;
}
public double display(double c,double d){
    double divide =c/d;
    return divide;
}
}
public class methodoverloading{
    public static void main(String[]args){
        aiml b =new aiml();
        System.out.println("Addition of a and b:       "+b.display(10,15));
        System.out.println("Subraction of a and b:     "+b.display(50,15));
        System.out.println("Multiplication of a and b: "+b.display(350,15));
        System.out.println("Division of c and d:       "+b.display(1298765.4,15.2));
    }
    }


    
