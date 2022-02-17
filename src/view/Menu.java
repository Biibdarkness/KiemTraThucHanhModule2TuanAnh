package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void run() {
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            TelephoneDirectoryView telephoneDirectoryView = new TelephoneDirectoryView();
            menu();
            try {
                System.out.println(" Chọn chức năng: ");
                System.out.print("\t➺ ");
                number = scanner.nextInt();
                switch (number) {
                    case 1:
                        telephoneDirectoryView.show();
                        break;
                    case 2:
                        telephoneDirectoryView.add();
                        break;
                    case 3:
                        telephoneDirectoryView.update();
                        break;
                    case 4:
                        telephoneDirectoryView.remove();
                        break;
                    case 5:
                        telephoneDirectoryView.findByPhoneNumber();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        run();
                }
            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

    }

    public static void menu() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ  ⚪ ⚪ ⚪  ⚪");
        System.out.println("⚪                                                 ⚪");
        System.out.println("⚪    Chọn chức năng theo số (để tiếp tục):        ⚪");
        System.out.println("⚪          1. Xem danh sách                       ⚪");
        System.out.println("⚪          2. Thêm mới                            ⚪");
        System.out.println("⚪          3. Cập nhật                            ⚪");
        System.out.println("⚪          4. Xóa                                 ⚪");
        System.out.println("⚪          5. Tìm kiếm theo số điện thoại         ⚪");
        System.out.println("⚪          6. Thoát                               ⚪");
        System.out.println("⚪                                                 ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪");
    }
}
