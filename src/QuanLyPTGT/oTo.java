package QuanLyPTGT;

import java.util.Scanner;

public class oTo extends PhuongTienGT{
    private int soChoNgoi;
    private String kieuDongCo;

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    public oTo() {

    }
    public oTo(String hangSX, int namSX, String mauXe, float giaBan, int soChoNgoi, String kieuDongCo) {
        super(hangSX, namSX, mauXe, giaBan);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    public String display() {
        return "oTo{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                '}';
    }


    @Override
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        super.nhapDL();
        System.out.println("Nhap so cho ngoi : ");
        soChoNgoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap kieu dong co : ");
        kieuDongCo=sc.nextLine();
    }

    public void xuatdata() {
        super.xuatDL();
        System.out.println(this.display());
    }
}
