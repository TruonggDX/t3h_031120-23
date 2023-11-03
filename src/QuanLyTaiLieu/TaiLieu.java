package QuanLyTaiLieu;

import java.util.Scanner;

public class TaiLieu {
    private String maTL;
    private String nhaXB;
    private int SoBanPH;

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public int getSoBanPH() {
        return SoBanPH;
    }

    public void setSoBanPH(int soBanPH) {
        SoBanPH = soBanPH;
    }

    public TaiLieu() {
    }

    public TaiLieu(String maTL, String nhaXB, int soBanPH) {
        this.maTL = maTL;
        this.nhaXB = nhaXB;
        SoBanPH = soBanPH;
    }


    public void inPutData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma tai lieu : ");
        maTL=sc.nextLine();
        System.out.println("Nhap nha xuat ban : ");
        nhaXB=sc.nextLine();
        System.out.println("Nhap so ban phat hanh : ");
        SoBanPH=Integer.parseInt(sc.nextLine());
    }
    public void displayData(){
        System.out.println("Thông tin tài liệu");
        System.out.println();
        System.out.println("Ma tai lieu : "+maTL);
        System.out.println("Nha XB : "+nhaXB);
        System.out.println("So ban PH : "+SoBanPH);
    }
}
