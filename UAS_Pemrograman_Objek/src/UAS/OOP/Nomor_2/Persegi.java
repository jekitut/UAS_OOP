package UAS.OOP.Nomor_2;

public class Persegi extends SegiTiga {
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang Sisi        : " + this.sisic + " CM");
        System.out.println("Luas Persegi Adalah : " + luas + " CM");
    }
    
    @Override
    public void HitungKeliling() {
        double keliling;
        keliling = this.sisic * 2;
        System.out.println("Panjang Sisi            : " + this.sisic + " CM");
        System.out.println("Keliling Persegi Adalah : " + keliling + " CM");
    }

}