package QuanLyTaiLieu;

import java.util.Scanner;

public class Bao extends  TaiLieu{
    private int ngayPH;

    public int getNgayPH() {
        return ngayPH;
    }

    public void setNgayPH(int ngayPH) {
        this.ngayPH = ngayPH;
    }

    public Bao() {

    }

    public Bao(String maTL, String nhaXB, int soBanPH, int ngayPH) {
        super(maTL, nhaXB, soBanPH);
        this.ngayPH = ngayPH;
    }

    @Override
    public void inPutData() {
        super.inPutData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay phat hanh : ");
        ngayPH=Integer.parseInt(sc.nextLine());
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Ngay PH : "+ngayPH);
    }
}
