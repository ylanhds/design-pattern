package flyweight.pattern.core28_13;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExtrinsicState {

    //考试科目
    private String subject;
    //考试地点
    private String location;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtrinsicState) {
            ExtrinsicState state = (ExtrinsicState) obj;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return subject.hashCode() + location.hashCode();
    }
}
