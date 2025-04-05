package skillfactory.model;

import skillfactory.enums.StudyProfile;

public class Statistics {
    StudyProfile studyProfile;
    String universityName;
    double averageRating;
    int quantityOfUniversity;
    int quantityOfStudents;

    public Statistics() {

    }

    public Statistics(StudyProfile studyProfile, String universityName, double averageRating, int quantityOfUniversity,
                      int quantityOfStudents) {
        this.studyProfile = studyProfile;
        this.universityName = universityName;
        this.averageRating = averageRating;
        this.quantityOfUniversity = quantityOfUniversity;
        this.quantityOfStudents = quantityOfStudents;
    }

    public StudyProfile getStudyProfile() {
        return studyProfile;
    }

    public void setStudyProfile(StudyProfile studyProfile) {
        this.studyProfile = studyProfile;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public int getQuantityOfUniversity() {
        return quantityOfUniversity;
    }

    public void setQuantityOfUniversity(int quantityOfUniversity) {
        this.quantityOfUniversity = quantityOfUniversity;
    }

    public int getQuantityOfStudents() {
        return quantityOfStudents;
    }

    public void setQuantityOfStudents(int quantityOfStudents) {
        this.quantityOfStudents = quantityOfStudents;
    }
}
