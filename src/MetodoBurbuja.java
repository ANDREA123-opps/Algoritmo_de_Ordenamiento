import java.util.Random;

public class MetodoBurbuja {
    int randomArray[] = null;
    int pos1; int pos2; boolean ascendente;

    public static void main(String[] args){}
    MetodoBurbuja bur = new MetodoBurbuja();

    public MetodoBurbuja(){
    }
    public void crearArray(){
        int numeros = 10;
        randomArray = new int[5];
        for (int i = 0; i < randomArray.length; i++){
            Random ran = new Random();
            int numerosRandom = ran.nextInt(numeros + 1);
            randomArray[i] = numerosRandom;
        }
    }
    private void intercambiarPosiciones(int pos1, int pos2){
        int auxiliar;
        auxiliar = randomArray[pos2];
        randomArray[pos2] = randomArray[pos2 + 1];
        randomArray[pos2 + 1] = auxiliar;
    }
    public void ordenar(boolean ascendente) {
        if (ascendente == true) {
            for (pos2 = 0; pos2 < randomArray.length - pos1; pos2++) {
                if (randomArray[pos2] < randomArray[pos2 + 1]) {
                    intercambiarPosiciones(pos1, pos2);
                }
            }
        } else
            for (pos2 = 0; pos2 < randomArray.length - pos1; pos2++) {
                if (randomArray[pos2] > randomArray[pos2 + 1]) {
                    intercambiarPosiciones(pos1, pos2);
                }
            }
    }
public void mostrar(){
    int i;
    System.out.print("Array desordenado:\t");
    for (i = 0; i < randomArray.length + 1; i++){
        System.out.print(randomArray[i] + ",");
    }
    System.out.print("\nArray ordenado de menor a mayor:\t");
for (pos1 = 1; pos1 < randomArray.length + 1; pos1++ ){
    ordenar(true);
    System.out.print(randomArray[pos2] + ",");
}
System.out.println("\nArray ordenado de mayor a menor:\t");
for (pos1 = 1; pos1 < randomArray.length + 1; pos1 ++){
    ordenar(false);
    System.out.print(randomArray[pos2] + ",");
}
    }
}
