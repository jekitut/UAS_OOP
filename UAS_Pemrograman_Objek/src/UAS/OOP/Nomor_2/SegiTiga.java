package UAS.OOP.Nomor_2;

public class SegiTiga extends BangunDatar {
    
    private double sisia = 4;
    protected double sisib = 3;
    protected double sisic = 5;
    protected double jarijari = 35;
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = this.sisib * this.sisic / 2;
        System.out.println("Alas                 : " + this.sisib + " CM");
        System.out.println("Tinggi               : " + this.sisic + " CM" );
        System.out.println("Luas Segitiga Adalah : " + luas + " CM");
    }
    
    @Override
    public void HitungKeliling() {
        double keliling;
        keliling = this.sisia + this.sisib + this.sisic;
        System.out.println("Sisi A                   : " + this.sisia + " CM");
        System.out.println("Sisi B                   : " + this.sisib + " CM");
        System.out.println("Sisi C                   : " + this.sisic + " CM");
        System.out.println("Keliling Segitiga Adalah : " + keliling + " CM");
    }
    
}