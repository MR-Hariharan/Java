package date0508;
public class throwables {
    public static void main(String[] args) {
        try{
        votereligible(12);
        }catch(Exception e){
            System.out.println("exception:"+e.getMessage());
        }
        
    }
    public static void votereligible(int n) throws Exception{
        if(n<18){
            throw new Exception("not eligible");
        }

    }
}
 