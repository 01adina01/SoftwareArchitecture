package editor;

public class HTMLDocument implements Document {

    @Override
    public void save(String content) {
        System.out.println("Saving content as HTML: " + content);
    }

    @Override
    public void display() {
        System.out.println("Displaying HTML document in browser");
    }
}
