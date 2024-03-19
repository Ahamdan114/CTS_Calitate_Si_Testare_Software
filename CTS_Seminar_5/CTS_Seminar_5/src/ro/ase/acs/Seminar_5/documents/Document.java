package ro.ase.acs.Seminar_5.documents;

public interface Document {
    void open();
    void save();
}

class TextDocument implements Document {

    @Override
    public void open() {
        System.out.println("TextDocument " + "opened");
    }

    @Override
    public void save() {
        System.out.println("TextDocument " + "saved");
    }
}


class ImageDocument implements Document {

    @Override
    public void open() {
        System.out.println("ImageDocument " + "opened");
    }

    @Override
    public void save() {
        System.out.println("ImageDocument " + "saved");
    }
}

interface DocumentFactory {
    Document createFactory();
}

class TextDocumentFactory implements DocumentFactory {

    @Override
    public Document createFactory() {
        return new TextDocument();
    }
}

class ImageDocumentFactory implements DocumentFactory {

    @Override
    public Document createFactory() {
        return new ImageDocument();
    }
}