public class perhitungan {
    balok sisi = new balok();

    void perhitungan(){
        int Panjang = sisi.getPanjang();
        int Lebar = sisi.getLebar();
        int Tinggi = sisi.getTinggi();
        Luas(Panjang, Lebar, Tinggi);

        int PanjangV = sisi.getPanjang();
        int LebarV = sisi.getLebar();
        int TinggiV = sisi.getTinggi();
        Volume(PanjangV, LebarV, TinggiV);
    }


    static boolean isCube(long input) {
        return (Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input)) * Math.round(Math.cbrt(input))) == input;
    }

    public int Luas(int panjang, int lebar, int tinggi) {
        int Luas ;
        return Luas = panjang * lebar * tinggi;

    }

    public int Volume(int panjang, int lebar, int tinggi) {
        int  Volume;
        return Volume = 4 * panjang * lebar * tinggi;
    }
}
