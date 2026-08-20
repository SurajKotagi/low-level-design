package ProxyPattern;

public class ProxyVideo implements Video {

    private String filename;

    private Intro intro;

    public ProxyVideo(String filename) {
        this.filename = filename;
    }

    @Override
    public void play() {
        if (intro == null) {
            intro = new Intro(filename);
        }
        intro.play();
    }

}
