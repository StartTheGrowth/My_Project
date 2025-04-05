package skillfactory.handlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import skillfactory.model.Student;
import skillfactory.model.University;

import java.lang.reflect.Type;
import java.util.List;

public class JsonUtil {
    private JsonUtil() {
    }

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static String toJsonStringStudent(Student student) {
        return gson.toJson(student);
    }

    public static String toJsonListStringStudents(List<Student> students) {
        return gson.toJson(students);
    }

    public static String toJsonStringUniversity(University university) {
        return gson.toJson(university);
    }

    public static String toJsonStringUniversities(List<University> universities) {
        return gson.toJson(universities);
    }

    public static Student fromJsonStringStudent(String json) {
        return gson.fromJson(json, Student.class);
    }

    public static List<Student> fromJsonListStringStudents(String json) {
        Type listType = new TypeToken<List<Student>>() {}.getType();
        return gson.fromJson(json, listType);
    }

    public static University fromJsonStringUniversity(String json) {
        return gson.fromJson(json, University.class);
    }

    public static List<University> fromJsonListStringUniversities(String json) {
        Type listType = new TypeToken<List<University>>() {}.getType();
        return gson.fromJson(json, listType);
    }
}
