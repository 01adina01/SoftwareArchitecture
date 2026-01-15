package editor;

public class DocumentFactory {

    public static Document createDocument(String type) {

        if (type == null) {
            throw new IllegalArgumentException("Document type cannot be null");
        }

        switch (type.toLowerCase()) {
            case "pdf":
                return new PDFDocument();
            case "word":
                return new WordDocument();
            case "html":
                return new HTMLDocument();
            default:
                throw new IllegalArgumentException("Unsupported document type: " + type);
        }
    }
}

