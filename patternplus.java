public class patternplus {
    public static void main(String args[]){
        int a=8;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(i==4 ||j==4){
                System.out.print("h ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}