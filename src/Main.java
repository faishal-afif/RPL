import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArtikelManager a = new ArtikelManager();
        a.add(new Artikel(111, "Melatih Mental", "Faishal Afif", "Berisikan tentang cara melatih mental"));
        a.add(new Artikel(222, "Mental Anak Usia Dini", "Faishal Afif", "Berisikan tentang cara melatih mental untuk anak usia dini"));
        a.add(new Artikel(333, "Mental Remaja Pubertas", "Faishal Afif", "Berisikan tentang mental remaja pubertas"));

//        a.tampilArtikel();
//        a.tampilArtikelByJudul();

        String pilihMenu = null;
        do {
            menu();
            System.out.print("Pilih menu : ");
            pilihMenu = scan.nextLine();
            switch (pilihMenu) {
                case "1":
                    a.tampilArtikelByJudul();
                case "2":
                    System.out.println("\n| TAMBAH ARTIKEL |");
                    System.out.print("Masukkan ID\t\t\t\t: ");
                    int id = scan.nextInt();
                    System.out.print("Masukkan judul artikel\t: ");
                    String judul = scan.nextLine();
                    scan.next();
                    System.out.print("Masukkan nama psikolog\t: ");
                    String nama = scan.nextLine();
                    scan.next();
                    System.out.print("Masukkan sinopsis\t\t: ");
                    String sinopsis = scan.nextLine();
                    scan.next();
                    System.out.println("\n- Artikel berhasil ditambahkan! -");
                    a.add(new Artikel(id, judul, nama, sinopsis));

            }
        } while (pilihMenu.equalsIgnoreCase("X"));

    }


    public static void menu() {
        Scanner scan = new Scanner(System.in);
        ArtikelManager a = new ArtikelManager();
        System.out.println("===== HALAMAN ARTIKEL =====");
        System.out.println(a.template());
    }
}

// a.tampilArtikelByJudul() = untuk melihat artikel (judul) yang tersedia
// a.tampilArtikel() = untuk melihat artikel (rinci) yang tersedia
// template() = menu awal