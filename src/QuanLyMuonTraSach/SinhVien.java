package QuanLyMuonTraSach;

import java.util.Scanner;

public class SinhVien{
    private String hoTen;
    private int tuoi;
    private String lop;

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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }


    public SinhVien(String hoTen, int tuoi, String lop) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lop : ");
        lop=sc.nextLine();
    }

    public void xuatDL() {
        System.out.println("*****THONG TIN*****");
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Lop : "+lop);
    }
}
