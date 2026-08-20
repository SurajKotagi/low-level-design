package AdapterPattern;

public class DefaultFormatter implements Formatter {
    @Override
    public void displayFormattedString(String text) {
        System.out.println("Default Formatted Text: " + text);
    }
}
