public class balok {
    private int panjang;
    private int lebar;
    private int tinggi;



    protected void Hasil(){

        perhitungan ph = new perhitungan();
        System.out.println("\nHasil luas balok   : " + ph.Luas(getPanjang(), getLebar(), getTinggi()));
        System.out.println("Hasil volume balok : " + ph.Volume(getPanjang(), getLebar(), getTinggi()));

    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
