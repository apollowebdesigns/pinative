package hello;

public class HelloWorld {
    public native void print();
    static {
        System.loadLibrary("HelloWorld");
    }
}
