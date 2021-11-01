package LiskovSubstitution;

public class TestDocument2 {
    public static void main(String[] args) {
        Project2 project = new Project2();
        Document2 actaProyecto = new Document2("actaProyecto");
        Document2 especificacionRequerimientos = new WritableDocument("especificacionRequerimientos");
        Document2 especificacionArquitectonica = new WritableDocument("especificacionArquitectonica");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}