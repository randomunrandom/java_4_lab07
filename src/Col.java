import java.util.*;

public class Col {
    public static void main(String[] args) {
        String strings[] = {"one", "two", "three", "four"};
        LinkedList list = new LinkedList<>();
        for (String string : strings) {
            list.add(string);
        }
        list.add("one");
        list.add(123);
        System.out.println(list);

        Iterator iter = list.iterator();
        while(iter.hasNext()) System.out.println(iter.next());
        System.out.println("---");
        while(iter.hasNext()) System.out.println(iter.next());
        System.out.println("---");
        ListIterator liter = list.listIterator(list.size());
        while(liter.hasPrevious()) System.out.println(liter.previous());
        System.out.println("---");

        TreeSet ts = new TreeSet();
        for (String string : strings) {
            ts.add(string);
        }
        ts.add("one");
        try {
            ts.add(123);
        }
        catch (Exception e) {
            System.out.println("Can't add int");
        }
        System.out.println(ts);
        System.out.println("-----");
        TreeSet nts = new TreeSet(new Comp());
        nts.addAll(Arrays.asList(strings));
        System.out.println(nts);
    }
}
