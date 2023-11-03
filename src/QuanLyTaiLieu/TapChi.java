package QuanLyTaiLieu;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPH;
    private int thangPH;

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    public TapChi() {

    }

    public TapChi(String maTL, String nhaXB, int soBanPH, int soPH, int thangPH) {
        super(maTL, nhaXB, soBanPH);
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    @Override
    public void inPutData() {
        super.inPutData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phat hanh : ");
        soPH=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang phat hanh : ");
        thangPH=Integer.parseInt(sc.nextLine());
    }
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("So PH : "+soPH);
        System.out.println("Thang PH : "+thangPH);
    }
}
