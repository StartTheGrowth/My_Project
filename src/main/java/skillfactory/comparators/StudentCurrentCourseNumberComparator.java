package skillfactory.comparators;

import skillfactory.model.Student;

public class StudentCurrentCourseNumberComparator implements StudentComparator {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getCurrentCourseNumber(), student2.getCurrentCourseNumber());
    }
}
