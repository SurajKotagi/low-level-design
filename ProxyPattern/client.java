package ProxyPattern;

class client {
    public static void main(String[] args) {
        Video intro = new ProxyVideo("Intro.mkv");
        intro.play();
    }
}
