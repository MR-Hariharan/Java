package task3;

public class main {
    public static void main(String[] args) {
        
// int  k = 3;
// Queue r1 = new Queue(5);
// Queue out = new Queue(5);
// Stack s1 = new Stack(k);
// r1.enqueue(10);
// r1.enqueue(20);
// r1.enqueue(30);
// r1.enqueue(40);
// r1.enqueue(50);
// for(int i = 0; i < k; i++){
//   s1.push(r1.dequeue());
// }
// for(int i = 0; i < k; i++){
//   out.enqueue(s1.pop());
// }
// for(int i = 0; i < 5-k; i++){
//   out.enqueue(r1.dequeue());
// }
// out.display();




// Queue a1 = new Queue(8);
// Queue ans = new Queue(8);
// Queue half = new Queue(4);
// a1.enqueue(1);
// a1.enqueue(2);
// a1.enqueue(3);
// a1.enqueue(4);
// a1.enqueue(5);
// a1.enqueue(6);
// a1.enqueue(7);
// a1.enqueue(8);
// for(int i = 0; i <= 3; i++){
//   half.enqueue(a1.dequeue());
// }
// while (!a1.isEmpty()) {
//   ans.enqueue(half.dequeue());
//   ans.enqueue(a1.dequeue());
  
// }
// System.out.println();
// ans.display();



    String input = "java";
        int n = input.length();
        Stack s1 = new Stack(n);
        String output = " ";
       for(int i = 0; i < n; i++){
          s1.push(String.valueOf(input.charAt(i)));
       }
        while(!s1.isEmpty()){
           System.out.print(s1.pop()); 
        }
        System.out.println();
}
}