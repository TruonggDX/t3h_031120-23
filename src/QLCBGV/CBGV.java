package QLCBGV;

import java.util.Scanner;

public class CBGV extends  Nguoi{
//    lương cứng, lương thưởng, tiền phạt, lương thực lĩnh
    private float luongCung;
    private float luongThuong;
    private float tienPhat;
    private float luongThucLinh;

    public float getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(float luongCung) {
        this.luongCung = luongCung;
    }

    public float getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(float luongThuong) {
        this.luongThuong = luongThuong;
    }

    public float getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(float tienPhat) {
        this.tienPhat = tienPhat;
    }

    public float getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(float luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public CBGV(String hoTen, int tuoi, String queQuan, String maSoGV, float luongCung, float luongThuong, float tienPhat, float luongThucLinh) {
        super(hoTen, tuoi, queQuan, maSoGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongThucLinh;
    }

    public CBGV() {
    }

//    Tính lương thực lĩnh cho giáo viên: Lương thực = Lương cứng + lương thưởng – lương phạt.
    public double salary(){
        double salary=0;
        salary = luongCung + luongThuong - tienPhat;
        return salary;
    }
    public void nhapXL(){
        Scanner sc = new Scanner(System.in);
//        Nguoi nguoi = new Nguoi();
//        nguoi.input();
        super.input();
        System.out.println("Nhap luong cung : ");
        luongCung=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap luong thuong : ");
        luongThuong=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap tien phat : ");
        tienPhat=Float.parseFloat(sc.nextLine());
        System.out.println("Nhap luong thuc linh : ");
        luongThucLinh=Float.parseFloat(sc.nextLine());
    }
    public void xuatDL(){
        super.output();
        System.out.println("luong cung : " +luongCung);
        System.out.println("Luong thuong : "+luongThuong);
        System.out.println("Tien phat : "+tienPhat);
        System.out.println("Luong thuc linh : "+luongThucLinh);
        System.out.println("Luong : "+salary());
    }

}

