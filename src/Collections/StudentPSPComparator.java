package Collections;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return s1.age-s2.age;
    }

}
