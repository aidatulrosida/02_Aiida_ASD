public class BukuMain02 {
    public static void main(String[] args) {
        Buku02 bk1 = new Buku02();
        bk1.judul = "Today Ends Tomorrow";
        bk1.penggarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println("Harga total : "+ bk1.hitungHargaTotal(5));
        System.out.println("Harga Diskon : " + bk1.hitungDiskon(bk1.hitungHargaTotal(5)));
    
        System.out.println();
    

        Buku02 bk2 = new Buku02("Self Reward", "Mahendra Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println();

        Buku02 aiida = new Buku02("Cantik Itu Luka", "Eka Kurniawan", 150, 20, 85000);
        aiida.terjual(14);
        aiida.tampilInformasi();
        System.out.println("Harga total buku terjual :" + aiida.hitungHargaTotal(3));

    }
}