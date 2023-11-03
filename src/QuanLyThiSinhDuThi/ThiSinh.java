package QuanLyThiSinhDuThi;

import java.util.Scanner;

public class ThiSinh {
    private String sbd;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;

    public String getSbd() {
        return sbd;
    }

    public void setSbd(String sbd) {
        this.sbd = sbd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public ThiSinh(String sbd, String hoTen, String diaChi, int mucUuTien) {
        this.sbd = sbd;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public ThiSinh() {
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "sbd='" + sbd + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
    public void nhapdulieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so bao danh : ");
        sbd=sc.nextLine();
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap dia chi : ");
        diaChi=sc.nextLine();
        System.out.println("Nhap muc uu tien : ");
        mucUuTien=Integer.parseInt(sc.nextLine());
    }
    public void hienthiTT(){
        System.out.println(this.toString());
    }
}
