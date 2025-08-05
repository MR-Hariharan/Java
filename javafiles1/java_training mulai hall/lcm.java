public class lcm {
    public static void main (String []args){
        int a =15;
        int b = 10;
        int lcm = 0;
        int ans = (a>b)?a:b;
        for(int i =ans;i<=a*b;i++){
            if(i%a==0 && i%b==0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
