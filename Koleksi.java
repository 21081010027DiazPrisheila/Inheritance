package koleksi;

public class Koleksi {
    String name;
    public Koleksi() {
        System.out.println("Selamat datang di koleksi buku saya");
    }
    public void judul() {
        System.out.println("Kumpulan Sejarah Indonesia");
    }
    public void penerbit() {
        System.out.println("PT. Cahaya");
    }
    public void tahun() {
        System.out.println("Tahun 2015");
    }

    public static void main(String[] args) {
        Koleksi a = new Koleksi();
        a.judul();
        a.penerbit();
        a.tahun();
        Majalah b = new Majalah();
        b.judul();
        b.edisi();
        b.penerbit();
        b.tahun();
        Buku c = new Buku();
        c.judul();
        c.penulis();
        c.penerbit();
        c.tahun();
        Skripsi d = new Skripsi();
        d.npm();
        d.penulis();
        d.judul();
        d.penerbit();
        d.tahun();
    } 
}
class Majalah extends Koleksi {
    public Majalah() {
        super();
        name="Majalah";
        System.out.println("Ini adalah golongan "+name);
    }
    public void judul(){
        System.out.println("Bobo");
    }
    public void edisi() {
        System.out.println("Penerbitan / Keluaran");
    }
}
class Buku extends Koleksi {
    public Buku() {
        super();
        name="Buku";
        System.out.println("Ini adalah golongan "+name);
    }
    public void judul() {
        System.out.println("Diagnosis Skizofrenia Menggunakan Sistem Pakar");
    }
    public void penulis() {
        System.out.println("J. K. Rowling");
    }
}
class Skripsi extends Buku {
    public void npm() {
        System.out.println("NPM : 21081010027");
    }
}