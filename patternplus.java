public class patternplus {
    public static void main(String args[]){
        int a=6;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(i==3 ||j==3){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}