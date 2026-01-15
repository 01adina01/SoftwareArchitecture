package editor;

public class PDFDocument implements Document {

    @Override
    public void save(String content) {
        System.out.println("Saving content to PDF file: " + content);
    }

    @Override
    public void display() {
        System.out.println("Displaying PDF document");
    }
}
