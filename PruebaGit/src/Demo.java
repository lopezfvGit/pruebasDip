
class Demo {  
         
     public void Execute(){  
      
       // Para devolver un único argumento
       PruebaConValores t = new PruebaConValores();  
       int contador = 10;  
       System.out.println("contador antes de llamada     : "  
           + contador);  
       
       // Durante la llamada a PasoValorPorValor   
       // se realiza una copia de contador ***  Al poner "contador =" le estoy pasando el nuevo valor 0 a contador
       //contador = t.PasoValorPorValor(contador);  
       // ó usar: 
       //se realiza una copia de contador ***  Aunque el contador vale 0 no se asigna al contador, conserva su valor de 10
       t.PasoValorPorValor(contador);  
       
       // Aquí contador vale siempre 10   
       // y la copia ha desaparecido  
       System.out.println("contador después de la llamada: "  
           + contador + "\n"); 
       
       //*************************************************************************************************************
       // Cuando se desea devolver el resultado de un cálculo y un codigo de error => Crear una clase para
       // encapsular el tipo primitivo de un objeto 
       // Un ojeto de tipo por referencia tiene us propia zona de moemoria en la pila que contiene sus miembros y una referencia a esta zona registrada en una variable tipada inscrita en la pila (stak)
       PruebaConReferencias t1 = new PruebaConReferencias(); 
       
       // Instanciación de un objeto MiClaseDePrueba  *** es un nuevo objeto 
       // con inicialización de su propiedad miInt a 10  
       MiClaseDePrueba miclasedeprueba = new MiClaseDePrueba(10);  
       
       // Visualización en la consola  
       System.out.println(  
         "miclasedeprueba antes de la llamada        : "+ miclasedeprueba.ToString());  
  
       // Durante la llamada a PasoRefPorValor    
       // se crea una copia de la referencia miclasedeprueba   
       // en el stack  
       t1.PasoRefPorValor(miclasedeprueba);  
  
       // Por lo tanto, aquí mc.miInt vale ahora 0   
       // porque la copia de mc referenciaba    
       // al mismo objeto en el heap.  
       System.out.println(  
         "miclasedeprueba después de la llamada      : " + miclasedeprueba.ToString());  
     }  
   }