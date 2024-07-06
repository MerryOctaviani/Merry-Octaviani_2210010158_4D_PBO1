
package pbo1uas;
import java.util.Scanner;

public class BuahBeraksi {

    public static void main(String[] args) {
        //object
        //Buah Buah1 = new Buah("melon", "2421mn213", 50000);

        //System.out.println(Buah1.info());
        //System.out.println("====================================");
        //System.out.println(Buah1.info("Nama"));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            BuahRinci[] buah = new BuahRinci[2];

            //perulangan
            for(int i=0; i<buah.length; i++){
            System.out.print("Masukan Nama Buah" +(i+1)+": ");
            String nama= scanner.nextLine();
            System.out.print("Masukkan Seri Buah" +(i+1)+": ");
            String seri= scanner.nextLine();
            System.out.print("Masukkan Harga Buah" +(i+1)+": ");
            int harga = scanner.nextInt();
            scanner.nextLine();

            //objek
            buah[i] = new BuahRinci(nama, seri, harga);
            }

            //perulangan
            for(BuahRinci data: buah){
                System.out.println("===================");
                System.out.println("Data Produksi Buah : ");
                System.out.println(data.info());
            }
        } catch (NumberFormatException e){
            System.out.println("kesalahan format nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("kesalahan format nomor seri: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
}

