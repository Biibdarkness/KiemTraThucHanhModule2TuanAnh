package view;

import model.TelephoneDirectory;
import service.TelephoneDirectoryService;
import util.Utils;

import java.util.List;
import java.util.Scanner;

public class TelephoneDirectoryView {
    Scanner scanner = new Scanner(System.in);
    TelephoneDirectoryService telephoneDirectoryService = new TelephoneDirectoryService();
    Menu menu = new Menu();


    public void show() {
        List<TelephoneDirectory> telephoneDirectory = telephoneDirectoryService.getTelephoneDirectory();
        System.out.println("∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼∼ DANH SÁCH DANH BẠ ∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽");
        System.out.printf("%-20s %-10s %-25s %-15s %-20s", "Số điện thoại", "Nhóm", "Họ Tên", "Giới tính", "Địa chỉ");
        System.out.println(" ");
        for (TelephoneDirectory check : telephoneDirectory) {
            System.out.printf("%-20s %-10s %-25s %-15s %-20s\n", check.getPhoneNumber(), check.getGroupTD(), check.getFullName(), check.getGender(), check.getAddress());
        }
        System.out.println("∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽");
    }


    public void add() {
        telephoneDirectoryService.getTelephoneDirectory();
        System.out.println("Nhập số điện thoại (vd: 0971789396)");
        System.out.print("\t➺ ");
        String phone = scanner.nextLine();
        while (!Utils.isEmptyValid(phone)) {
            System.out.println("Số điện thoại không được để trống");
            System.out.println("Nhập số điện thoại (vd: 0971789396");
            System.out.print("\t➺ ");
            phone = scanner.nextLine();
        }
        while (!Utils.isPhoneValid(phone)) {
            System.out.println("Số " + phone + " của bạn không đúng định dạng. Vui lòng nhập lại! " + "(Số điện thoại bao gồm 10 số và bắt đầu là số 0)");
            System.out.println("Nhập số điện thoại (vd: 0971789396)");
            System.out.print("\t➺ ");
            phone = scanner.nextLine();
        }
        while (telephoneDirectoryService.checkDuplicatePhoneNumber(phone)) {
            System.out.println("Số điện thoại này đã tồn tại. Vui lòng nhập lại số điện thoại khác");
            System.out.print("\t➺ ");
            phone = scanner.nextLine();
        }
        System.out.println("Nhập nhóm của danh bạ");
        System.out.print("\t➺ ");
        String group = scanner.nextLine();
        while (!Utils.isEmptyValid(group)) {
            System.out.println("Nhóm của danh bạ không được để trống");
            System.out.println("Nhập nhóm của danh bạ");
            System.out.print("\t➺ ");
            group = scanner.nextLine();
        }
        System.out.println("Nhập họ và tên (vd: Nguyen Van Tuan Anh)");
        System.out.print("\t➺ ");
        String fullName = scanner.nextLine();
        while (!Utils.isEmptyValid(fullName)) {
            System.out.println("Họ và tên không được để trống");
            System.out.println("Nhập họ và tên (vd: Nguyen Van Tuan Anh)");
            System.out.print("\t➺ ");
            fullName = scanner.nextLine();
        }
        while (telephoneDirectoryService.checkDuplicateName(fullName)) {
            System.out.println("Tên người dùng này đã tồn tại. Vui lòng nhập lại tên khác");
            System.out.print("\t➺ ");
            fullName = scanner.nextLine();
        }
        System.out.println("Nhập giới tính");
        System.out.print("\t➺ ");
        String gender = scanner.nextLine();
        while (!Utils.isEmptyValid(gender)) {
            System.out.println("Giới tính không được để trống");
            System.out.println("Nhập giới tính");
            System.out.print("\t➺ ");
            gender = scanner.nextLine();
        }
        System.out.println("Nhập địa chỉ");
        System.out.print("\t➺ ");
        String address = scanner.nextLine();
        while (!Utils.isEmptyValid(address)) {
            System.out.println("Địa chỉ không được để trống");
            System.out.println("Nhập địa chỉ");
            System.out.print("\t➺ ");
            address = scanner.nextLine();
        }
        System.out.println("Nhập ngày sinh (vd:08/04/1996)");
        System.out.print("\t➺ ");
        String birthdate = scanner.nextLine();
        while (!Utils.isEmptyValid(birthdate)) {
            System.out.println("Ngày sinh không được để trống");
            System.out.println("Nhập ngày sinh (vd:08/04/1996)");
            System.out.print("\t➺ ");
            birthdate = scanner.nextLine();
        }
        System.out.println("Nhập email (vd: nguyenvantuananh@gmail.com)");
        System.out.print("\t➺ ");
        String email = scanner.nextLine();
        while (!Utils.isEmptyValid(email)) {
            System.out.println("Email không được để trống");
            System.out.println("Nhập email (vd: nguyenvantuananh@gmail.com)");
            System.out.print("\t➺ ");
            email = scanner.nextLine();
        }
        while (!Utils.isEmailValid(email)) {
            System.out.println("Email" + email + "của bạn không đúng định dạng! Vui lòng kiểm tra và nhập lại" + "(email bắt buộc phải có @)");
            System.out.println("Nhập email (vd: nguyenvantuananh@gmail.com)");
            System.out.print("\t➺ ");
            email = scanner.nextLine();
        }
        while (telephoneDirectoryService.checkDuplicateEmail(email)) {
            System.out.println("Email" + email + "của bạn đã tồn tại! vui lòng kiểm tra lại");
            System.out.println("Nhập email (vd: nguyenvantuananh@gmail.com)");
            System.out.print("\t➺ ");
            email = scanner.nextLine();
        }
        TelephoneDirectory telephoneDirectory = new TelephoneDirectory(phone, group, fullName, gender, address, birthdate, email);
        telephoneDirectoryService.add(telephoneDirectory);
        System.out.println("Đã thêm thành công!");
        System.out.println("============================================================================================");

    }

