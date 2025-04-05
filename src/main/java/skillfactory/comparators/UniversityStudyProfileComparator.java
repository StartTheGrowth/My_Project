package skillfactory.comparators;

import skillfactory.model.University;

public class UniversityStudyProfileComparator implements UniversityComparator {
    @Override
    public int compare(University university1, University university2) {
        if (university1.getMainProfile() == university2.getMainProfile()) {
            return 1;
        }
        return -1;
    }
}
