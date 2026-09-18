package Queue;
import java.util.*;

public class Dques {
    public static void main(String[]args){
        Deque<Integer> d = new LinkedList<>();
        d.addLast(1);
        d.addFirst(2);
        d.addLast(4);
        d.removeLast();
        System.out.print(d);

    }
    
}
