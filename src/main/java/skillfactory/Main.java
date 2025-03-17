package skillfactory;

import skillfactory.comparators.StudentComparator;
import skillfactory.comparators.UniversityComparator;
import skillfactory.handlers.ConvertTableToCollection;
import skillfactory.entity.Student;
import skillfactory.entity.University;
import skillfactory.enums.StudentCompare;
import skillfactory.enums.UniversityCompare;
import skillfactory.handlers.CaseCompare;

import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = ConvertTableToCollection.copyStudentsInfo();
        List<University> universityList = ConvertTableToCollection.copyUniversitiesInfo();

        StudentComparator studentComparator = CaseCompare.studentComparator(StudentCompare.AVG_EXAM_SCORE);
        studentList.stream().sorted(studentComparator.reversed()).forEach(System.out::println);
        System.out.print("\n");

        UniversityComparator universityComparator = CaseCompare.universityComparator(UniversityCompare.FULL_NAME);
        universityList.stream().sorted(universityComparator).forEach(System.out::println);
        System.out.print("\n");

        UniversityComparator universityComparator1 = CaseCompare.universityComparator(UniversityCompare.MAIN_PROFILE);
        universityList.stream().sorted(universityComparator1).forEach(System.out::println);
    }
}