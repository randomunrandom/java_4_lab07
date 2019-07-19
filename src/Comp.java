import java.util.Comparator;

public class Comp implements Comparator {

    public int compare(Object o1, Object o2) {
        String s1 = o1.toString(), s2=o2.toString();
        if (s1.length()>=s2.length()) {
            return 1;
        } else if (s1.length()<s2.length()) {
            return -1;
        }
        return 0;
    }
}
