package QuanLyNhanVien;

import QuanLyPTGT.oTo;
import QuanLyPTGT.xeMay;
import QuanLyPTGT.xeTai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee_Manager employeeManager = new Employee_Manager();

        int luachon=0;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("1. Them");
            System.out.println("2. Hien thi");
            System.out.println("3. Thoat");
            System.out.println("Lua chon : ");
            luachon=Integer.parseInt((sc.nextLine()));
            switch (luachon){
                case 1:
                    int temp=0;
                    System.out.println("1. Them exper");
                    System.out.println("2. Them fres");
                    System.out.println("3. Them inter");
                    System.out.println("Xin moi ban lua chon : ");
                    temp=Integer.parseInt(sc.nextLine());
                    switch (temp){
                        case 1:
//                            Experience experience = new Experience();
//                            experience.inputInfo();
//                            employeeManager.addEmployee(experience);
                            break;
                        case 2:
//                           Fresher fresher = new Fresher();
//                           fresher.inputInfo();
//                           employeeManager.addEmployee(fresher);
                            break;
                        case 3:
//                            Intern intern = new Intern();
//                            intern.inputInfo();
//                            employeeManager.addEmployee(intern);
                            break;
                        default:
                            System.out.println("Loi");
                    }
                    break;
                case 2:
                    employeeManager.showListEmployee();
                    break;
                case 3:
                    return;
            }
        }while (luachon!=3);
    }
}
