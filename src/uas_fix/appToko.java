package uas_fix;
import java.util.Scanner;
public class appToko {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        cBarang brg1 = new cBarang("Kopi",5000);
        cBarang brg2 = new cBarang("KopiJoss",10000);
        cBarang brg3 = new cBarang("Capuchino",15000);
        cBarang brg4 = new cBarang("Susu",5000);
        cBarang brg5 = new cBarang("Teh",5000);
        double jbrg1=0,jbrg2=0,jbrg3=0,jbrg4=0,jbrg5=0;
        //Admin&Pemilik
        int pwdadmin=123,pwdpemilik=1234;
        //data member
        int id1 = 10, pwd1 = 111;
        int id2 = 11, pwd2 = 222;
        int id3 = 12, pwd3 = 333;
        int id,pin;
        String nama1="",nama2="",nama3="";
        double total1=0,total2=0,total3=0;
        cDaftarTransaksi jual = new cDaftarTransaksi();
        int pilih=0,pilih2=0,pilih3=0,pilihan=0;
        int kode=100,jumlah=0;
        do {
            System.out.println("-----------------------");
            System.out.println("  APLIKASI JOKER CAFE");
            System.out.println("-----------------------");
            System.out.println("1. Pembeli");
            System.out.println("2. Anggota");
            System.out.println("3. Admin");
            System.out.println("4. pemilik");
            System.out.println("5. Selesai");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("        PEMBELI");
                    System.out.println("-----------------------");
                    //pembeli
                    kode++;
                    cDaftarTransaksi beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    String nama = sc.next();
                    do {
                        System.out.println("Akun Pembeli"); 
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Kembali");
                        System.out.print("pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                cTransaksi br=null ;
                                System.out.println("Daftar Barang : ");
                                System.out.println("1. "+brg1.getNama());
                                System.out.println("2. "+brg2.getNama());
                                System.out.println("3. "+brg3.getNama());
                                System.out.println("4. "+brg4.getNama());
                                System.out.println("5. "+brg5.getNama());
                                System.out.print("pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah : ");
                                jumlah=sc.nextInt();
                                if (pilih3==1) {
                                   br=new cTransaksi(String.valueOf(kode),nama,brg1,jumlah,0); 
                                }
                                else if (pilih3==2) {
                                   br=new cTransaksi(String.valueOf(kode),nama,brg2,jumlah,0); 
                                }
                                else if (pilih3==3) {
                                   br=new cTransaksi(String.valueOf(kode),nama,brg3,jumlah,0); 
                                }
                                else if (pilih3==4) {
                                   br=new cTransaksi(String.valueOf(kode),nama,brg4,jumlah,0); 
                                }
                                else if (pilih3==5) {
                                   br=new cTransaksi(String.valueOf(kode),nama,brg5,jumlah,0); 
                                }
                                beli.tambahTransaksi(br);
                               
                                break;
                            case 2:
                                 beli.lihatTransaksi();
                                 System.out.print("Hapus Nomor : ");
                                 int hapus = sc.nextInt();
                                 beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksi();
                                break;
                            case 4:
                                 jual.sambungTransaksi(beli.front, beli.rear);
                                break;
                        }
                    } while (pilih2!=4);
                    
                    break;
                case 2:
                    //anggota
                    boolean valid = false;
                    do {
                        System.out.print("ID : ");
                        id = sc.nextInt();
                        System.out.print("PIN : ");
                        pin = sc.nextInt();
                        if (id==id1 && pin==pwd1) 
                            valid=true;
                        else if (id==id2 && pin==pwd2) 
                            valid=true;
                        else if (id==id3 && pin==pwd3) 
                            valid=true;
                        if (valid==false) 
                            System.out.println("PIN/ID Salah !");
                        else break;
                    } while (valid==false);
                    if(valid==true){
                    System.out.println("-----------------------");
                    System.out.println("         MEMBER");
                    System.out.println("-----------------------");
                    System.out.println("Selamat datang....");
                    kode++;
                    beli = new cDaftarTransaksi();
                    System.out.print("Masukkan Nama = ");
                    do {
                        System.out.println("Akun Member"); 
                        System.out.println("1. Tambah");
                        System.out.println("2. Hapus");
                        System.out.println("3. Lihat");
                        System.out.println("4. Ubah Password");
                        System.out.println("5. Kembali");
                        System.out.print("pilih = ");
                        pilih2=sc.nextInt();
                        switch(pilih2){
                            case 1:
                                cTransaksi br=null ;
                                System.out.println("Daftar Barang : ");
                                 System.out.println("1. "+brg1.getNama());
                                System.out.println("2. "+brg2.getNama());
                                System.out.println("3. "+brg3.getNama());
                                System.out.println("4. "+brg4.getNama());
                                System.out.println("5. "+brg5.getNama());
                                System.out.print("pilih = ");
                                pilih3 = sc.nextInt();
                                System.out.print("Jumlah : ");
                                jumlah=sc.nextInt();
                                if (pilih3==1) {
                                   br=new cTransaksi(String.valueOf(kode),String.valueOf(id),brg1,jumlah,0); 
                                }
                                else if (pilih3==2) {
                                   br=new cTransaksi(String.valueOf(kode),String.valueOf(id),brg2,jumlah,0); 
                                }
                                else if (pilih3==3) {
                                   br=new cTransaksi(String.valueOf(kode),String.valueOf(id),brg3,jumlah,0); 
                                }
                                 else if (pilih3==4) {
                                   br=new cTransaksi(String.valueOf(kode),String.valueOf(id),brg4,jumlah,0); 
                                }
                                 else if (pilih3==5) {
                                   br=new cTransaksi(String.valueOf(kode),String.valueOf(id),brg5,jumlah,0); 
                                }
                                beli.tambahTransaksi(br);
                               
                                break;
                            case 2:
                                 beli.lihatTransaksiMember();
                                 System.out.print("Hapus Nomor : ");
                                 int hapus = sc.nextInt();
                                 beli.hapusTransaksi(hapus);
                                break;
                            case 3:
                                beli.lihatTransaksiMember();
                                break;
                            case 4:
                                if (id==id1 && pin==pwd1){
                                    System.out.print("PASSWORD BARU = ");
                                    pwd1=sc.nextInt();
                                }
                                else if (id==id2 && pin==pwd2) {
                                    System.out.print("PASSWORD BARU = ");
                                    pwd2=sc.nextInt();
                                }
                                else if (id==id3 && pin==pwd3) {
                                    System.out.print("PASSWORD BARU = ");
                                    pwd3=sc.nextInt();
                                }
                                
                                break;
                            case 5:
                                 jual.sambungTransaksi(beli.front, beli.rear);
                                break;
                        }
                    } while (pilih2!=5);
                    }
                    break;
                case 3:
                    boolean benar=false;
                    do{
                    System.out.print("Masukkan Password : ");
                    int pass1 =sc.nextInt();
                        if (pass1==pwdadmin) {
                            benar=true;
                        }
                        else{
                            benar=false;
                        }
                    }while(benar!=true);
                    //Admin
                    System.out.println("-----------------------");
                    System.out.println("          ADMIN");
                    System.out.println("-----------------------");
                    jual.lihatTransaksi();
                    
                    // memproses transaksi
                    cTransaksi t=jual.getFront();
                    do {
                        if (t.getStatus()==0) {
                            System.out.println("Kode :"+t.getKode());
                            System.out.println("Pembeli :"+t.getPembeli());
                            System.out.println("Barang :"+t.getBarang().getNama());
                            System.out.println("Jumlah :"+t.getJumlahBrg());
                            System.out.println("Pilih Aksi");
                            System.out.println("1. Diproses");
                            System.out.println("2. Selesai");
                            System.out.print("Pilih = ");
                            int aksi = sc.nextInt();
                            if (aksi==1) {
                                if (t.getPembeli().equalsIgnoreCase("10")) {
                                    nama1="Tegar";
                                    total1=total1+(t.getBarang().getHarga()*t.getJumlahBrg());
                                    //total1=total1-(total1*0.1);
                                }
                                else if (t.getPembeli().equalsIgnoreCase("11")) {
                                    nama2="Clara";
                                    total2=total2+(t.getBarang().getHarga()*t.getJumlahBrg());
                                    //total2=total2-(total2*0.1);
                                }
                                else if (t.getPembeli().equalsIgnoreCase("12")) {
                                    nama3="Ais";
                                    total3=total3+(t.getBarang().getHarga()*t.getJumlahBrg());
                                    //total3=total3-(total3*0.1);
                                }
                               jual.prosesTransaksi(t);
                                System.out.println("Berhasil Diproses");
                                if (t.getBarang().getNama().equalsIgnoreCase(brg1.getNama())) {
                                    
                                    jbrg1=jbrg1+(t.getBarang().getHarga()*t.jumlahBrg);
                                    
                                }
                                else if (t.getBarang().getNama().equalsIgnoreCase(brg2.getNama())) {
                                    
                                    jbrg2=jbrg2+(t.getBarang().getHarga()*t.jumlahBrg);
                                    
                                }
                                else if (t.getBarang().getNama().equalsIgnoreCase(brg3.getNama())) {
                                    
                                    
                                    jbrg3=jbrg3+(t.getBarang().getHarga()*t.jumlahBrg);
                                    
                                }
                                else if (t.getBarang().getNama().equalsIgnoreCase(brg4.getNama())) {
                                    
                                    jbrg4=jbrg4+(t.getBarang().getHarga()*t.jumlahBrg);
                                    
                                }
                                else if (t.getBarang().getNama().equalsIgnoreCase(brg5.getNama())) {
                                    
                                    jbrg5=jbrg5+(t.getBarang().getHarga()*t.jumlahBrg);
                                    
                                }
                            }
                            else{
                                break;
                            }
                            
                        }
                        t=t.next;
                    } while (t!=null);
                    
                    break;
                case 4:
                    benar=false;
                    do{
                    System.out.print("Masukkan Password : ");
                    int pass1 =sc.nextInt();
                        if (pass1==pwdpemilik) {
                            benar=true;
                        }
                        else{
                            benar=false;
                        }
                    }while(benar!=true);
                    //pemilik
                    do {
                    System.out.println("-----------------------");
                    System.out.println("         PEMILIK");
                    System.out.println("-----------------------");
                    System.out.println("1. Ubah Nama barang yang di jual");
                    System.out.println("2. Penjualan yang sudah di peroses");
                    System.out.println("3. Penjulan yang belum di peroses");
                    System.out.println("4. Laporan harian");
                    System.out.println("5. Belanja Member");
                    System.out.println("6. Kembali");
                    System.out.print("Pilih = ");
                    pilihan= sc.nextInt();
                        switch(pilihan){
                            case 1:
                                System.out.println("nam "+brg1.getNama());
                                System.out.print("Nama Barng yang ingin di ubah : ");
                                String mkn = sc.next();
                                   if (mkn.equalsIgnoreCase(brg1.getNama())) {
                                       System.out.print("Masukkan nama baru = ");
                                       String nm =sc.next();
                                       System.out.print("Masukkan harga baru = ");
                                       int hg =sc.nextInt();
                                       brg1 = new cBarang(nm,hg);
                                    }
                                   else if (mkn.equalsIgnoreCase(brg2.getNama())) {
                                       System.out.print("Masukkan nama baru = ");
                                       String nm =sc.next();
                                       System.out.print("Masukkan harga baru = ");
                                       int hg =sc.nextInt();
                                       brg2 = new cBarang(nm,hg);
                                    }
                                   else if (mkn.equalsIgnoreCase(brg3.getNama())) {
                                       System.out.print("Masukkan nama baru = ");
                                       String nm =sc.next();
                                       System.out.print("Masukkan harga baru = ");
                                       int hg =sc.nextInt();
                                       brg3 = new cBarang(nm,hg);
                                    }
                                   else if (mkn.equalsIgnoreCase(brg4.getNama())) {
                                       System.out.print("Masukkan nama baru = ");
                                       String nm =sc.next();
                                       System.out.print("Masukkan harga baru = ");
                                       int hg =sc.nextInt();
                                       brg4 = new cBarang(nm,hg);
                                    }
                                   else if (mkn.equalsIgnoreCase(brg5.getNama())) {
                                       System.out.print("Masukkan nama baru = ");
                                       String nm =sc.next();
                                       System.out.print("Masukkan harga baru = ");
                                       int hg =sc.nextInt();
                                       brg5 = new cBarang(nm,hg);
                                    }
                                   
                                   
                                System.out.println("");
                                break;
                            case 2:
                                System.out.println("Jumlah Transaksi diProses oleh admin : "+jual.lihatDiproses());
                                System.out.println("Pemasukan : "+jual.jumlahPemasukan());
                                break;
                            case 3:
                                System.out.println("Jumlah Transaksi Belum Proses oleh admin : "+jual.lihatBelumDiproses());
                                System.out.println("Pemasukan : "+jual.jumlahPemasukan());
                                cTransaksi blm=jual.getFront();
                                    do {
                                        if (blm.getStatus()==0) {
                                        System.out.println("Kode :"+blm.getKode());
                                        System.out.println("Pembeli :"+blm.getPembeli());
                                        System.out.println("Barang :"+blm.getBarang().getNama());
                                        System.out.println("Jumlah :"+blm.getJumlahBrg());
                                        }
                                        else{
                                            break;
                                        }
                                    
                                    blm=blm.next;
                                } while (blm!=null);
                                   // System.out.println("Kopi : "+jbrg1);
                                    System.out.println("");
                                break;
                            case 4:
                                System.out.println("Jumlah Pemasukan : "+(jbrg1+jbrg2+jbrg3+jbrg4+jbrg5));
                                System.out.println("1. "+brg1.getNama()+" : Rp"+jbrg1);
                                System.out.println("2. "+brg2.getNama()+" : Rp"+jbrg2);
                                System.out.println("3. "+brg3.getNama()+" : Rp"+jbrg3);
                                System.out.println("4. "+brg4.getNama()+" : Rp"+jbrg4);
                                System.out.println("5. "+brg5.getNama()+" : Rp"+jbrg5);
                                System.out.println("");
                                break;
                            case 5:
                                System.out.println("Jumlah Pembelian Member : ");
                                System.out.println("1. "+nama1+" : "+(total1-(total1*0.05)));
                                System.out.println("2. "+nama2+" : "+(total2-(total2*0.05)));
                                System.out.println("3. "+nama3+" : "+(total3-(total3*0.05)));
                                break;
                            case 6:
                                break;
                        } 
                    } while (pilihan!=6);
                case 5:
                    System.out.println("Terima Kasih...");
                    break;
                    
            }
        } while (pilih!=5);
        
    }
}
