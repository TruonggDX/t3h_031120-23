package QLKhachHang;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private long soCMND;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public long getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(long soCMND) {
        this.soCMND = soCMND;
    }

    public Nguoi(String hoTen, int tuoi, long soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.soCMND = soCMND;
    }

    public Nguoi() {
    }

    public void inPut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so CMND : ");
        soCMND=Long.parseLong(sc.nextLine());
    }
    public void display(){
        System.out.println("Thông tin khách hàng");
        System.out.println();
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("So CMND : "+soCMND);
    }
}
