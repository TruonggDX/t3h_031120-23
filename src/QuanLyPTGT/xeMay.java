package QuanLyPTGT;

import java.util.Scanner;

public class xeMay extends PhuongTienGT {
    private int congSuat;

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public xeMay() {

    }

    public xeMay(String hangSX, int namSX, String mauXe, float giaBan, int congSuat) {
        super(hangSX, namSX, mauXe, giaBan);
        this.congSuat = congSuat;
    }


    public String display() {
        return "xeMay{" +
                "congSuat=" + congSuat +
                '}';
    }

    @Override
    public void nhapDL() {
        super.nhapDL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cong suat : ");
        congSuat=Integer.parseInt(sc.nextLine());
    }


    public void xuatdata() {
        super.xuatDL();
        System.out.println(this.display());
    }

}
