package QuanLyBienLaiThuTien;

import java.util.Scanner;

public class BienLai {
    private int csm;
    private int csc;
    private float soTienPhaiTra;
    private KhachHang khachHang;

    public int getCsm() {
        return csm;
    }

    public void setCsm(int csm) {
        this.csm = csm;
    }

    public int getCsc() {
        return csc;
    }

    public void setCsc(int csc) {
        this.csc = csc;
    }

    public float getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(float soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public BienLai(int csm, int csc, float soTienPhaiTra, KhachHang khachHang) {
        this.csm = csm;
        this.csc = csc;
        this.soTienPhaiTra = soTienPhaiTra;
        this.khachHang = khachHang;
    }

    public BienLai() {
    }

    public String display() {
        return "BienLai{" +
                ",csm="+csm+
                ",csc="+csc+
                ",soTienPhaiTra=" + soTienPhaiTra +
                "}";
    }


    public void nhapdulieu(){
        System.out.println("Thong tin khach hang");
        khachHang = new KhachHang();
        khachHang.nhap();
        System.out.println("Thong tin bien lai");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chi so moi : ");
        csm=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap chi so cu : ");
        csc=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so tien phai tra :");
        soTienPhaiTra=Float.parseFloat(sc.nextLine());
    }
    public float tienDien(){
        float tienDienPhaiTra =0;
        tienDienPhaiTra=(csm - csc)*5;
        return tienDienPhaiTra;
    }
    public void hienthidulieu(){
        khachHang.hienthi();
        System.out.println(this.display());
        System.out.println("Tien dien : "+tienDien());
    }
}
