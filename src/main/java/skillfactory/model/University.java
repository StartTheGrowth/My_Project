package skillfactory.model;

import com.google.gson.annotations.SerializedName;
import skillfactory.enums.StudyProfile;

import java.util.Objects;

public class University {
    @SerializedName("id")
    String id;
    @SerializedName("fullName")
    String fullName;
    @SerializedName("shortName")
    String shortName;
    String ranking;
    float avgPriceOfStudy;
    @SerializedName("yearOfFoundation")
    int yearOfFoundation;
    @SerializedName("mainProfile")
    StudyProfile mainProfile;

    public University() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return yearOfFoundation == that.yearOfFoundation && Objects.equals(id, that.id) &&
                Objects.equals(fullName, that.fullName) && Objects.equals(shortName, that.shortName) &&
                mainProfile == that.mainProfile;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, shortName, yearOfFoundation, mainProfile);
    }
}