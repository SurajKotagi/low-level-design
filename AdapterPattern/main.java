package AdapterPattern;

interface Formatter {
    void displayFormattedString(String text);
}

class DefaultFormatter implements Formatter {
    @Override
    public void displayFormattedString(String text) {
        System.out.println("Default Formatted Text: " + text);
    }
}

public class main {
    public static void main(String[] args) {
        String input = "Hello, there !";
        Formatter formatter = new DefaultFormatter();
        formatter.displayFormattedString(input);

        Formatter prettierFormatter = new PrettierAdapter(new PrettierFormatter());
        prettierFormatter.displayFormattedString(input);
    }
}

class PrettierFormatter {
    void showFormatted(String text) {
        System.out.println("Prettier Formatted Text: " + text);
    }
}

class PrettierAdapter implements Formatter {

    PrettierFormatter prettierFormatter;

    public PrettierAdapter(PrettierFormatter prettierFormatter) {
        this.prettierFormatter = prettierFormatter;
    }

    @Override
    public void displayFormattedString(String text) {
        prettierFormatter.showFormatted(text);
    }
}