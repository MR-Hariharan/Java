public class pattern4 {
    public static void main(String args[]){
        int n=4;
        int count=1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print(count);
                count++;
            }
        System.out.println();
        }
}
}