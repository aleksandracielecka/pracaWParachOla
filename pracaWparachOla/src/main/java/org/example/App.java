package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );



    // Zadanie 2:
    //Stwórz tablicę nazw europejskich miast i następnie wypisz je na następujące sposoby:
    //od początku do końca
    //od końca do początku
    //co drugie miasto

    String[] cities = new String[] { "Londyn", "Warszawa", "Paryż", "Madryt", "Budapeszt"};

        for ( String city : cities ) {
    System.out.println(city);

}
        System.out.println("Miasta wypisane od końca:");
        for (Integer i = cities.length - 1; i >= 0; i--){
    System.out.println(cities[i]);
}
        System.out.println("Miasta wypisane co drugie:");
        for (Integer a = 0; a < cities.length; a += 2){
            System.out.println(cities[a]);
        }

//        Zadanie 3:
//Stwórz tablicę liczb zmiennoprzecinkowych i następnie oblicz sumę oraz średnią tych liczb.

        Float[] liczbyZ = new Float[5];
        liczbyZ[0] = 4.5f;
        liczbyZ[1] = 3.0f;
        liczbyZ[2] = 1.0f;
        liczbyZ[3] = 1.0f;
        liczbyZ[4] = 2.0f;

        Float suma = 0f;

        for (int i = 0; i < liczbyZ.length; i++) {
            suma += liczbyZ[i];
        }
        System.out.println(suma);

        Float srednia = 0f;
        for (int i = 0; i < liczbyZ.length; i++) {
            srednia = suma/liczbyZ.length;
        }
        System.out.println(srednia);

////        // Hej
////        Zadanie 4:
//
//
////        Stwórz tablicę imion (z powtórzeniami) i następnie policz, ile razy występuje w niej imię "Jan".
//
//        String [] imiona = new String [] {"Jan", "Zosia", "Ela", "Jan", "Jan", "Jan"};
//        Integer count = 0;
//
//        for (String j; j<imiona.length; ){
//
//        }

//            Zadanie 5:
//        Stwórz tablicę imion (bez powtórzeń) i następnie podaj, na którym indexie znajduje się w niej imię "Jan".
//            Zadanie 6:
//        Stwórz tablicę liczb całkowitych i następnie znajdź największy i najmniejszy element tej tablicy.

    }


}
