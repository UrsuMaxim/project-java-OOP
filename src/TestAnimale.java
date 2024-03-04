import java.util.ArrayList;
import java.util.Scanner;

// Clasa de testare
public class TestAnimale {
    public static void main(String[] args) {
        // Crearea unui obiect al clasei de bază (Animal)
        Animal animalBaza = new Animal("Delfin", 5);

        // Crearea unor obiecte ale claselor copil (Leu și Pasare)
        Leu leu5 = new Leu("Scar", 3, "Agresiv");
        Leu leu1 = new Leu("Simba", 3, "Agresiv");
        Pasare pasare1 = new Pasare("Pitigoi", 2, true);
        Leu leu2 = new Leu("Mufasa", 3, "Agresiv");
        Pasare pasare2 = new Pasare("Vultur", 5, true);
        Leu leu3 = new Leu("Nala", 4, "Jucăuș");
        Pasare pasare3 = new Pasare("Papagal", 2, true);



        // Popularea obiectului clasei de bază cu o listă de obiecte ale claselor copil
        ArrayList<Animal> listaAnimale = new ArrayList<>();
        listaAnimale.add(animalBaza);
        listaAnimale.add(leu1);
        listaAnimale.add(pasare1);
        listaAnimale.add(leu2);
        listaAnimale.add(pasare2);
        listaAnimale.add(leu3);
        listaAnimale.add(leu5);
        listaAnimale.add(pasare3);

        // Afișarea tuturor obiectelor din listă care satisfac criteriile introduse
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti criteriul de varsta pentru filtrare: ");
        int criteriuVarsta = scanner.nextInt();
        Animal.filtreazaLista(listaAnimale, criteriuVarsta);

        // Compararea obiectelor
        Leu leu4 = new Leu("Scar", 3, "Agresiv");
        for (Animal animal : listaAnimale) {
            if (animal.equals(leu4)) {
                System.out.println(animal.getNume() + " coincide cu Leul " + leu4.getNume());
            } else {
                System.out.println(animal.getNume() + " nu coincide cu Leul " + leu4.getNume());
            }
        }

        System.out.print("Introduceti varsta minima pentru filtrare: ");
        int varstaMinima = scanner.nextInt();
        System.out.print("Introduceti varsta maxima pentru filtrare: ");
        int varstaMaxima = scanner.nextInt();

        Animal.filtreazaLista(listaAnimale, varstaMinima, varstaMaxima);
    }
}
