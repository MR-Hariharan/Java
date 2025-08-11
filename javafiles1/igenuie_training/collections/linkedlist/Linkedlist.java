package collections.linkedlist;

public class Linkedlist {
    private node head;
    private node tail;
    private class node{
        int data;
        node next;
        node prev;
    node(int data){
        this.data=data;
    }
}
        //singly linkedlist    

// public void addAtFirst(int data){
//     node newnode = new node(data);
//     newnode.next = head;
//     head = newnode;
// }

     

// public void add(int data){
//     node newnode = new node(data);
//     if(head==null){
//         head = newnode;
//         return;
//     }
//     node current = head;
//     while(current.next!=null){
//         current = current.next;
//     }
//     current.next=newnode;
// }


// public void addlast(int data){
//        add(data);
// }


// public void addMid (int data,int index){
//     node newnode = new node(data);
//     if(head ==null){
//         head = newnode;
//         return;
//     } 
//     node current = head;
//     for(int i = 0; i < index-1; i++){
//         current = current.next;
//     }
//     newnode.next = current.next;
//     current.next = newnode;
// }


// public void remove(int index){
//     if(head==null){
//         System.out.println("list is empty");
//     }
//    node current = head;
//   for(int i = 0; i < index - 1; i++){
//     current = current.next;
//   }
//    current.next =current.next.next;
// }


// public void removemid(int data){
//    node current = head;
//    while (current.next.next != null) {
//     current = current.next;
//    }
//    current.next = null;
// }


public void display(){
    node current = head;
    if(current== null){
        System.out.println("list is empty");
        return;
    }
    while(current != null){
        System.out.print(current.data+"-->");
        current = current.next;
    }
    System.out.println("null");
} 



    //doubly linkedlist

public void addAtFirst(int data){
    node newnode = new node(data);
    if(head==null){
        head =newnode;
        tail = newnode;
        return;
    }
    else{
        newnode.next = head;
        head.prev = newnode;
        head=newnode;
    }
}


public void add(int data){
    node newnode = new node(data);
    if(tail==null){
        head =newnode;
        tail = newnode;
        return;
    }
    else{
       tail.next = newnode;
       newnode.prev = tail;
       tail=newnode;
    }
}

public void addLast(int data){
    add(data);
}



}