package editor;

public class DocumentEditor {

    private Document document;

    public DocumentEditor(String documentType) {
        this.document = DocumentFactory.createDocument(documentType);
    }

    public void write(String content) {
        document.save(content);
    }

    public void show() {
        document.display();
    }
}
