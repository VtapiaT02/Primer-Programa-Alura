public class ConversionTemperaturas {
    public static void main(String[] args) {
        double gradosC = 30.4;

        double gradosF = gradosC * 1.8 + 32;
        int gradosFEnteros = (int) (gradosC * 1.8 + 32);

        System.out.printf("La conversión de %f°C es %f°F%n", gradosC, gradosF);

        System.out.printf("Y la termperatura entera es %d°F", gradosFEnteros);
    }
}
