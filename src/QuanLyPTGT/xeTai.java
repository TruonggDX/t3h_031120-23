package QuanLyPTGT;

import java.util.Scanner;

public class xeTai extends PhuongTienGT{
    private int trongTai;

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    public xeTai() {

    }

    public xeTai(String hangSX, int namSX, String mauXe, float giaBan, int trongTai) {
        super(hangSX, namSX, mauXe, giaBan);
        this.trongTai = trongTai;
    }


    public String display() {
        return "xeTai{" +
                "trongTai=" + trongTai +
                '}';
    }

    @Override
    public void nhapDL() {
        super.nhapDL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap trong tai : ");
        trongTai=Integer.parseInt(sc.nextLine());
    }


    public void xuatdata() {
        super.xuatDL();
        System.out.println(this.display());
    }
}
