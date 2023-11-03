package QuanLyNhanVien;

import java.util.Date;
import java.util.Scanner;

public class Experience extends Employee{
    private int ExpInYear;
    private String ProSkill;

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }


    public Experience(String ID, String fullName, String birthDay, String phone, String email, int employeeType, int employee_count, Certificate certificate, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, employeeType, employee_count, certificate);
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    public Experience() {

    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.print("expInYear: ");
        this.ExpInYear= Integer.parseInt(sc.nextLine());

        System.out.print("proSkill: ");
        this.ProSkill = sc.nextLine();
    }

    public String display() {
        return "Experience{" +
                "ExpInYear=" + ExpInYear +
                ", ProSkill='" + ProSkill + '\'' +
                '}';
    }

    public void showMe(){
        super.ShowInfo();
        System.out.println(this.display());
    }
}
