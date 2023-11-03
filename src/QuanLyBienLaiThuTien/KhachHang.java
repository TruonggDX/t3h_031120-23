package QuanLyBienLaiThuTien;

import java.util.Scanner;

public class KhachHang {
    private String hoTen;
    private int soNha;
    private String maCongTo;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    public KhachHang() {
    }

    public KhachHang(String hoTen, int soNha, String maCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }


    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTen='" + hoTen + '\'' +
                ", soNha=" + soNha +
                ", maCongTo='" + maCongTo + '\'' +
                '}';
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap so nha : ");
        soNha=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ma cong to : ");
        maCongTo=sc.nextLine();
    }
    public void hienthi(){
        System.out.println(this.toString());
    }
}
