package skillfactory.enums;

public enum StudentCompare {
    FULL_NAME("Полное имя"),
    CURRENT_COURSE("Текущий курс"),
    AVG_EXAM_SCORE("Средняя оценка"),
    ID("Id студента");
    private String variantOfCompare;

     StudentCompare(String variantOfCompare) {
        this.variantOfCompare = variantOfCompare;
    }

    public String getVariantOfCompare() {
        return variantOfCompare;
    }
}