package QuanLyNhanVien;

import java.util.Scanner;

public class Fresher extends Employee{
    private float Graduation_date;
    private String Graduation_rank;
    private String Education;

    public float getGraduation_date() {
        return Graduation_date;
    }

    public void setGraduation_date(float graduation_date) {
        Graduation_date = graduation_date;
    }

    public String getGraduation_rank() {
        return Graduation_rank;
    }

    public void setGraduation_rank(String graduation_rank) {
        Graduation_rank = graduation_rank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }



    public String dispaly() {
        return "Fresher{" +
                "Graduation_date=" + Graduation_date +
                ", Graduation_rank='" + Graduation_rank + '\'' +
                ", Education='" + Education + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Graduation_date: ");
        this.Graduation_date = Float.parseFloat(sc.nextLine());
        System.out.println("Graduation_rank: ");
        this.Graduation_rank=sc.nextLine();
        System.out.println("Education: ");
        this.Education=sc.nextLine();
    }
    public void showMe(){
        super.ShowInfo();
        System.out.println(this.dispaly());
    }
}
