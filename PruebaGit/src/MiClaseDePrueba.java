class MiClaseDePrueba {  
       private int miInt;  
  
       public int getMiInt() {  
           return miInt;  
       }  
       public void setMiInt(int miInt) {  
           this.miInt = miInt;  
       }  
  
       public MiClaseDePrueba(int miInt) {  
           setMiInt(miInt);  
       }  
  
       // Muestra la referencia en el heap  
       // y el valor de la propiedad miInt  
       public String ToString()  
       {  
           return "Ref:" + this.hashCode()  // el object.hashcode() devuelve la referencia del objeto en memoria heap
               + " MiInt:" + this.miInt;  
       }  
   }   