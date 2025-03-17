package skillfactory.enums;

public enum UniversityCompare {
    FULL_NAME("Полное наименование"),
    SHORT_NAME("Сокращенное наименование"),
    YEARS_OF_FOUNDATION("Год основания"),
    ID("Id"),
    MAIN_PROFILE("Профиль обучения");
    private String variantOfCompare;

    UniversityCompare(String variantOfCompare) {
        this.variantOfCompare = variantOfCompare;
    }

    public String getVariantOfCompare() {
        return variantOfCompare;
    }
}
