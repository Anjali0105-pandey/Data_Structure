import java.util.*;
public class stackUsingQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    //to add new element
    static void add(int data){
        //Move all elements from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        //Push data to q2
        q1.add(data);

        //move back all datafrom q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }

    }

    //delete element from stack
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue Underflow");
            System.exit(0);
        }
        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
        stackUsingQueue s = new stackUsingQueue();
        s.add(1);
        s.add(12);
        s.add(13);
        s.add(4);
        s.add(7);
        s.add(6);

    System.out.println("Deleted element from stack is : "+s.remove());
    }
}
