public class perfect {
    public static void main (String []args){
        int n=6;
        int sum=1;
        for(int i=2;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("not a perfect");
        }
}
} 