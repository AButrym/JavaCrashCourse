package task2;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public abstract class Comparators implements Comparator<Student>{

    private Comparators() {

    }

    public static Comparator<Student> byName () {
        Comparator<Student> result = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        return result;
    }

    public static Comparator<Student> byCourse() {
        Comparator<Student> result = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse().compareTo(o2.getCourse());
            }
        };
        return result;
    }
}
