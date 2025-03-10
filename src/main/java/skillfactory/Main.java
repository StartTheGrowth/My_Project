package skillfactory;

public class Main {
    public static void main(String[] args) {
        University hseUniversity = new University("12563", "Высшая школа экономики", "ВШЭ", "4",
                555000.6F, 1992, StudyProfile.SOCIOLOGY);
        Student student = new Student("Elena", "25639874", 1, 8.7F);
        System.out.println(hseUniversity + "\n" + student);
    }
}