package skillfactory;

import skillfactory.comparators.StudentComparator;
import skillfactory.comparators.UniversityComparator;
import skillfactory.handlers.*;
import skillfactory.model.Statistics;
import skillfactory.model.Student;
import skillfactory.model.University;
import skillfactory.enums.StudentCompare;
import skillfactory.enums.UniversityCompare;

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

        String jsonStringStudents = JsonUtil.toJsonListStringStudents(studentList);
        System.out.println(jsonStringStudents);

        List<Student> studentsFromJson = JsonUtil.fromJsonListStringStudents(jsonStringStudents);
        System.out.println(studentsFromJson);
        System.out.println(studentsFromJson.size() == studentList.size());

        String jsonStringUniversities = JsonUtil.toJsonStringUniversities(universityList);
        System.out.println(jsonStringUniversities);

        List<University> universitiesFromJson = JsonUtil.fromJsonListStringUniversities(jsonStringUniversities);
        System.out.println(universitiesFromJson);
        System.out.println(universitiesFromJson.size() == universityList.size());

        List<Statistics> statisticsList = StatisticUtils.statisticsAssembly(studentList, universityList);
        XlsWriter xlsWriter = new XlsWriter();
        xlsWriter.tableGenerate(statisticsList, "C:\\Development\\JAVA\\My_Project\\src\\main\\resources\\Statistic.xlsx");
    }
}