class reverseLL_recur {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
    //implementation of insert at end
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
    //reversing a LL iteratively
    public void reverseLL(Node curr,Node prev){
        //last node
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr=curr.next;
        curr.next=prev;
        reverseLL(nextPtr, curr);
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
        reverseLL_recur llist=new reverseLL_recur();
        llist.insert_at_begin(10);
        llist.insert_at_begin(0);
        llist.insert_at_begin(30);
        llist.insert_at_begin(14);
        llist.insert_at_begin(45);
        llist.insert_at_begin(34);

        llist.displayLL();

        System.out.println("Reversing a linked list recursively");
        llist.reverseLL(llist.head,null);
        llist.displayLL();
    }
}


