package SingleResponsibility;

public class TestEmployee2 
	{
	    public static void main(String[] args) {
	        Employee2 lolita = new Employee2("Lola alias Lolita");   // Se genera la nueva instacia lolita de Employye2 asignándole el String "Lola alias Lolita"
	        TimeSheetReport timeSheetReport = new TimeSheetReport(); //Se genera la nueva instancia para accesar de la nueva Clase el TimeSheet de Lolita
	        timeSheetReport.print(lolita);                           // Se llama a la nueva clase pasándole el Objeto
	    }
	    
	}
