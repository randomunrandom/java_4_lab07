import java.util.Comparator;

public class CompStudents implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1, s2=(Student) o2;
        if (s1.getMark()>=s2.getMark()) return 1;
        else return -1;
    }
}
