package ProxyPattern;

public class Intro implements Video {
    private String filename;

    Intro(String filename) {
        this.filename = filename;
        System.out.println("Loading video " + filename);
    }

    @Override
    public void play() {
        System.out.println("Intro video " + filename + " playing ...");
    }

}
