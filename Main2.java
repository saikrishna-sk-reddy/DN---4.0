// Main.java
public class Main2 {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Idocument wordDoc = wordFactory.createDocument();
        wordDoc.open();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Idocument pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Idocument excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
