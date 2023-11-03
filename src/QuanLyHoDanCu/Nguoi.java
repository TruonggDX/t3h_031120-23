package QuanLyHoDanCu;

import java.util.Scanner;

public class Nguoi {

//    Họ tên, Tuổi, Nghề nghiệp, số chứng minh nhân dân(duy nhất cho mỗi người).
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private String soCMND;

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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public Nguoi() {
    }

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, String soCMND) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMND = soCMND;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", soCMND='" + soCMND + '\'' +
                '}';
    }

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nghe nghiep : ");
        ngheNghiep=sc.nextLine();
        System.out.println("Nhap soCMND : ");
        soCMND=sc.nextLine();
    }
    public void hienthithongtin(){
        System.out.println(this.toString());
    }
}
