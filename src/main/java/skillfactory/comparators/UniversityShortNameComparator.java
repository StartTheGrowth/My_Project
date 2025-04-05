package skillfactory.comparators;

import org.apache.commons.lang3.StringUtils;
import skillfactory.model.University;

public class UniversityShortNameComparator implements UniversityComparator{
    @Override
    public int compare(University university1, University university2){
        return StringUtils.compare(university1.getShortName(), university2.getShortName());
    }
}