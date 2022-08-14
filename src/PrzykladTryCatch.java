import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PrzykladTryCatch {
    public static void main(String[] args) throws IOException {
        int tab[] = {1, 2, 3, 4, 5};
        BufferedReader odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;
        System.out.println("podaj indeks któey chcesz zobaczyc");
        boolean czyPoprawne = false;

        while (!czyPoprawne) {
            try {
                index = Integer.parseInt(odczyt.readLine());
            } catch (NumberFormatException e) {
                System.out.println("niepoprawne dane! nie ten format indeksu " + tab.length + " elementów poczawszy od 0");
            } catch (IOException n) {
                System.out.println("niepoprawna wartosc indrksu tablicy, tablica zawiera " + tab.length + " elementów poczawszy od 0");
            }
            czyPoprawne = index == -1? false : true;
            //jeśli index wynosi -1 to przypisz do zminnej fartosc false w innym przypadku wartosc true
        }
        try {
            System.out.println(tab[index-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("niepoprawna wartosc indrksu tablicy, tablica zawiera " + tab.length + " elementów poczawszy od 0");
        }


    }
}