public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";
// código que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Pelicula Retro que aún valen la pena ver");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Que disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }

}
