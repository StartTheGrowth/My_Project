package skillfactory;

public enum StudyProfile {
    MEDICINE("Медицина"),
    JOURNALISM("Журналистика"),
    BIOLOGY("Биология"),
    ASTROPHYSICS("Астрофизика"),
    SOCIOLOGY("Социология"),
    PHYSICS("Физика"),
    LINGUISTICS("Лингвистика"),
    MATHEMATICS("Математика")
    ;
    private String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileName() {
        return profileName;
    }
}
