package skillfactory.handlers;

import org.apache.commons.lang3.StringUtils;
import skillfactory.enums.StudyProfile;
import skillfactory.model.Statistics;
import skillfactory.model.Student;
import skillfactory.model.University;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

public class StatisticUtils {
       private StatisticUtils() throws IOException {
    }

    public static List<Statistics> statisticsAssembly(List<Student> students, List<University> universities) {
        List<Statistics> statisticsList = new ArrayList<>();
        Set<StudyProfile> studyProfiles = universities.stream().map(University::getMainProfile).collect(Collectors.toSet());
        studyProfiles.forEach(studyProfile -> {
            Statistics statistics = new Statistics();
            statisticsList.add(statistics);
            statistics.setStudyProfile(studyProfile);

            List<String> profileUniversityId = universities.stream().filter(university -> university.getMainProfile()
                    .equals(studyProfile)).map(University::getId).collect(Collectors.toList());
            statistics.setQuantityOfUniversity(profileUniversityId.size());
            statistics.setUniversityName(StringUtils.EMPTY);
            universities.stream().filter(university -> profileUniversityId.contains(university.getId()))
                    .map(University::getFullName).forEach(fullNameUniversity ->
                            statistics.setUniversityName(statistics.getUniversityName() + fullNameUniversity + ";"));

            List<Student> profileStudents = students.stream()
                    .filter(student -> profileUniversityId.contains(student.getUniversityId()))
                    .collect(Collectors.toList());
            statistics.setQuantityOfStudents(profileStudents.size());
            OptionalDouble avgExamScore = profileStudents.stream()
                    .mapToDouble(Student::getAvgExamScore)
                    .average();
            statistics.setAverageRating(0);
            avgExamScore.ifPresent(value -> statistics.setAverageRating(
                    (float) BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue()));
        });
        return  statisticsList;
    }
}
