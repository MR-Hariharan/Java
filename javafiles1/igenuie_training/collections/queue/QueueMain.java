package collections.queue;
import java.util.*;
public class QueueMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        // Queue q1 = new Queue(4);
        // Queue q2 = new Queue(5);
        // Queue output = new Queue(5);
        // System.out.println("queue 1:");
        // q1.enqueue(2);
        // q1.enqueue(7);
        // q1.enqueue(4);
        // q1.enqueue(9);
        // q1.display();
        // System.out.println("queue 2:");
        // q2.enqueue(3);
        // q2.enqueue(6);
        // q2.enqueue(5);
        // q2.enqueue(2);
        // q2.enqueue(10);
        // q2.display();
        // while(!q1.isEmpty() || !q2.isEmpty()){
        //         int  v = q1.dequeue();
        //         int v1 = q2.dequeue();
        //         if(v%2==0){
        //             output.enqueue(v+v1);
        //         }
        //         else if(v%2==1){
        //             output.enqueue(v-v1);
        //         }
        //         else{
        //             output.enqueue(v1);
        //         }
        //     }
        // System.out.println();
        // output.display();

          //String 

//           Queue q1 = new Queue(4);
//         Queue q2 = new Queue(5);
//         Queue output = new Queue(5);
//         System.out.println("queue 1:");
//         q1.enqueue("hari");
//         q1.display();
//         System.out.println("queue 2:");
//         q2.enqueue("hari");
//         q2.display();
//         while(!q1.isEmpty() && !q2.isEmpty()){
//             String v1 = q1.dequeue();
//             String v2 = q2.dequeue();
//             String sum  = v1 + v2;
//             output.enqueue(sum);
//     }
//     System.out.println();
//     output.display();






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





}
}
