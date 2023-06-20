import java.util.*;
public class queueUsingStack{
    static Stack<Integer> stack1=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();

    //insertion of data in queue
    //time complexity : O(1)
    static void enQueue(int data){
        stack1.push(data);
    }

    //deletion of data
    //time complexity : O(n)
    static int deQueue(){
        int ele;
        if(stack1.empty() && stack2.empty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                ele=stack1.pop();
                stack2.push(ele);
            }
        }
        //pop element from stack2
        ele=stack2.pop();
        return ele;

    }
    public static void main(String[] args) {
        queueUsingStack q=new queueUsingStack();
        q.enQueue(1);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(9);
        q.enQueue(14);
       

       System.out.println( "Deleted element :" +q.deQueue());
    }
}