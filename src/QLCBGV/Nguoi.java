package QLCBGV;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private  String maSoGV;

    public Nguoi(String hoTen, int tuoi, String queQuan, String maSoGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGV = maSoGV;
    }

    public Nguoi() {
    }

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

    public String getMaSoGV() {
        return maSoGV;
    }

    public void setMaSoGV(String maSoGV) {
        this.maSoGV = maSoGV;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten : ");
        hoTen=sc.nextLine();
        System.out.println("Nhap tuoi : ");
        tuoi=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan : ");
        queQuan=sc.nextLine();
        System.out.println("Nhap ma so GV : ");
        maSoGV=sc.nextLine();
    }

    public void output(){
        System.out.println("**********Thong tin**********");
        System.out.println("Ho ten : "+hoTen);
        System.out.println("Tuoi : "+tuoi);
        System.out.println("Que Quan : "+queQuan);
        System.out.println("Ma so GV : "+maSoGV);
    }
}
