class ThreadsTest {
     public static void main(String[] args) {
         System.out.println("Hilo principal iniciando.");

         Thread miHilo1 = Thread.crearYComenzar("#1");
         Thread miHilo2 = Thread.crearYComenzar("#2");
         Thread miHilo3 = Thread.crearYComenzar("#3");

         for (int i = 0; i < 50; i++) {
             System.out.print(".");
             try {
                 Thread.sleep(100);
             } catch (InterruptedException exc) {
                 System.out.println("Hilo principal interrumpido.");
             }
         }
         System.out.println("Hilo principal finalizado");
     }
 }