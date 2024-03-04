import java.util.Objects;

class Leu extends Animal {
    private String tipMane;

    // Constructor fără parametri
    public Leu() {
        super();
        this.tipMane = "Necunoscut";
    }

    // Constructor cu parametri
    public Leu(String nume, int varsta, String tipMane) {
        super(nume, varsta);
        this.tipMane = tipMane;
    }

    // Metoda care suprascrie metoda din clasa părinte
    @Override
    public void sunet() {
        System.out.println("Leul răcnește!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Leu leu = (Leu) obj;
        return super.equals(obj) && Objects.equals(tipMane, leu.tipMane);
    }
}
