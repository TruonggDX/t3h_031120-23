package QuanLyPTGT;

import java.util.Scanner;

public class PhuongTienGT {
    private String hangSX;
    private int namSX;
    private String mauXe;
    private float giaBan;

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public PhuongTienGT() {
    }

    public PhuongTienGT(String hangSX, int namSX, String mauXe, float giaBan) {
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.mauXe = mauXe;
        this.giaBan = giaBan;
    }
    public void nhapDL(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang sx : ");
        hangSX=sc.nextLine();
        System.out.println("Nhap nam sx : ");
        namSX=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap mau xe : ");
        mauXe=sc.nextLine();
        System.out.println("Nhap gia ban : ");
        giaBan=Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "PhuongTienGT{" +
                "hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", mauXe='" + mauXe + '\'' +
                ", giaBan=" + giaBan +
                '}';
    }

    public void xuatDL() {
        System.out.println(this.toString());
    }
}
