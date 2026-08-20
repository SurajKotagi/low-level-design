package AdapterPattern;

public class main {
    public static void main(String[] args) {
        String text = "Hi there!";
        // Formatter formatter = new DefaultFormatter();
        Formatter formatter = new PrettierAdapter(new PrettierFormatter());
        formatter.displayFormattedString(text);

    }
}
