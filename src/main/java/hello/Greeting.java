package hello;

public class Greeting {

    private final long id;
    private final String content;
    static native void hello();

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        System.loadLibrary("HelloWorld");
        hello();
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}