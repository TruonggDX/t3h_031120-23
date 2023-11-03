package QuanLyMuonTraSach;

import java.util.Scanner;

public class TheMuon extends SinhVien {
    private String maPhieuMuon;
    private int ngayMuon;
    private int hanTra;
    private int soHieuSach;

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getHanTra() {
        return hanTra;
    }

    public void setHanTra(int hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public TheMuon(String hoTen, int tuoi, String lop, String maPhieuMuon, int ngayMuon, int hanTra, int soHieuSach) {
        super(hoTen, tuoi, lop);
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public TheMuon() {
    }


    @Override
    public void nhapDL() {
        super.nhapDL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu muon : ");
        maPhieuMuon=sc.nextLine();
        do {
            System.out.println("Nhap ngay muon : ");
            ngayMuon=Integer.parseInt(sc.nextLine());
        }while (ngayMuon<0);
       do {
           System.out.println("Nhap ngay tra : ");
           hanTra=Integer.parseInt(sc.nextLine());
       }while (hanTra<0);
        System.out.println("Nhap so hieu sach : ");
        soHieuSach=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void xuatDL() {
        super.xuatDL();
        System.out.println("Ma phieu muon : "+maPhieuMuon);
        System.out.println("Ngay muon : "+ngayMuon);
        System.out.println("Han tra : "+hanTra);
        System.out.println("So hieu sach : "+soHieuSach);
    }

}

