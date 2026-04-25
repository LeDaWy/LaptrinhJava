package tensinhvien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class qlisvien_arraylist {
	 static ArrayList<String> ds = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void menu() {
	        System.out.println("\n===== MENU =====");
	        System.out.println("1. Thêm sinh viên");
	        System.out.println("2. Xuất danh sách");
	        System.out.println("3. Sửa sinh viên");
	        System.out.println("4. Xóa sinh viên theo tên");
	        System.out.println("5. Tìm sinh viên chứa 'An'");
	        System.out.println("6. Sắp xếp");
	        System.out.println("7. Số lượng sinh viên");
	        System.out.println("0. Thoát");
	        System.out.print("Chọn: ");
	    }

	    public static void main(String[] args) {
	        int choice;

	        do {
	            menu();
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập tên SV: ");
	                    ds.add(sc.nextLine());
	                    break;

	                case 2:
	                    System.out.println("Danh sách:");
	                    for (String s : ds) {
	                        System.out.println(s);
	                    }
	                    break;

	                case 3:
	                    System.out.print("Nhập vị trí cần sửa: ");
	                    int index = sc.nextInt();
	                    sc.nextLine();
	                    if (index >= 0 && index < ds.size()) {
	                        System.out.print("Tên mới: ");
	                        ds.set(index, sc.nextLine());
	                    } else {
	                        System.out.println("Không hợp lệ!");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Nhập tên cần xóa: ");
	                    String name = sc.nextLine();
	                    ds.removeIf(s -> s.contains(name));
	                    break;

	                case 5:
	                    System.out.println("SV chứa 'An':");
	                    for (String s : ds) {
	                        if (s.contains("An")) {
	                            System.out.println(s);
	                        }
	                    }
	                    break;

	                case 6:
	                    Collections.sort(ds);
	                    System.out.println("Đã sắp xếp!");
	                    break;

	                case 7:
	                    System.out.println("Số lượng SV: " + ds.size());
	                    break;
	            }

	        } while (choice != 0);
	    }
}
