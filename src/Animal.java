import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

class Animal {
    private String nume;
    private int varsta;

    // Constructor fără parametri
    public Animal() {
        this.nume = "Necunoscut";
        this.varsta = 0;
    }

    // Constructor cu parametri
    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    // Metodele getter și setter pentru atributele private
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    // Metoda de filtrare a listei de obiecte
    public static void filtreazaLista(ArrayList<? extends Animal> lista, int criteriu) {
        for (Animal animal : lista) {
            if (animal.getVarsta() > criteriu) {
                System.out.println(animal.getNume() + " are varsta mai mare de " + criteriu + " ani.");
            }
        }
    }

    // Supraîncărcarea metodei de filtrare
    public static void filtreazaLista(ArrayList<? extends Animal> lista, int varstaMinima, int varstaMaxima) {
        for (Animal animal : lista) {
            int varsta = animal.getVarsta();
            if (varsta >= varstaMinima && varsta <= varstaMaxima) {
                System.out.println(animal.getNume() + " are vârsta de " + varsta + " ani.");
            }
        }
    }



    // Metoda care poate fi suprascrisă în clasele copil
    public void sunet() {
        System.out.println("Animalul face un sunet.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Animal animal = (Animal) obj;
        return varsta == animal.varsta && Objects.equals(nume, animal.nume);
    }
}

