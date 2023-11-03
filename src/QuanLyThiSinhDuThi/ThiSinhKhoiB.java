package QuanLyThiSinhDuThi;

public class ThiSinhKhoiB extends ThiSinh{
    public static final String TOAN = "Toan";
    public static final String SINH = "Sinh";
    public static final String HOA = "Hoa";

    public ThiSinhKhoiB(String sbd, String hoTen, String diaChi, int mucUuTien) {
        super(sbd, hoTen, diaChi, mucUuTien);
    }

    public ThiSinhKhoiB() {
    }

    public String displaydata() {
        return "ThiSinhKhoiB{" +
                "" + TOAN + " - " + SINH + " - " + HOA +"}";
    }

    @Override
    public void nhapdulieu() {
        super.nhapdulieu();
    }


    public void hienthi() {
        super.hienthiTT();
        System.out.println(this.displaydata());
    }
}
