import java.util.*;
class studentinfo{
            String name;
            long rollno;
            int tamil;
            int english;
            int maths;
            int science;
            int social;
            int av;
        void average(){
            av = (tamil + english + maths + science + social) / 5;
            System.out.println(av);
        }
        void totalgrade(){
            if(av < 35){
                System.out.println("fail");
            }
            else if(av <= 45){
                System.out.println("E");
            }
             else if(av <=55){
                System.out.println("D");
            }
             else if(av <= 65){
                System.out.println("C");
            }
             else if(av <= 75){
                System.out.println("B");
            }
             else if(av <= 85){
                System.out.println("A");
            }
             else if(av <= 95){
                System.out.println("O");
            }
        }
        void grade1(){
            
        }
        }
public class gradesheet {
    public static void main (String[] args){
        studentinfo a = new studentinfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student details");
        System.out.print("studentname:    ");
        a.name = sc.nextLine();
        System.out.print("roll number:    ");
        a.rollno = sc.nextLong();
        System.out.print("tamil marks:    ");
        a.tamil = sc.nextInt();
        System.out.print("english marks:  ");
        a.english = sc.nextInt();
        System.out.print("maths marks:    ");
        a.maths = sc.nextInt();
        System.out.print("science marks:  ");
        a.science = sc.nextInt();
        System.out.print("social marks:   ");
        a.social = sc.nextInt();
        System.out.print("Average:        ");
        sc.close();
          a.average();
        System.out.print("grade:          ");
        a.totalgrade();
    }
     
}

