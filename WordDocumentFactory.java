public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Idocument createDocument() {
        return new WordDocument();
    }
}