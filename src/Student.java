import java.util.Comparator;

public class Student {
    String name;
    String group;
    int mark;
    double average;

    Student(String Name, String Group, int Mark, double Average) {
        name = Name;
        group = Group;
        mark = Mark;
        average = Average;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getMark() {
        return mark;
    }

    public double getAverage() {
        return average;
    }

}
