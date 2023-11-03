package QuanLyHoSoHocSinh;

import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private int tuoi;
    private String queQuan;

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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public HocSinh(String hoTen, int tuoi, String queQuan) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public HocSinh() {
    }
    public void nhapDuLieu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan : ");
        queQuan=sc.nextLine();
    }
    public void xuatDuLieu(){
        System.out.println("*****Thong tin hoc sinh*****");
        System.out.println();
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Que quan : "+queQuan);
    }
}
