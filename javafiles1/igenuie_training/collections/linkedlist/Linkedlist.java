package collections.linkedlist;

public class Linkedlist {
    private node head;
    private class node{
        int data;
        node next;
    node(int data){
        this.data=data;
    }
}
public void add(int data){
    node newnode = new node(data);
    if(head==null){
        head = newnode;
        return;
    }
    node current = head;
    while(current.next!=null){
        current = current.next;
    }
    current.next=newnode;
}
public void addlast(int data){
    add(data);
}
public void remove(int data){
    node newnode = new node(data);

}
}
