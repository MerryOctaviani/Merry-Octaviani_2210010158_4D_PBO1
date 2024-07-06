# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buah`, `BuahRinci`, dan `BuahBeraksi` adalah contoh dari class.

```bash
public class Buah {
    protected String nama;
    protected String seri;
    protected int harga;
}

public BuahRinci(String nama, String seri, int harga){
    super(nama, seri, harga);
}

public class BuahBeraksi {
    public static void main(String[] args) {
}
```

2. **Object** adalah instance dari class. Pada kode ini, `buah[i] = new BuahRinci(nama, seri, harga);` adalah contoh pembuatan object.

```bash
buah[i] = new BuahRinci(nama, seri, harga);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `seri` dan `harga` adalah contoh atribut.

```bash
String nama;
String seri;
int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buah` dan `BuahRinci`.

```bash
public Buah(String nama, String seri, int harga) {
        this.nama = nama; 
        this.seri = seri;
        this.harga = harga;
    }

    public BuahRinci(String nama, String seri, int harga){
        super(nama, seri, harga);
    }
```
5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setBuah`, `setSeri` dan `setHarga` adalah contoh method mutator.

```bash
    public void setBuah(String nama) {
        this.nama = nama;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getSeri`, `getTahunProduksi`, `getTanggalProduksi`, `getNamaBuah`, dan `getUrutanProduksi` adalah contoh method accessor.

```bash
    public String getNama() {
        return nama;
    }

    public String getSeri() {
        return seri;
    }

    public int getHarga() {
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `seri` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    protected String nama;
    protected String seri;
    protected int harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `BuahRinci` mewarisi `Buah` dengan sintaks `extends`.

```bash
public class BuahRinci extends Buah{

    static int length;
    public BuahRinci(String nama, String seri, int harga){
        super(nama, seri, harga);
    }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `info(String)` di `Buah` merupakan overloading method `info` dan `info` di `BuahRinci` merupakan override dari method `info` di `Buah`.

```bash
public String info(){
      return super.info()+
           "\nTahun Produksi: "+getTahunProduksi()+
           "\nTanggal Produksi: "+getTanggalProduksi()+
           "\nNama Buah: "+getNamaBuah()+
           "\nNomor Produksi: "+getNomorProduksi();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getTanggalProdusi` dan seleksi `switch` dalam method `getNamaBuah`.

```bash
public String getTanggalProduksi(){
       String kodeTanggalProduksi = getSeri().substring(2,4);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < mahasiswas.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
BuahRinci[] buah = new BuahRinci[2];

for(int i=0; i<buah.length; i++){
System.out.print("Masukan Nama Buah" +(i+1)+": ");
String nama= scanner.nextLine();
System.out.print("Masukkan Seri Buah" +(i+1)+": ");
String seri= scanner.nextLine();
System.out.print("Masukkan Harga Buah" +(i+1)+": ");
int harga = scanner.nextInt();
scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `BuahRinci[] Buah = new BuahRinci[2];` adalah contoh penggunaan array.

```bash
BuahRinci[] buah = new BuahRinci[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (NumberFormatException e){
      System.out.println("kesalahan format nomor: "+e.getMessage());
} catch (StringIndexOutOfBoundsException e){
      System.out.println("kesalahan format nomor seri: "+e.getMessage());
} catch (Exception e){
      System.out.println("Kesalahan Umum: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Merry Octaviani
NPM: 2210010158
Kelas: 4d reg BJB