    public void update() {
            telephoneDirectoryService.getTelephoneDirectory();
            System.out.println("Nhập số điện thoại bạn cần sửa: ");
            System.out.print("\t➺ ");
            String phone = scanner.nextLine();
            TelephoneDirectory telephoneDirectory = telephoneDirectoryService.getPhone(phone);
            if (telephoneDirectory == null) {
                System.out.println("Không tìm được danh bạ với số điện thoại trên!");
            } else {
                System.out.println("Nhập nhóm mà bạn muốn sửa: ");
                System.out.print("\t➺ ");
                String group = scanner.nextLine();
                while (!Utils.isEmptyValid(group)) {
                    System.out.println("Nhóm của danh bạ không được để trống");
                    System.out.println("Nhập nhóm mà bạn muốn sửa: ");
                    System.out.print("\t➺ ");
                    group = scanner.nextLine();
                }
                telephoneDirectory.setGroupTD(group);
                System.out.println("Nhập họ và tên mà bạn muốn sửa: ");
                System.out.print("\t➺ ");
                String fullName = scanner.nextLine();
                while (!Utils.isEmptyValid(fullName)) {
                    System.out.println("Họ và tên không được để trống");
                    System.out.println("Nhập họ và tên mà bạn muốn sửa: ");
                    System.out.print("\t➺ ");
                    fullName = scanner.nextLine();
                }
                while (telephoneDirectoryService.checkDuplicateName(fullName)) {
                    System.out.println("Tên người dùng này đã tồn tại. Vui lòng nhập lại tên khác");
                    System.out.print("\t➺ ");
                    fullName = scanner.nextLine();
                }
                telephoneDirectory.setFullName(fullName);
                System.out.println("Nhập giới tính mà bạn muốn sửa: ");
                System.out.print("\t➺ ");
                String gender = scanner.nextLine();
                while (!Utils.isEmptyValid(gender)) {
                    System.out.println("Giới tính không được để trống");
                    System.out.println("Nhập giới tính mà bạn muốn sửa: ");
                    System.out.print("\t➺ ");
                    gender = scanner.nextLine();
                }
                telephoneDirectory.setGender(gender);
                System.out.println("Nhập địa chỉ mà bạn muốn sửa: ");
                System.out.print("\t➺ ");
                String address = scanner.nextLine();
                while (!Utils.isEmptyValid(address)) {
                    System.out.println("Địa chỉ không được để trống");
                    System.out.println("Nhập địa chỉ mà bạn muốn sửa: ");
                    System.out.print("\t➺ ");
                    address = scanner.nextLine();
                }
                telephoneDirectory.setAddress(address);
                System.out.println("Nhập ngày sinh mà bạn muốn sửa: (vd:08/04/1996)");
                System.out.print("\t➺ ");
                String birthdate = scanner.nextLine();
                while (!Utils.isEmptyValid(birthdate)) {
                    System.out.println("Ngày sinh không được để trống");
                    System.out.println("Nhập ngày sinh mà bạn muốn sửa: (vd:08/04/1996)");
                    System.out.print("\t➺ ");
                    birthdate = scanner.nextLine();
                }
                telephoneDirectory.setBirthdate(birthdate);
                System.out.println("Nhập email mà bạn muốn sửa: (vd: nguyenvantuananh@gmail.com)");
                System.out.print("\t➺ ");
                String email = scanner.nextLine();
                while (!Utils.isEmptyValid(email)) {
                    System.out.println("Email không được để trống");
                    System.out.println("Nhập email mà bạn muốn sửa: (vd: nguyenvantuananh@gmail.com)");
                    System.out.print("\t➺ ");
                    email = scanner.nextLine();
                }
                while (!Utils.isEmailValid(email)) {
                    System.out.println("Email" + email + "của bạn không đúng định dạng! Vui lòng kiểm tra và nhập lại" + "(email bắt buộc phải có @)");
                    System.out.println("Nhập email mà bạn muốn sửa: (vd: nguyenvantuananh@gmail.com)");
                    System.out.print("\t➺ ");
                    email = scanner.nextLine();
                }
                while (telephoneDirectoryService.checkDuplicateEmail(email)) {
                    System.out.println("Email" + email + "của bạn đã tồn tại! vui lòng kiểm tra lại");
                    System.out.println("Nhập email mà bạn muốn sửa: (vd: nguyenvantuananh@gmail.com)");
                    System.out.print("\t➺ ");
                    email = scanner.nextLine();
                }
                telephoneDirectory.setEmail(email);
                telephoneDirectoryService.update();
                System.out.println("Đã sửa thành công!");
                System.out.println("============================================================================================");

            }

    }

