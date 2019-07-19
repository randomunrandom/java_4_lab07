import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Marker {
    public static void main(String[] args) throws FileNotFoundException {
        String file_name = "full_list", files_path = "/home/random/Projects/java_4_lab07/assets/", line, group, name;
        int mark;
        double average;
        StringTokenizer tokenizer;
        Scanner scan;
        TreeSet ts = new TreeSet(new CompStudents());

        scan = new Scanner(new File(files_path + file_name + ".txt"));
        while (scan.hasNextLine()) {
            line = scan.nextLine();
            tokenizer = new StringTokenizer(line);
            name = tokenizer.nextToken();
            group = tokenizer.nextToken();
            try {
                mark = Integer.valueOf(tokenizer.nextToken());
            } catch (Exception e) {
                mark = 0;
            }
            try {
                average = Double.valueOf(tokenizer.nextToken());
            } catch (Exception e) {
                average = 0.0;
            }
            ts.add(new Student(name, group, mark, average));
        }
        System.out.println(ts);
        Iterator iter = ts.iterator();
        while(iter.hasNext()) {
            Student stud = (Student) iter.next();
            System.out.println(stud.getName()+" "+stud.getGroup()+" "+stud.getMark()+" "+stud.getAverage());
        }

    }
}
