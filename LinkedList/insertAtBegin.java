class insertAtBegin {
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
    //implementation of display function
    public void displayLL(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        insertAtBegin llist=new insertAtBegin();
        llist.insert_at_begin(10);
        llist.insert_at_begin(0);
        llist.insert_at_begin(30);
        llist.insert_at_begin(14);
        llist.insert_at_begin(45);
        llist.insert_at_begin(34);

        llist.displayLL();
    }
}
