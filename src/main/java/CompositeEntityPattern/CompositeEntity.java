package CompositeEntityPattern;

import java.util.List;

public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public List<String> getData() {
        return cgo.getData();
    }
}
