package InterceptingFilterPattern;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void setRequest(String request) {
        filterManager.filterRequest(request);
    }
}