    public void remove() {
        telephoneDirectoryService.getTelephoneDirectory();
        System.out.println("Nhập số điện thoại bạn cần xoá: ");
        System.out.print("\t➺ ");
        String phone = scanner.nextLine();
        TelephoneDirectory telephoneDirectory = telephoneDirectoryService.getPhone(phone);
        if (telephoneDirectory == null) {
            System.out.println("Không tìm được danh bạ với số điện thoại trên!");
        } else {
            telephoneDirectoryService.remove(telephoneDirectory);
            System.out.println("Đã xoá thành công!");
        }
    }

    public void findByPhoneNumber() {
        System.out.print("Nhập số điện thoại cần tìm: ");
        String phone = scanner.nextLine();
        boolean found = false;
        List<TelephoneDirectory> telephoneDirectory = telephoneDirectoryService.getTelephoneDirectory();
        System.out.println("Danh bạ điện thoại");
        System.out.printf("%-20s %-10s %-25s %-15s %-20s", "Số điện thoại", "Nhóm", "Họ Tên", "Giới tính", "Địa chỉ");
        System.out.println(" ");
        for (TelephoneDirectory check : telephoneDirectory) {
            if (check.getPhoneNumber().equals(phone)) {
                System.out.printf("%-20s %-10s %-25s %-15s %-20s\n", check.getPhoneNumber(), check.getGroupTD(), check.getFullName(), check.getGender(), check.getAddress());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t✖ Không tìm thấy số điện thoại này ✖");
        }
        System.out.println("============================================================================================");
    }


}

