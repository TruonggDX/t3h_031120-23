package QuanLyNhanVien;

import java.util.Date;
import java.util.Scanner;

public class Certificate {
    private String certificateID;
    private String certificateName;
    private String certificateRank;
    private String certificateDate;

    public String getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateID='" + certificateID + '\'' +
                ", certificateName='" + certificateName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                '}';
    }

    public void display(){
        System.out.println(this.toString());
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter certificateID: ");
        certificateID=sc.nextLine();
        System.out.println("Enter certificateName: ");
        certificateName=sc.nextLine();
        System.out.println("Enter certificateRank: ");
        certificateRank=sc.nextLine();
        System.out.println("Enter certificateDate: ");
        certificateDate=sc.nextLine();
    }
}

