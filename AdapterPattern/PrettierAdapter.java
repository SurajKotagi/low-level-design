package AdapterPattern;

public class PrettierAdapter implements Formatter {

    PrettierFormatter prettierFormatter;

    public PrettierAdapter(PrettierFormatter prettierFormatter) {
        this.prettierFormatter = prettierFormatter;
    }

    @Override
    public void displayFormattedString(String text) {
        prettierFormatter.showFormatted(text);
    }
}
