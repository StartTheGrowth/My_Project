package skillfactory.comparators;

import org.apache.commons.lang3.StringUtils;
import skillfactory.entity.Student;

public class StudentUniversityIdComparator implements StudentComparator{
    @Override
    public int compare(Student student1, Student student2){
        return StringUtils.compare(student1.getUniversityId(), student2.getUniversityId());
    }
}
