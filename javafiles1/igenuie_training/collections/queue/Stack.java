package collections.queue;

public class Stack {
    private int top;
    private int  maxSize; 
   private int[] stack;
   //constructor
   public Stack(int size){
    maxSize = size;
    stack = new int[maxSize];
    top=-1;
   }
   //push method
   public void push(int data){
    if(isFull()){
        System.out.println("Stack overflow");
        return;
    }
    stack[++top]=data;
   }
   //pop method
   public int pop(){
    if(isEmpty()){
        System.out.println("Stack underflow");
        return top;
    }
    return stack[top--];
   }
   //checking stack overflow
   public boolean isFull(){
        return (top==maxSize-1);
    }
    //checking stack  underflow 
    public boolean isEmpty(){
        return (top==-1);
    }
    public int size(){
        return top+1;
    }
    //display the obtained stack
    public void display(){
        if(isEmpty()){
            System.out.println("stack empty");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.println(stack[i]);
            }
        }
    }
}
