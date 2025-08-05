import java.util.*;
public class test4{
public static void main (String[] args){
    int k = 2;
    int[] num = {1,1,1,};
    int count =0;
    int sum =0;
    for(int i = 0; i < num.length; i++){
        sum=num[i];
        if(sum==k)
        count++;
        for(int  j = i+1; j < num.length; j++){
        
        sum +=num[j];
        if(sum==k)
        count++;
        }
    }
 System.out.println(count);
}
}

