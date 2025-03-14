package skillfactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Student> studentList = ConvertTableToCollection.copyStudentInfo();
        List<University> universityList = ConvertTableToCollection.copyUniversityInfo();
        
        for (Student student : studentList) {
            System.out.println(student);
        }
        for (University university : universityList) {
            System.out.println(university);
        }
    }
}