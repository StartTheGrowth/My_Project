package skillfactory.handlers;

import skillfactory.comparators.*;
import skillfactory.enums.StudentCompare;
import skillfactory.enums.UniversityCompare;

public class CaseCompare {
    public static StudentComparator studentComparator(StudentCompare studentCompare) {
        switch (studentCompare) {
            case ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                return new StudentNameComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            case CURRENT_COURSE:
                return new StudentCurrentCourseNumberComparator();
        }
        return null;
    }

    public static UniversityComparator universityComparator(UniversityCompare universityCompare) {
        switch (universityCompare) {
            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case YEARS_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            case MAIN_PROFILE:
                return new UniversityStudyProfileComparator();
        }
        return null;
    }

    private CaseCompare() {
    }
}