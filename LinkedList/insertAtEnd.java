class insertAtEnd {
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
    public void insert_at_end(int newData){
        Node newNode=new Node(newData);

        //linkedlist is empty
        if(head==null){
            head = new Node(newData);
            return;
        }

        //linked list is not empty
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
        return;
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
        insertAtEnd llist=new insertAtEnd();
        llist.insert_at_end(10);
        llist.insert_at_end(0);
        llist.insert_at_end(30);
        llist.insert_at_end(14);
        llist.insert_at_end(45);
        llist.insert_at_end(34);

        llist.displayLL();
    }
}
