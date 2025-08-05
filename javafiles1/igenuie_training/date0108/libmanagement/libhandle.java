package date0108.libmanagement;

public class libhandle {
    public static void main(String[] args) {
        book b = new book("samer", "baskar", "comics");
        borrowed bo = new borrowed("lovetheworld", "hari", "love", "siva", "20-2-2993");
        System.out.println("-------------------------------------");
        b.display();
        System.out.println("--------------------------------------");
        bo.display(); 
        bo.instructions();
        System.out.println("--------------------------------------");
        item[] i = new item[3];
        i[0] = new book("hsja", "nanthan", "comics");
        i[1] = new book("hbfhgr", "neethan", "null");
        i[2] = new borrowed("alau", "fnge", "huwhu", "huerhb", "44866");
        for(item c: i){
            c.display();
            System.out.println();
        }
        }
}
