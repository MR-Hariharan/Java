package collections.queue;

import java.nio.channels.Pipe.SourceChannel;

public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int maxsize;
    public Queue(int size){
        front = -1;
        rear = -1;
        maxsize = size;
        queue = new int[maxsize];
    }
    public boolean isFull(){
        return rear == maxsize -1;
    }
    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }
        if(front == -1){
            front =0;
        }
        queue[++rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int value = queue[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        return value;
    }
    public int poll(){
        return dequeue();
    }
    public void display(){
        for(int i : queue){
            System.out.println(i);
        }
    }
    public boolean isPrime(int data){
        if(data <=1){
            return false;
        }
        for(int i = 0; i <= Math.sqrt(data); i++){
            if(data % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public int size(){
        return rear - front;
    }
    //  private String[] queue;
    // private int front;
    // private int rear;
    // private int maxsize;
    // public Queue(int size){
    //     front = -1;
    //     rear = -1;
    //     maxsize = size;
    //     queue = new String[maxsize];
    // }
    // public boolean isFull(){
    //     return rear == maxsize -1;
    // }
    // public boolean isEmpty(){
    //     return rear == -1 && front == -1;
    // }
    // public void enqueue(String data){
    //     if(isFull()){
    //         System.out.println("queue is full");
    //         return;
    //     }
    //     if(front == -1){
    //         front =0;
    //     }
    //     queue[++rear]=data;
    // }
    // public String dequeue(){
    //     if(isEmpty()){
    //         System.out.println("queue is empty");
    //         return null;
    //     }
    //     String value = queue[front];
    //     if(front==rear){
    //         front=-1;
    //         rear=-1;
    //     }
    //     else{
    //         front++;
    //     }
    //     return value;
    // }
    // public String poll(){
    //     return dequeue();
    // }
    // public void display(){
    //     for(String i : queue){
    //         System.out.println(i);
    //     }
    // }
    // public boolean isPrime(int data){
    //     if(data <=1){
    //         return false;
    //     }
    //     for(int i = 0; i <= Math.sqrt(data); i++){
    //         if(data % i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}
