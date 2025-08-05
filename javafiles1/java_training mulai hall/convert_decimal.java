class decimal{
    public int binary(int a){
            int b=a%2;
            int c=a/2;
            int d=c+b;
            return d;
    }
    public int octa(int x){
            int b=x%8;
            int c=x/8;
            int e=c*10+b;
            return e;
    }
    public int hexa(int y){
        int b=y%16;
        int c=y/16;
        int  f=c*10+b;
        return f;
}
}
public class convert_decimal {
    public static void main (String[]args){
        decimal object=new decimal();
        int d=object.binary(20);
        int e=object.octa(20);
        int f=object.hexa(20);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    }
