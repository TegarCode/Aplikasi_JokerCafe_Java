package uas_fix;
public class cDaftarTransaksi {
    cTransaksi front,rear;
    int jumlah;
    cDaftarTransaksi(){
        front=rear=null;
        jumlah=0;
    }
    public cTransaksi getFront(){
        return front;
    }
    public cTransaksi getRear(){
        return rear;
    }
    public void tambahTransaksi(cTransaksi baru){
        if (rear==null) {
            front=rear=baru;
        }
        else{
            rear.next=baru;
            rear=baru;
        }
        System.out.println("Penambahan Suksess...");
    }
    public void lihatTransaksi(){
        int i=1;
        System.out.println("Daftar Transaksi :");
        for (cTransaksi t= front; t!=null; t=t.next) {
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");
            System.out.print(t.getJumlahBrg()+"-");
            System.out.println(t.getStatus());
            i++;
        }
        System.out.println("");
    }
    public void lihatTransaksiMember(){
         int i=1;
         double total=0,diskon;
        System.out.println("Daftar Transaksi member :");
        for (cTransaksi t= front; t!=null; t=t.next) {
            System.out.print(i+".");
            System.out.print(t.getKode()+"-");
            System.out.print(t.getPembeli()+"-");
            System.out.print(t.getBarang().getNama()+"-");
            System.out.print(t.getJumlahBrg()+"-");
            System.out.println(t.getStatus());
            total=total+(t.getBarang().getHarga()*t.jumlahBrg);
            i++;
        }
        System.out.println("Total Belanja : "+total);
        System.out.println("Diskon        : "+(0.05*total));
        System.out.println("Biaya         : "+(total-(0.05*total)));
        System.out.println("");
    }
   
    public void hapusTransaksi(int nomor){
        cTransaksi t=front;
        cTransaksi prev=null;
        int i=1;
        if (nomor==1) {//hapus posisi terdepan
            if (t.next==null) {
                front=rear=null;
            }
            else{
                front=front.next;
                t.next=null;
            }
            System.out.println("["+t.getBarang().getNama()+"] di hapus..");
        }
        else{
            for (; t != null; t=t.next) {
                if (i==nomor) {
                    break;
                }
                i++;
                prev=t;
            }
            if (t.next==null) {
                //yang di hapus di ujung belakang
                rear=prev;
                rear.next=null;
            }
            else{
                prev.next=t.next;
                t.next=null;
            }
            System.out.println("["+t.getBarang().getNama()+"] di hapus..");
 
        }
    }
    public void sambungTransaksi(cTransaksi depan, cTransaksi belakang){
        if (rear==null) {
            front=depan;
            rear=belakang;
        }
        else{
            //sambungkan
            rear.next=depan;
            //update rear yang baru
            rear=belakang;
        }
    }
    public void prosesTransaksi(cTransaksi t){
        //cek member
        t.setStatus(1);
    }
    public void prosesTransaksiMember(cTransaksi t){
        //mendapat diskon
    }
    public int lihatDiproses(){
        cTransaksi t=front;
        int proses=0;
        for (; t != null; t=t.next) {
            if (t.getStatus()==1) {
                proses++;
            }
        }
        return proses;
    }
    public int lihatBelumDiproses(){
        cTransaksi t=front;
        int blmproses=0;
        for (; t != null; t=t.next) {
            if (t.getStatus()==0) {
                blmproses++;
            }
        }
        return blmproses;
    }
    public double jumlahPemasukan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t != null; t=t.next) {
            if (t.getStatus()==1) {
                //cek memeber menggunakan data nama/kode pembeli
                nominal=nominal+t.getBarang().harga*t.jumlahBrg;
                if(t.pembeli.equalsIgnoreCase("10")||t.pembeli.equalsIgnoreCase("11")||t.pembeli.equalsIgnoreCase("12")){
                    System.out.println();
                    nominal=nominal-(0.05*nominal);
                    
                }
            }
        }
        return nominal;
    }
    public double Laporan(){
        cTransaksi t=front;
        double nominal=0;
        for (; t != null; t=t.next) {
            if (t.getStatus()==1) {
                //cek memeber menggunakan data nama/kode pembeli
                nominal=nominal+t.getBarang().harga*t.jumlahBrg;
                if(t.pembeli.equalsIgnoreCase("10")||t.pembeli.equalsIgnoreCase("11")||t.pembeli.equalsIgnoreCase("12")){
                    System.out.println();
                    nominal=nominal-(0.05*nominal);
                    
                }
            }
        }
        return nominal;
    }
}
