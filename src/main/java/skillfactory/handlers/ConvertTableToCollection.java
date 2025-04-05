package skillfactory.handlers;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import skillfactory.model.Student;
import skillfactory.model.University;
import skillfactory.enums.StudyProfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConvertTableToCollection {
    public static List<Student> copyStudentsInfo() throws IOException {
        Student student;
        List<Student> students = new ArrayList<>();
        File file = new File("C:\\Development\\JAVA\\My_Project\\src\\main\\resources\\universityInfo.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Студенты");
        Iterator<Row> rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            student = new Student();
            student.setUniversityId(row.getCell(0).getStringCellValue());
            student.setFullName(row.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int) row.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float) row.getCell(3).getNumericCellValue());
            students.add(student);
        }
        return students;
    }

    public static List<University> copyUniversitiesInfo() throws IOException {
        University university;
        List<University> universities = new ArrayList<>();
        File file = new File("C:\\Development\\JAVA\\My_Project\\src\\main\\resources\\universityInfo.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        Sheet sheet = workbook.getSheet("Университеты");
        Iterator<Row>rowIterator = sheet.iterator();
        rowIterator.next();
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();
            university = new University();
            university.setId(row.getCell(0).getStringCellValue());
            university.setFullName(row.getCell(1).getStringCellValue());
            university.setShortName(row.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int) row.getCell(3).getNumericCellValue());
            university.setMainProfile(StudyProfile.valueOf(row.getCell(4).getStringCellValue()));
            universities.add(university);
        }
        return universities;
    }

    private ConvertTableToCollection() throws IOException {
    }
}