package LiskovSubstitution;

import java.util.ArrayList;

public class Project2
{
    private ArrayList<Document2> documents;
    private ArrayList<WritableDocument> writableDocuments;

    public Project2()
    {
        this.documents = new ArrayList<>();
        this.writableDocuments = new ArrayList<>();
    }

    public void openAll() {
        for(Document2 doc: documents) {
            doc.open();
        }
    }

    public void saveAll() {
        for(WritableDocument doc: writableDocuments) {
           doc.save();
        }
    }

    public void addDocument(Document2 document) {
        documents.add(document);

        if (document instanceof WritableDocument) {
            writableDocuments.add((WritableDocument) document);
        }
    }
}