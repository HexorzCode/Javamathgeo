package org.example;

/**
 * Kelas {@code Geometri} merepresentasikan bentuk geometris dengan tiga atribut utama:
 * <ul>
 *     <li>{@code alas} - dasar dari bentuk</li>
 *     <li>{@code sisi} - panjang sisi dari bentuk</li>
 *     <li>{@code tinggi} - tinggi dari bentuk</li>
 * </ul>
 * Kelas ini memungkinkan pengaturan dan pengambilan nilai atribut tersebut.
 */
public class Geometri {
    private double alas;
    private double sisi;
    private double tinggi;

    /**
     * Membuat objek baru dari {@code Geometri} menggunakan instance dari {@code Geovar} yang disediakan.
     * Nilai dari {@code alas}, {@code sisi}, dan {@code tinggi} diinisialisasi berdasarkan nilai dari {@code Geovar}.
     *
     * @param geovar Instance dari {@code Geovar} yang berisi nilai dasar, sisi, dan tinggi.
     */
    public Geometri(Geovar geovar) {
        this.setAlas(geovar.alas());
        this.setSisi(geovar.sisi());
        this.setTinggi(geovar.tinggi());
    }

    /**
     * Menampilkan nilai dari {@code alas}, {@code sisi}, dan {@code tinggi} ke konsol.
     */
    public void tampilkanNilai() {
        System.out.println("Alas: " + getAlas());
        System.out.println("Sisi: " + getSisi());
        System.out.println("Tinggi: " + getTinggi());
    }

    /**
     * Mengembalikan nilai dari {@code alas}.
     *
     * @return Nilai dasar.
     */
    public double getAlas() {
        return alas;
    }

    /**
     * Mengatur nilai dari {@code alas}.
     *
     * @param alas Nilai dasar yang baru.
     */
    public void setAlas(double alas) {
        this.alas = alas;
    }

    /**
     * Mengembalikan nilai dari {@code sisi}.
     *
     * @return Nilai panjang sisi.
     */
    public double getSisi() {
        return sisi;
    }

    /**
     * Mengatur nilai dari {@code sisi}.
     *
     * @param sisi Nilai panjang sisi yang baru.
     */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    /**
     * Mengembalikan nilai dari {@code tinggi}.
     *
     * @return Nilai tinggi.
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * Mengatur nilai dari {@code tinggi}.
     *
     * @param tinggi Nilai tinggi yang baru.
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
