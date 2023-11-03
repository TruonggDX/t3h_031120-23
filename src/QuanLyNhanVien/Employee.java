package QuanLyNhanVien;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Employee {
//    ID, FullName, BirthDay,Phone, Email, Employee_type,Employee_count
    private String ID;
    private String fullName;
    private String birthDay;
    private String phone;
    private String email;
    private int employeeType;
    public static int Employee_count;
    private Certificate certificate;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployee_count() {
        return Employee_count;
    }

    public void setEmployee_count(int employee_count) {
        Employee_count = employee_count;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Employee(String ID, String fullName, String birthDay, String phone, String email, int employeeType, int employee_count, Certificate certificate) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.employeeType = employeeType;
        Employee_count = employee_count;
        this.certificate = certificate;
    }

    public Employee() {
        certificate = new Certificate();
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID : ");
        this.ID=scanner.nextLine();
        System.out.print("Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.print("Birth Day: ");
        birthDay=scanner.nextLine();
        System.out.print("Phone: ");
        this.phone = scanner.nextLine();

        System.out.print("Email: ");
        this.email = scanner.nextLine();

        System.out.print("Employee Type (0: Experience, 1: Fresher , 2: Intern ): ");
        this.employeeType = scanner.nextInt();


        certificate.inputInfo();

    }

    public String toStringEmployee() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", employeeType=" + employeeType +
                ", Employee_count=" + Employee_count +
                ", certificate=" + certificate.toString() +
                '}';
    }

    public void ShowInfo() {
        System.out.println(this.toStringEmployee());
    }
}

