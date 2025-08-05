public class pattern5 {
        public static void main(String args[]){
            int n=5;
            int count =1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                    System.out.print("");
                
            System.out.println(" ");
            }
            for(int i=1;i<=n;i++){
                for(int j=i;j<n;j++)
                    System.out.print("*");
                    System.out.print("");
                
            System.out.println(" ");
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++)
                System.out.print(" ");
            
            for(int j=1;j<=i;j++)
                System.out.print("*");
                //count++;
        System.out.println();
        }
        //int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(" ");
            
            for(int j=i;j<n;j++)
                System.out.print("*");
                //count++;
            
        System.out.println();
        }
    }
    }
