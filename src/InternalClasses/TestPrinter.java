package InternalClasses;

public class TestPrinter {
    public static void main(String[] args) {
        Main printer = new Main();

        Main.Message msg1 = new Main.Message("hello", "Artem");
        Main.Message msg2 = new Main.Message("test", null);
        Main.Message msg3 = new Main.Message(null, null);

        printer.print(msg1);
        printer.print(msg2);
        printer.print(msg3);
    }
}
