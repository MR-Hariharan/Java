public class pattern1 {
    public static void main(String args[]){

        int n=4;
        int count =1 ;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(count);
                System.out.print(" ");
                count++;
            }
        System.out.println(" ");
        }
    }
    
}
