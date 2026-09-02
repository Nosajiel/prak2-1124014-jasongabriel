// ========== Abstract Class Hewan ==========
abstract class Hewan {
    protected String name;
    protected int age;
    protected String food;

    public Hewan(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    // Getter dan Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getFood() { return food; }
    public void setFood(String food) { this.food = food; }

    public abstract String printSound();

    public String printData() {
        return "Jenis Hewan : " + getClass().getSimpleName() +
               "\nNama : " + name +
               "\nUmur : " + age + " tahun" +
               "\nMakanan : " + food;
    }
}

// ========== Abstract Class HewanDarat ==========
abstract class HewanDarat extends Hewan {
    protected int numberOfLegs;

    public HewanDarat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public void move() {
        System.out.println(name + " bergerak dengan " + numberOfLegs + " kaki di darat.");
    }

    @Override
    public String printData() {
        return super.printData() + "\nJumlah Kaki : " + numberOfLegs;
    }
}

// ========== Abstract Class HewanLaut ==========
abstract class HewanLaut extends Hewan {
    protected double depth;

    public HewanLaut(String name, int age, String food, double depth) {
        super(name, age, food);
        this.depth = depth;
    }

    @Override
    public String printData() {
        return super.printData() + "\nKedalaman : " + depth + " meter";
    }
}

// ========== Abstract Class HewanUdara ==========
abstract class HewanUdara extends Hewan {
    protected double wingSpan;

    public HewanUdara(String name, int age, String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    @Override
    public String printData() {
        return super.printData() + "\nRentang Sayap : " + wingSpan + " meter";
    }
}

// ========== Concrete Class Darat ==========
class Anjing extends HewanDarat {
    public Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    @Override
    public String printSound() { return "Guk Guk"; }
}

class Kucing extends HewanDarat {
    public Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    @Override
    public String printSound() { return "Meow Meow"; }
}

class Tikus extends HewanDarat {
    public Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }
    @Override
    public String printSound() { return "Cit Cit"; }
}

// ========== Concrete Class Laut ==========
class Ikan extends HewanLaut {
    public Ikan(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    @Override
    public String printSound() { return "Blub Blub"; }
}

class Hiu extends HewanLaut {
    public Hiu(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    @Override
    public String printSound() { return "Splash / Silent Predator"; }
}

class Paus extends HewanLaut {
    public Paus(String name, int age, String food, double depth) {
        super(name, age, food, depth);
    }
    @Override
    public String printSound() { return "Echolocation Click / Whistle"; }
}

// ========== Concrete Class Udara ==========
class Burung extends HewanUdara {
    public Burung(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    @Override
    public String printSound() { return "Cuit Cuit"; }
}

class Elang extends HewanUdara {
    public Elang(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    @Override
    public String printSound() { return "Kreeee / Screech"; }
}

class Bebek extends HewanUdara {
    public Bebek(String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }
    @Override
    public String printSound() { return "Kwek Kwek"; }
}

// ========== Main Class ==========
public class prak2_1124014_jasongabriel {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[] {
            new Anjing("Doggy", 3, "Daging / Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),
            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Paus("Bluey", 20, "Krill", 1000.0),
            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
            new Bebek("Donald", 2, "Dedak", 0.8)
        };

        // Loop manual menggunakan indeks (bukan enhanced for)
        for (int i = 0; i < daftarHewan.length; i++) {
            Hewan h = daftarHewan[i];
            System.out.println(h.printData());
            System.out.println("Suara : " + h.printSound());
            System.out.println("------------------------------------------");
        }
    }
}