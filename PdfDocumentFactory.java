public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Idocument createDocument() {
        return new PdfDocument();
    }
}