package QLCBGV;

import java.util.Scanner;

public class QuanLyCBGV {
    private CBGV[] listCBGV;
    private int soLuongGV;

    public QuanLyCBGV(){
        this.listCBGV= new CBGV[10];
        this.soLuongGV=0;
    }
//    thức thêm, xoá các cán bộ giáo viên theo mã số giáo viên.
    public void addCBVG(){
        CBGV cbgv = new CBGV();
        cbgv.nhapXL();
        if (soLuongGV >= listCBGV.length){
            System.out.println("Danh sach day");
            return;
        }
        listCBGV[soLuongGV]=cbgv;
        soLuongGV++;
        System.out.println("Them thanh cong");
    }

    public void showListCBGV(){
        for (int i = 0; i < soLuongGV; i++) {
            listCBGV[i].xuatDL();
        }
    }

    public void removeCBGV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so CBGV can xoa : ");
        String idDelete=sc.nextLine();
        for (int i = 0 ; i < soLuongGV;i++){
            CBGV cbgvDelete = this.listCBGV[i];
            if (cbgvDelete!=null && cbgvDelete.getMaSoGV().equals(idDelete)){
                for (int j = i ; j < soLuongGV;j++){
                    listCBGV[j]=listCBGV[j+1];
                }
                listCBGV[this.soLuongGV - 1 ]=null;
                soLuongGV--;
                System.out.println("Success");
                return;
            }
        }
        System.out.println("Fail, Khong tim thay CBGV co "+idDelete);
    }
}
