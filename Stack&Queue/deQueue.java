import java.util.*;
public class deQueue {
    public static void main(String[] args) {
        Deque <Integer> d=new ArrayDeque<>();
        d.addFirst(5);
        d.addFirst(2);
        d.addFirst(8);
        d.addFirst(9);

        System.out.println("Dequeue looks like : "+d);
        d.addLast(4);
        d.addLast(7);
        d.addLast(2);
        System.out.println("Dequeue looks like : "+d);

        System.out.println("Element removed from stack "+d.removeLast());
        System.out.println("Element removed from queue "+d.removeFirst());
    }
}
