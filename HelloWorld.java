public class HelloWorld {
    static native void hello();
    public static void main(String[] args) {
        System.loadLibrary("HelloWorld");
        hello();
    }
}
