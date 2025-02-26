import java.util.*; 
class aiml{
public int add(int a,int b){
        int addition =a+b;
        return addition;
}
public int sub(int a,int b){
        int subraction =a-b;
        return subraction;
}
public int mul(int a,int b){
    int multiply =a*b;
    return multiply;
}
public double div(double c,double d){
    double divide =c/d;
    return divide;
}
}
public class methodoverloading{
    public static void main(String[]args){
        aiml b =new aiml();
        System.out.println("Addition of a and b:       "+b.add(10,15));
        System.out.println("Subraction of a and b:     "+b.sub(50,15));
        System.out.println("Multiplication of a and b: "+b.mul(350,15));
        System.out.println("Division of c and d:       "+b.div(1298765.4,15.2));
    }
    }


    
