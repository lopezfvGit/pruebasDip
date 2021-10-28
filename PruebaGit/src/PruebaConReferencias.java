class PruebaConReferencias  {  
     // La variable m es local al método   
     // y es una copia de mc (ver más adelante Execute() )  
	
     public void  PasoRefPorValor(MiClaseDePrueba pruebaconreferencia) {  
       // En la entrada al método m.miInt vale 10  
       System.out.println(  
         "pruebaconreferencia en la entrada al método: " + pruebaconreferencia.ToString());  
  
       pruebaconreferencia.setMiInt(0);  
       System.out.println(  
         "pruebaconreferencia en la salida al método : " + pruebaconreferencia.ToString());  
     }  
   } 