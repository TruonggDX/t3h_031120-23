package QuanLyNhanVien;

import java.util.Scanner;

public class Intern extends Employee{
    private String majors;
    private int Semester;
    private String University_name;

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }

    public String getUniversity_name() {
        return University_name;
    }

    public void setUniversity_name(String university_name) {
        University_name = university_name;
    }



    public String display() {
        return "Intern{" +
                "majors='" + majors + '\'' +
                ", Semester=" + Semester +
                ", University_name='" + University_name + '\'' +
                '}';
    }

    @Override
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Majors : ");
        this.majors=sc.nextLine();
        System.out.println("Semester : ");
        this.Semester=Integer.parseInt(sc.nextLine());
        System.out.println("University_name : ");
        this.University_name=sc.nextLine();
    }
    public void showMe(){
        super.ShowInfo();
        System.out.println(this.display());
    }
}
