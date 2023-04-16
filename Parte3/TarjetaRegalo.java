    package JAVA.Capítulo14.Parte3;
    import java.util.Random;

    public class TarjetaRegalo {
        private String numero;
        private double saldo;
    
        public TarjetaRegalo(double saldo) {
            /**
             * Introducimos un try para que se pueda repetir el bucle desde el principio en caso de error
             */
            try {
                this.saldo = saldo;
                this.numero = "";
                for (int i = 0; i < 5; i++) {
                    this.numero += (int)(Math.random() * 10);
                }
            } catch (Exception e) {
                /**
                 * Introducimos el catch con getClass y getMessage, que muestran el tipo de error y lo que se ha introducido y ha provocado el error en cuestión
                 */
                System.out.println("Error al crear la tarjeta regalo: ");
                System.out.println("Excepción: " + e.getClass());
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Creación de la tarjeta finalizada.");
            }
        }
    
        public void gasta(double cantidad) {
            /**
             * Introducimos un try antes del condicional y así se pueden repetir el gasto y la disminución del saldo
             */
            try {
                if (cantidad > saldo) {
                    System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
                } else {
                    saldo -= cantidad;
                }
            } catch (Exception e) {
                /**
                 * Introducimos el catch con getClass y getMessage, que muestran el tipo de error y lo que se ha introducido y ha provocado el error en cuestión
                 */
                System.out.println("Error al gastar: ");
                System.out.println("Excepción: " + e.getClass());
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Gasto finalizado.");
            }
        }
    
        public TarjetaRegalo fusionaCon(TarjetaRegalo otra) {
             /**
             * Introducimos un try por si hay un error en el calculo de los saldos
             */
            try {
                double nuevoSaldo = this.saldo + otra.saldo;
                this.saldo = 0;
                otra.saldo = 0;
                return new TarjetaRegalo(nuevoSaldo);
                
            } catch (Exception e) {
                /**
                 * Introducimos el catch con getClass y getMessage, que muestran el tipo de error y lo que se ha introducido y ha provocado el error en cuestión
                 */
                System.out.println("Error al fusionar: ");
                System.out.println("Excepción: " + e.getClass());
                System.out.println("Error: " + e.getMessage());
                return null;
            } finally {
                System.out.println("Fusión finalizada.");
            }
        }
    
        @Override
        public String toString() {
            return "Tarjeta nº " + numero + " – Saldo " + String.format("%.2f", saldo) + "€";
        }   
    }