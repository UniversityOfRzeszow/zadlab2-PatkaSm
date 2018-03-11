package pl.edu.ur.main;
import java.util.*;
/**
 *
 * @author marcin
 */
public class Main {
    
    private static void Zadanie1(double tab[]){
        int x;
        do {
            System.out.println("Wybierz działanie: \n 1.Wyświetlanie tablicy od pierwszego do ostatniego indeksu. \n 2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu. \n 3.Wyświetlanie elementów o nieparzystych indeksach. \n 4.Wyświetlanie elementów o parzystych indeksach. \n Aby wyjść z menu wpisz 5 ");
            Scanner in = new Scanner(System.in);
            x = in.nextInt();
            switch (x) {
                case 1:
                    for( int i = 0; i<10; i++){
                        System.out.println("" + tab[i]);}
                    break;
                case 2:
                    for( int i = 9; i>=0; i--){
                        System.out.println("" + tab[i]); }
                    break;
                case 3:
                    for( int i = 0; i<10; i++){
                        if (i%2 == 0)
                            System.out.println("" + tab[i]);}
                    break;
                case 4:
                    for( int i = 0; i<10; i++){
                        if (i%2 != 0)
                            System.out.println("" + tab[i]);}
                    break;
                default:
                    break;
            }
        } while (x != 5);
    }
    private static void Zadanie2(double tab[]){
        int y;
        do{
        Scanner in = new Scanner(System.in);
        System.out.println("Wyberz działanie: \n 1. Suma elementów tablicy \n 2. Iloczyn elementów tablicy \n 3. Wartość średna elementów tablicy \n 4. Wartośc minimalna tablicy \n 5. Wartość maksymalna tablicy \n 6. Wyjście.");
        y = in.nextInt();
        switch(y){
            case 1:
                double wynik = 0;
                for( int i = 0; i<10; i++){
                    wynik += tab[i];
                }
                    System.out.println("Suma elementów tablicy wynosi: " +wynik); break;
            case 2:
                double wynik2 = 1;
                for( int i = 0; i<10; i++){
                    wynik2 *= tab[i];
                }
                    System.out.println("Iloczyn elementów tablicy wynosi: " +wynik2); break;
            case 3: 
                double wynik3 = 0;
                int licznik = 0;
                for( int i = 0; i<10; i++){
                    wynik3 += tab[i];
                    licznik ++;
                }
                    System.out.println("Wartość średna elementów tablicy wynosi: " +wynik3/licznik); break;
            case 4:
                double min = tab[1];
                for(int i = 0; i<10; i++){
                    if (min > tab[i]){
                        min = tab[i];
                    }
                }
                    System.out.println("Element minialny tablicy wynosi: " + min); break;
            case 5: 
                double max = tab[0];
                for( int i = 0; i<10; i++){
                    if (max < tab[i]){
                        max = tab[i];
                    }
                }
                    System.out.println("Element maksymalny tablicy wynosi: " + max); break;
                }
            }
        while (y != 6);
    }
    private static void Zadanie3(){
        int z;
        Scanner in = new Scanner(System.in);
        for(;;){
        System.out.println("Wpisz liczbę całkowitą: ");
        z = in.nextInt();
        if(z<0){
            break;
        }
        }
    }
     private static void sort(int tab[], int a){
    int temp;
    int zmiana = 1;
    for(int j = 0; j<a; j++){
        for(int i=0; i<a-1; i++){
            if(tab[i]>tab[i+1]){
            temp = tab[i+1];
            tab[i+1] = tab[i];
            tab[i] = temp;
        zmiana++;
            }
        }
    }
    for(int i=0; i<a; i++){
    System.out.print(" "+ tab[i]);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        int n;
        int x;
        Scanner input = new Scanner(System.in);
        double[] tab;
        tab = new double[10];
        do{
        System.out.println("\n Podaj numer zadania: \n 1. Zadanie 1 \n 2. Zadanie 2 \n 3. Zadanie 3 \n 4. Zadanie 4 \n 5. Wyjście z menu");
        n = input.nextInt();
        switch(n){
            case 1:
                System.out.println("Podaj 10 liczb do tablicy: ");
                for(int i=0; i<10; i++){
                    tab[i] = input.nextDouble();
                }
                Zadanie1(tab); break;
            case 2:
                System.out.println("Podaj 10 liczb do tablicy: ");
                for(int i=0; i<10; i++){
                    tab[i] = input.nextDouble();
                }
                x = input.nextInt();
                Zadanie2(tab);break;
            case 3:
                Zadanie3(); break;
            case 4:
                Scanner in = new Scanner(System.in);
                System.out.println("Podaj ile liczb chcesz wpisać: ");
                int l = in.nextInt();
                int[] tab2 = new int[l];
                System.out.println("Podaj elementy tablicy:");
                for(int i=0; i<l; i++){
                    tab2[i] = input.nextInt();
                }
                sort(tab2,l);
                break;
            case 5: break;
        }
    } while (n != 5);
}
}