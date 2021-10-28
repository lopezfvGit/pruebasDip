package Encapsulamiento;

public class TaxCalculator {  // Nueva Clase que regresa el valor de cada impuesto por Pais
	
	   public double getTaxRate(String country) {  // Ahora recibe el Pais para determianr el impuetoa regresar
	        if (country == "MX") {
	            return 0.16;
	        }
	        else if (country == "US") {
	            return 0.07;
	        }
	        else if (country == "EU") {
	            return 0.20;
	        }
	        else if (country == "JP") {
	            return 0.10;
	        }
	        else {
	            return 0;
	        }
	    }
}
