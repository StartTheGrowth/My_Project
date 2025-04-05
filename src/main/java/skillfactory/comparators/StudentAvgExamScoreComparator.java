package skillfactory.comparators;

import skillfactory.model.Student;

public class StudentAvgExamScoreComparator implements StudentComparator{
    @Override
    public int compare(Student student1, Student student2){
        return Float.compare(student1.getAvgExamScore(), student2.getAvgExamScore());
    }
}
