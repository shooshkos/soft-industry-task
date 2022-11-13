package api;

public enum WebServiceEndPoints {
    SEARCH_REPOSITORIES("https://waarkoop-server.herokuapp.com/api/v1/search/test/{product}", "GET");

    private final String url;
    private final String method;

    WebServiceEndPoints(String url, String method) {
        this.url = url;
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public String getMethod() {
        return method;
    }
}
