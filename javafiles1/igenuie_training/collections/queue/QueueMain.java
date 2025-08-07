package collections.queue;

public class QueueMain {
    public static void main(String[] args) {
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
          Queue q1 = new Queue(4);
        Queue q2 = new Queue(5);
        Queue output = new Queue(5);
        System.out.println("queue 1:");
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(7);
        q1.enqueue(4);
        q1.enqueue(9);
        q1.display();
        System.out.println("queue 2:");
        q2.enqueue(3);
        q2.enqueue(6);
        q2.enqueue(5);
        q2.enqueue(2);
        q2.enqueue(10);
        q2.display();
        while(!q1.isEmpty() && !q2.isEmpty()){
            int v1 = q1.dequeue();
            int v2 = q2.dequeue();
            int sum  = v1 + v2;
            if(isPrime(sum)){
                output.enqueue(sum);
            }
    }
    System.out.println();
    output.display();
}
}
