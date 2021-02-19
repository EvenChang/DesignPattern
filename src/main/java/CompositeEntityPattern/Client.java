package CompositeEntityPattern;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (String datum : compositeEntity.getData()) {
            System.out.println("Data: " + datum);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
