class insertAfterAnyNode {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    //implementation of insert at beginning
    public void insert_at_begin(int newData){
        Node newNode=new Node(newData);

        //linkedlist is empty
        if(head==null){
            head = new Node(newData);
            return;
        }

        //linked list is not empty
        newNode.next=head;
        head=newNode;
        return;
    }
    //implementation of insert after anynode 
    public void insert_after_any_node(Node prevNode,int newData){
        
        if(prevNode==null){
            System.out.println("Previous node cannot be null");
            return;
        }
        Node newNode=new Node(newData);
        newNode.next=prevNode.next;
        prevNode.next=newNode;

    }
    //implementation of display function
    public void displayLL(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAfterAnyNode llist=new insertAfterAnyNode();
        llist.insert_at_begin(10);
        llist.insert_at_begin(0);
        llist.insert_at_begin(30);
        llist.insert_at_begin(14);
        llist.insert_at_begin(45);
        llist.insert_at_begin(34);

        llist.displayLL();
        llist.insert_after_any_node(llist.head.next.next, 15);
        System.out.println("After 14, 15 is added new linked list");
        llist.displayLL();
    }
}

