package editor;

public class WordDocument implements Document {

    @Override
    public void save(String content) {
        System.out.println("Saving content to Word document: " + content);
    }

    @Override
    public void display() {
        System.out.println("Displaying Word document");
    }
}
