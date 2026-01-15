package editor;

public class Main {

    public static void main(String[] args) {

        // Simulating user choosing document type
        DocumentEditor editor = new DocumentEditor("pdf");

        editor.write("Hello, this is my document!");
        editor.show();
    }
}
