import java.util.ArrayList;

public class Artikel {
    ArrayList<Artikel> artikelList = new ArrayList<>();
    private int id;
    private String judul;
    private String namaPembuat;
    private String sinopsis;
    public Artikel(int id, String judul, String namaPembuat, String sinopsis) {
        this.id = id;
        this.judul = judul;
        this.namaPembuat = namaPembuat;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }
    
    public void setId() {
        this.id = id;
    }
    
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getNamaPembuat() {
        return namaPembuat;
    }

    public void setNamaPembuat(String namaPembuat) {
        this.namaPembuat = namaPembuat;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String isi) {
        this.sinopsis = isi;
    }

    @Override
    public String toString() {
        return "Judul\t\t\t: '" + judul + "'" +
                "\nNama Pembuat\t: " + namaPembuat +
                "\nSinopsis\t\t: " + sinopsis +
                "\n";
    }
}
