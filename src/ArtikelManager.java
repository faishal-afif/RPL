import java.sql.Array;
import java.util.*;

public class ArtikelManager {
    ArrayList<Artikel> artikelList;

    public ArrayList<Artikel> getAllArtikel(){
        return artikelList;
    }

    public ArtikelManager() {
        artikelList = new ArrayList<Artikel>();
    }

    public void add(Artikel object){
        artikelList.add(object);
    }

    public void tambahArtikel(ArrayList<Artikel> list) {
        this.artikelList = list;
    }

    public void tampilArtikel() {
        for(Artikel a : this.artikelList) {
            System.out.println("Judul Artikel\t\t: " + a.getJudul() +
                    "\nNama Psikolog\t\t: " + a.getNamaPembuat() +
                    "\n");
        }
    }

    public void tampilArtikelByJudul() {
        int i = 0;
        for (Artikel a : this.artikelList) {
            System.out.println("[" + i + "] " + a.getJudul());
            i++;

        }
    }

    public String template(){
        return "[1] Lihat Artikel" +
                "\n[2] Tambah Artikel" +
                "\n[X] Exit" +
                "\n";
    }
}
