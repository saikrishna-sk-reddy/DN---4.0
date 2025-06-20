public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Idocument createDocument() {
        return new ExcelDocument();
    }
}