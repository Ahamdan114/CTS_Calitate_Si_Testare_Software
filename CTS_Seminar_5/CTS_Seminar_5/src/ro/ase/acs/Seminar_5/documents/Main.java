package ro.ase.acs.Seminar_5.documents;

public class Main {
    public static void main(String[] args) {
        DocumentFactory textDocFactory = new TextDocumentFactory();
        Document textDoc = textDocFactory.createFactory();
        textDoc.open();
        textDoc.save();

        System.out.println();

        DocumentFactory imgDocFactory = new ImageDocumentFactory();
        Document imgDoc = imgDocFactory.createFactory();
        imgDoc.save();
        imgDoc.save();
    }
}
