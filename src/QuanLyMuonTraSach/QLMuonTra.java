package QuanLyMuonTraSach;

import java.util.Scanner;

public class QLMuonTra {
    private TheMuon[] listTheMuon;
    private int soluongTheMuon;

    public QLMuonTra() {
        listTheMuon = new TheMuon[10];
        soluongTheMuon=0;
    }

    public void addTheMuon(){
        TheMuon theMuon=new TheMuon();
        theMuon.nhapDL();
        if (soluongTheMuon >= listTheMuon.length) {
            System.out.println("Danh sach the muon da day. Vui long tang kich thuoc danh sach.");
            return;
        }
        listTheMuon[soluongTheMuon] = theMuon;
        soluongTheMuon++;
        System.out.println("Them the muon moi thanh cong.");
    }
    public void hienThiTheMuon(){
        for(TheMuon theMuon : listTheMuon){
            if (theMuon!=null){
                theMuon.xuatDL();
            }
        }
    }

    public void xoaTheMuon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma the muon can xoa : ");
        String maDelete = sc.nextLine();
        for (int i = 0 ; i < soluongTheMuon;i++){
            TheMuon theMuon = listTheMuon[i];
            if (theMuon!=null && theMuon.getMaPhieuMuon().equals(maDelete)){
                for (int j = i ; j < soluongTheMuon - 1;j++){
                        listTheMuon[j]=listTheMuon[j+1];
                }
                listTheMuon[this.soluongTheMuon - 1]=null;
                this.soluongTheMuon--;
                System.out.println("Success");
                return;
            }
        }
        System.out.println("Fail,Khong tim thay the muon co ma "+maDelete +"de xoa");
    }
}
