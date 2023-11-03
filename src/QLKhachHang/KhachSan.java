package QLKhachHang;

import java.util.Scanner;

public class KhachSan extends Nguoi{
    private int soNgayThue;
    private String loaiPhong;
    private final int phongA=500;
    private final int phongB=300;
    private final int phongC=100;


    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getPhongA() {
        return phongA;
    }

    public int getPhongB() {
        return phongB;
    }

    public int getPhongC() {
        return phongC;
    }

    public KhachSan(String hoTen, int tuoi, long soCMND, int soNgayThue, String loaiPhong) {
        super(hoTen, tuoi, soCMND);
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
    }

    public KhachSan() {
    }


    @Override
    public void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so ngay thue: ");
        soNgayThue=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap loai phong ( A. Loại A B.Loại B C.Loại C ) : ");
        switch (loaiPhong){
            case "A" :
                loaiPhong = "A";
                break;
            case "B" :
                loaiPhong="B";
                break;
            case "C":
                loaiPhong="C";
                break;
            default:
                System.out.println("Gia tri khong hop le");
                break;
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("So ngay thue : "+soNgayThue);
        System.out.println("Loai phong : "+loaiPhong);
    }
}
