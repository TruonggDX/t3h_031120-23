package QuanLyHoDanCu;

import java.util.Scanner;

public class HoGiaDinh extends Nguoi{
    private int soTV;
    private int soNha;

    public int getSoTV() {
        return soTV;
    }

    public void setSoTV(int soTV) {
        this.soTV = soTV;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public HoGiaDinh() {

    }

    public HoGiaDinh(String hoTen, int tuoi, String ngheNghiep, String soCMND, int soTV, int soNha) {
        super(hoTen, tuoi, ngheNghiep, soCMND);
        this.soTV = soTV;
        this.soNha = soNha;
    }


    public String display() {
        return "HoGiaDinh{" +
                "soTV=" + soTV +
                ", soNha=" + soNha +
                '}';
    }

    public void nhapTT(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thanh vien trong gia dinh : ");
        soTV=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so nha : ");
        soNha=Integer.parseInt(sc.nextLine());
    }
    public void xuatTT(){
        super.hienthithongtin();
        System.out.println(this.display());
    }
}
