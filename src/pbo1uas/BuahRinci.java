
package pbo1uas;

//inherithence
public class BuahRinci extends Buah{

    static int length;
    //overriding 
    public BuahRinci(String nama, String seri, int harga){
        super(nama, seri, harga);
    }
    
        public int getTahunProduksi(){
        return Integer.parseInt(getSeri().substring(0,2))+2000;
        }
       
        public String getTanggalProduksi(){
            String kodeTanggalProduksi = getSeri().substring(2,4);
            //seleksi switch
            switch(kodeTanggalProduksi){
                case "12":
                    return "12";
                case "11":
                    return "11";
                case "21":
                    return "21";
                default:
                    return "tanggal produksi lain";
            }
        }
        
        public String getNamaBuah(){
            String kodeNamaBuah = getSeri().substring(4,6);
            //seleksi switch
            switch(kodeNamaBuah){
                case "jr":
                    return "jeruk";
                case "ap":
                    return "apel";
                case "mn":
                    return "melon";
                default:
                    return "buah lain";
            }
        }
        public int getNomorProduksi(){
            return Integer.parseInt(getSeri().substring(6));
        }    
        
        //polymorphism (overriding)
        @Override
        public String info(){
            return super.info()+
                    "\nTahun Produksi: "+getTahunProduksi()+
                    "\nTanggal Produksi: "+getTanggalProduksi()+
                    "\nNama Buah: "+getNamaBuah()+
                    "\nNomor Produksi: "+getNomorProduksi();
        }
}

