package date0508;

public class error {
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3};
            int a1 = a[3];
            int b = 10/0;
        }
       catch(ArithmeticException e){
        System.out.println("cannot divide by zero");
       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("array index out of bound");
       }catch(Exception e){
        System.out.println("general error"+e.getMessage());
       }finally{
        System.out.println("finally blocks run here");
       }
       System.out.println("out of try,catch,finally");
    }
}
