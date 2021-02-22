package ServiceLocatoerPattern;

public class ServiceLocatoerPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocatoer.getService("Service1");
        service.execute();
        service = ServiceLocatoer.getService("Service2");
        service.execute();
        service = ServiceLocatoer.getService("Service1");
        service.execute();
        service = ServiceLocatoer.getService("Service2");
        service.execute();
    }
}
