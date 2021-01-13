package UAS.OOP.Nomor_2;

public class Lingkaran extends SegiTiga {
    
    @Override
    public void HitungLuas() {
        double luas;
        luas = 3.14 * jarijari * jarijari;
        System.out.println("Jari Jari Lingkaran   : " + jarijari);
        System.out.println("Luas Lingkaran Adalah : " + luas);
    }
    
    @Override
    public void HitungKeliling() {
        double Keliling;
        Keliling = 2 * 3.14 * jarijari;
        System.out.println("Jari Jari Lingkaran       : " + jarijari );
        System.out.println("Keliling Lingkaran Adalah : " + Keliling);
    }
    
}