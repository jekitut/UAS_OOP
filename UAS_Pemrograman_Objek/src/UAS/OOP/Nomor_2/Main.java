package UAS.OOP.Nomor_2;

public class Main {
    
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        Persegi ps = new Persegi();
        SegiTiga st = new SegiTiga();
        Lingkaran lk = new Lingkaran();
        
        bd.HitungLuas();
        bd.HitungKeliling();
        
        String garis = "----------------------------------------------------";
        String garisgaris = String.format("%s%n%s%n%s", garis, garis, garis);
        
        System.out.println(garis);
        System.out.println(">>>>>>>>>>>>>> NIM SAYA 201969040035 <<<<<<<<<<<<<<");
        System.out.println(garis);
        
        System.out.println(">>>>>>>>>>>> LUAS DAN KELILING PERSEGI <<<<<<<<<<<<");
        ps.HitungLuas();
        System.out.println(garis);
        ps.HitungKeliling();
        
        System.out.println(garisgaris);
        
        System.out.println(">>>>>>>>>>>> LUAS DAN KELILING SEGITIGA <<<<<<<<<<<<");
        st.HitungLuas();
        System.out.println(garis);
        st.HitungKeliling();
        
        System.out.println(garisgaris);
        
        System.out.println(">>>>>>>>>>> LUAS DAN KELILING LINGKARAN <<<<<<<<<<<");
        lk.HitungLuas();
        System.out.println(garis);
        lk.HitungKeliling();
        
        System.out.println(garisgaris);
    }
    
}