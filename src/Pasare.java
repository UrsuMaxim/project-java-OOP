import java.util.Objects;

class Pasare extends Animal {
    private boolean zboara;

    // Constructor fără parametri
    public Pasare() {
        super();
        this.zboara = false;
    }

    // Constructor cu parametri
    public Pasare(String nume, int varsta, boolean zboara) {
        super(nume, varsta);
        this.zboara = zboara;
    }

    // Metoda care suprascrie metoda din clasa părinte
    @Override
    public void sunet() {
        System.out.println("Pasarea cântă!");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Pasare pasare = (Pasare) obj;
        return super.equals(obj) && zboara == pasare.zboara;
    }
}
