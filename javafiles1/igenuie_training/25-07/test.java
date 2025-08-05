import java.util.*;

public class test {
    public static void main (String[] args){
        String str = "java";
        int count;   
        char[] c=str.toCharArray();
        for(int i = 0; i < c.length; i++){
            count = 1;
            if(c[i] == '0');
            continue;
        for(int j = i+1; j < c.length; j++){
            if(c[i] == c[j]){
                count++;
                c[j] = '0';
            }
        }
        
    }
}
}

