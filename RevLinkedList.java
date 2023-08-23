import java.util.LinkedList;

public class RevLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.print(list);
        System.out.println(" ");
        LinkedList<Integer>revList=new LinkedList<>();
        list.descendingIterator().forEachRemaining(revList::add);
        System.out.println(revList);
    }
}
