import java.util.*;
public class Wpattern {
    public static void main (String[] args){
        for(int i=1; i < 2; i++){
            for(int j=1; j < 10; j++){
                if(i+j==2||i+j==6||i+j==10){
                System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
        }
    }
        System.out.println();
        for(int i=2; i < 3; i++){
            for(int j=1; j < 10; j++){
                if(i+j==4||i+j==6||i+j==8||i+j==10){
                System.out.print("*");
            }
            else{
                System.out.print(" ");            }
        }
        System.out.println();
    }
        for(int i=3; i < 4; i++){
            for(int j=1; j < 10; j++){
                if(i+j==6|i+j==10){
                System.out.print("*");
            }
            else{
                System.out.print(" ");            }
        }
        System.out.println();
    }
    }
}

