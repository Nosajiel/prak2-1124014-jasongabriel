abstract class Pekerja {
    protected string nama;

    public Pekerja (String nama) {
        this.nama = nama;
    }
    public abstract double hitungGaji();
}

class Staff extends Pekerja {
    private double gajiPokok;
    
    public Staff (String nama, double gajiPokok){
        super(nama);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok;
    }
}

class DosenTetap extends Pekerja {
    private double gajiPokok;
    private double honorPerSks;
    private int sks;
    
    public DosenTetap (String nama, double gajiPokok){
        super(nama);
        this.gajiPokok = gajiPokok;
        this.honorPerSks = honorPerSks;
        this.sks = sks;
    }

    @Override
    public double hitungGaji(){
        return gajiPokok * (honorPerSks * sks);
    }
}

class DosenHonorer extends Pekerja {
    // private double gajiPokok;
    private double honorPerSks;
    private int sks;
    
    public DosenHonorer (String nama, double gajiPokok){
        super(nama);
        // this.gajiPokok = gajiPokok;
        this.honorPerSks = honorPerSks;
        this.sks = sks;
    }

    @Override
    public double hitungGaji(){
        return honorPerSks * sks;
    }
}

public class latihan1 {
    
}
