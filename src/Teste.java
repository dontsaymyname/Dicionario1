import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NumerosLoteria numero0 = new NumerosLoteria();
        numero0.setNumero(0);
        numero0.setSignificado("Ovos");

        NumerosLoteria numero1 = new NumerosLoteria();
        numero1.setNumero(1);
        numero1.setSignificado("Água");

        NumerosLoteria numero2 = new NumerosLoteria();
        numero2.setNumero(2);
        numero2.setSignificado("Escopeta");

        NumerosLoteria numero3 = new NumerosLoteria();
        numero3.setNumero(3);
        numero3.setSignificado("Cavalo");

        NumerosLoteria numero4 = new NumerosLoteria();
        numero4.setNumero(4);
        numero4.setSignificado("Dentista");

        NumerosLoteria numero5 = new NumerosLoteria();
        numero5.setNumero(5);
        numero5.setSignificado("Fogo");

        Map<Integer, String> mapNumeros = new HashMap<>();
        mapNumeros.put(numero0.getNumero(), numero0.getSignificado());
        mapNumeros.put(numero1.getNumero(), numero1.getSignificado());
        mapNumeros.put(numero2.getNumero(), numero2.getSignificado());
        mapNumeros.put(numero3.getNumero(), numero3.getSignificado());
        mapNumeros.put(numero4.getNumero(), numero4.getSignificado());
        mapNumeros.put(numero5.getNumero(), numero5.getSignificado());

        System.out.println(mapNumeros.size());

        for (Integer umaChave: mapNumeros.keySet()){
            String valor = mapNumeros.get(umaChave);
            String numeroCompleto = umaChave + " - " + valor;
            System.out.println(numeroCompleto);
        }

        int max = 5;
        int min = 0;
        Random random = new Random();
        int randomInt = random.nextInt((max - min) + 1) + min;
        System.out.println("Numero aleatorio: "+randomInt + " - " + mapNumeros.get(randomInt));



    }
}
