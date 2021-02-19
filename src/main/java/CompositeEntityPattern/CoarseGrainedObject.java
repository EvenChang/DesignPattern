package CompositeEntityPattern;

import java.util.Arrays;
import java.util.List;

public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setData(String data1, String data2) {
        do1.setData(data1);
        do2.setData(data2);
    }

    public List<String> getData() {
        return Arrays.asList(do1.getData(), do2.getData());
    }
}
