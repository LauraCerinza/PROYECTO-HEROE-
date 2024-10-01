public class Heroee {
   private int vidas;
   private int x;
   private String nombre;
   private boolean saltando;
   public Heroeeint x, String nombre) {
       this.vidas = 3; 
       this.x = x; 
       this.nombre = nombre; 
       this.saltando = false; 
   }
   public int getVidas() {
       return vidas;
   }
   public void setX(int x) {
       this.x = x;
   }
   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   public boolean getSaltando() {
       return saltando;
   }
   public void avanzar() {
       x++;
       System.out.println(this.nombre + " listo para avanzar a la posición " + x);
       if (x % 10 == 0) {
           saltar();
       } else {
           if (saltando) {
               saltando = false;
               vidas--;
               System.out.println("perdido una vida. Vidas restantes: " + vidas);
           }
       }
   }
   public void saltar() {
           saltando = true;
           System.out.println(this.nombre + " saltando");
   }
}