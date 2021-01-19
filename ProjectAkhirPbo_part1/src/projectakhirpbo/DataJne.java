/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhirpbo;

/**
 *
 * @author muhammad yusuf
 */
public class DataJne {
 String noresi;
String namapenerima;

    public void setNamapenerima(String namapenerima) {
        this.namapenerima = namapenerima;
    }

    public String getNamapenerima() {
        return namapenerima;
    }

    public DataJne(String noresi, String namapenerima, String nohp, String alamat, String jenisbarang) {
        this.noresi = noresi;
        this.namapenerima = namapenerima;
        this.nohp = nohp;
        this.alamat = alamat;
        this.jenisbarang = jenisbarang;
    }
String nohp;
String alamat,jenisbarang;

    public void setNoresi(String noresi) {
        this.noresi = noresi;
    }



    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJenisbarang(String jenisbarang) {
        this.jenisbarang = jenisbarang;
    }

    public String getNoresi() {
        return noresi;
    }


    public String getNohp() {
        return nohp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisbarang() {
        return jenisbarang;
    }

  


   




   
}
