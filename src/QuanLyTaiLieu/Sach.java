package QuanLyTaiLieu;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTG;
    private int soTrang;

    public String getTenTG() {
        return tenTG;
    }

    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach() {
    }

    public Sach(String maTL, String nhaXB, int soBanPH, String tenTG, int soTrang) {
        super(maTL, nhaXB, soBanPH);
        this.tenTG = tenTG;
        this.soTrang = soTrang;
    }
    @Override
    public void inPutData() {
        super.inPutData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten tac gia : ");
        tenTG=sc.nextLine();
        System.out.println("Nhap so trang : ");
        soTrang=Integer.parseInt(sc.nextLine());
    }
    @Override
    public void displayData() {
        super.displayData();
        System.out.println("Ten tac gia : "+tenTG);
        System.out.println("So trang : "+soTrang);
    }
}
