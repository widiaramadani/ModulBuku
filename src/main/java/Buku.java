public class Buku {
//    private String Buku;
//    private String Judul;
//    private String  Pengarang;
//    private int  Jumlah;
//
//    public void setNilai (String Judul,String Pengarang,int Jumlah) {
//        this.Judul = Judul;
//        this.Pengarang = Pengarang;
//        this.Jumlah = Jumlah;
//    }
//          void cetakKeLayar()
//          {
//              System.out.println("Judul : " + Judul );
//              System.out.println("Pengarang :" + Pengarang );
//              System.out.println("Jumalah :" + Jumlah );
//          }
private String judul;
    private String pengarang;
    public Buku()
    {
        judul = "Tidak diketahui";
        pengarang = "Tidak diketahui";
    }
    public Buku(String judul,String pengarang)
    {
        System.out.println
                ("konstruktor buku sedang dijalankan...");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    void cetakKeLayar()
    {
        if(judul==null && pengarang==null)
            return;
        System.out.println("Judul : " + judul );
        System.out.println("Pengarang : " + pengarang );
    }
}

