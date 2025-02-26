
    class methods{
        public int factorize (int a){
            int res=1,i;
            for(i=2;i<=a;i++){
                res *=i;
            }
            return res;
        }
        public int fibonnaci(int b){
            int num1=0;
            int num2=1;
            for(int i=0;i<b;i++){
                System.out.print(num1+" ");
                int num3=num2+num1;
                num1=num2;
                num2=num3;
            }
        return num1;
        }
        public int prime(int c,int d){
            int count;
            for(int i=c;i<=d;i++){
                count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.print(i+" ");
                }
            }
            return 0;
        }
    }
    public class methodoverloading2 {
        public static void main (String[]args){
            methods s=new methods();
            System.out.println("final answer:"+s.factorize(5));
            System.out.println(s.fibonnaci(10));
            System.out.println( s.prime(13,100));
        }
}
