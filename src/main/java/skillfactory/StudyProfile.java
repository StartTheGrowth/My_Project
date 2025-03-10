package skillfactory;

public enum StudyProfile {
    MEDICINE("Медицина"),
    JOURNALISM("Журналистика"),
    BIOLOGY("Биология"),
    ASTROPHYSICS("Астрофизика"),
    SOCIOLOGY("Социология")
    ;
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
