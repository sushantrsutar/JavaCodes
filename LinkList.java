import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.add("s");
        list.add("u");
        list.add("s");
        list.add("h");
        list.add("a");
        list.add("n");
        list.add("t");
        System.out.println(list);
        System.out.println("size="+list.size());
        System.out.println(list.indexOf("a"));
//        System.out.println(list.pop());
//        System.out.println(list.pop());
        System.out.println(list);

        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.push("sushant");
        System.out.println(list);
        for (int i=0;i<=list.size()-1;i++)
        {
            System.out.print(list.get(i)+" ");
        }

    }
}
