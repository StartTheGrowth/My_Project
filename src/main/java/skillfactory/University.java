package skillfactory;

public class University {
    String id;
    String fullName;
    String shortName;
    String ranking;
    float avgPriceOfStudy;
    int yearOfFoundation;
    StudyProfile mainProfile;

    public University(String id, String fullName, String shortName, String ranking, float avgPriceOfStudy,
                      int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
        this.shortName = shortName;
        this.ranking = ranking;
        this.avgPriceOfStudy = avgPriceOfStudy;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public float getAvgPriceOfStudy() {
        return avgPriceOfStudy;
    }

    public void setAvgPriceOfStudy(float avgPriceOfStudy) {
        this.avgPriceOfStudy = avgPriceOfStudy;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", ranking='" + ranking + '\'' +
                ", avgPriceOfStudy=" + avgPriceOfStudy +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile +
                '}';
    }
}