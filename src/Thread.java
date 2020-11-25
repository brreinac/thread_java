//Crea un hilo implementando Runnable.

//Los objetos de hilo se pueden ejecutar en sus propios hilos
//Implementa Runnable.
  class Thread implements Runnable{
	    Thread hilo;

	    //Construye un nuevo hilo.
	    Thread(String nombre){
	         hilo= new Thread(this,nombre);
	     }

	     //Un método de fábrica que crea e inicia un hilo.

	     public static Thread crearYComenzar (String nombre){
	    	 Thread miHilo=new Thread(nombre);
	    	 Thread.hilo.start(); //Inicia el hilo
	         return miHilo;
	     }

	     //Punto de entrada de hilo.
	     public void run(){
	         System.out.println(hilo.getName()+" iniciando.");
	         try {
	             for (int count=0; count<10;count++){
	                 Thread.sleep(400);
	                 System.out.println("En "+hilo.getName()+ ", el recuento es "+count);
	             }
	         }catch (InterruptedException exc){
	             System.out.println(hilo.getName()+ " interrumpudo.");
	         }
	         System.out.println(hilo.getName()+" terminado.");
	     }
	 }