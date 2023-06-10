class deleteAtAnyNode {
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
    //delete at Any Node
    public void delete_At_Any_Node(int pos){
        if(head==null){
            return;
        }

        Node temp=head;
        //deletion at begining

        if(pos==0){
            head=temp.next;
            return;
        }

        //deletion at any other point
        for (int i = 0; temp!=null && i<pos-1; i++) {
            temp=temp.next;
        }
        if(temp==null && temp.next==null){
            return;
        }    
        temp.next=temp.next.next;
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
        deleteAtAnyNode llist=new deleteAtAnyNode();
        llist.insert_at_begin(10);
        llist.insert_at_begin(0);
        llist.insert_at_begin(30);
        llist.insert_at_begin(14);
        llist.insert_at_begin(45);
        llist.insert_at_begin(34);

        llist.displayLL();

        llist.delete_At_Any_Node(1);
        System.out.println("After deletion");
        llist.displayLL();
    }
}
