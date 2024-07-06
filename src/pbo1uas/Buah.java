
package pbo1uas;
public class Buah {
    //atribut dan enkapsulasi
    protected String nama;
    protected String seri;
    protected int harga;
    
    //constructor
    public Buah(String nama, String seri, int harga) {
        this.nama = nama; 
        this.seri = seri;
        this.harga = harga;
    }
    
    //mutator
    public void setBuah(String nama) {
        this.nama = nama;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    //accesor
    public String getNama() {
        return nama;
    }

    public String getSeri() {
        return seri;
    }

    public int getHarga() {
        return harga;
    }
    
    //polymorphism overloading
    public String info(){
        return "Nama : "+getNama()+"\nSeri : "+getSeri()+"\nHarga : "+getHarga();
    }
    public String info(String pabrik){
        return info() + "\nPabrik: "+ pabrik;
    }
}

