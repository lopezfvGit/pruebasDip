class PruebaConValores  {  
     // La variable i es local al método   
     // Es la copia de contador  
     public int PasoValorPorValor(int i) {  
       // En la entrada del método i vale 10  
       System.out.println("i en la entrada del método    : "  
           + i);  
       // Se puede modificar sin incidencia   
       // sobre contador  
       i = 0;  
       System.out.println("i en la salida del método     : "   
           + i);  
       return i;
     }   // i va a desaparecer aquí... snif   
   }  