package SoPhucInput;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    public void nhapDL() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan thuc: ");
        phanThuc = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap phan ao: ");
        phanAo = Double.parseDouble(scanner.nextLine());
    }

    public void hienThiDL() {
        System.out.println(phanThuc + " + " + phanAo + " i");
    }
    public void congHaiSoPhuc(SoPhuc soPhuc) {
        double phanThuc = this.phanThuc + soPhuc.phanThuc;
        double phanAo = this.phanAo + soPhuc.phanAo;

        SoPhuc congHaiSoPhuc = new SoPhuc(phanThuc, phanAo);
        congHaiSoPhuc.hienThiDL();
    }
    public void nhanHaiSoPhuc(SoPhuc soPhuc){
        double phanThuc = this.phanThuc* soPhuc.phanThuc - this.phanAo*soPhuc.phanAo;
        double phanAo = this.phanThuc * soPhuc.phanAo + this.phanAo * soPhuc.phanThuc;
        SoPhuc ketquanhanHaiSoPhuc = new SoPhuc(phanThuc,phanAo);
        ketquanhanHaiSoPhuc.hienThiDL();
    }

}
