
import java.util.Scanner;

class ClassNhanvien {

    private String ho;
    private String ten;
    private int soSP;

    // Constructor
    public ClassNhanvien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;

        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    
    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        if (soSP >= 0) {
            this.soSP = soSP;
        } else {
            this.soSP = 0;
        }
    }

    // Tính lương
    public double getLuong() {
        double donGia;

        if (soSP >= 1 && soSP <= 199) {
            donGia = 0.5;
        } else if (soSP <= 399) {
            donGia = 0.55;
        } else if (soSP <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }

        return soSP * donGia;
    }

    // So sánh số sản phẩm
    public boolean LonHon(ClassNhanvien nv2) {
        return this.soSP > nv2.soSP;
    }

    // Xuất thông tin
    public void xuat() {
        System.out.println(ho + " " + ten +
                " | SoSP: " + soSP +
                " | Luong: " + getLuong());
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Nhập nhân viên 1
        System.out.println("Nhap nhan vien 1:");
        System.out.print("Ho: ");
        String ho1 = sc.nextLine();

        System.out.print("Ten: ");
        String ten1 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp1 = sc.nextInt();
        sc.nextLine();

        // Nhập nhân viên 2
        System.out.println("\nNhap nhan vien 2:");
        System.out.print("Ho: ");
        String ho2 = sc.nextLine();

        System.out.print("Ten: ");
        String ten2 = sc.nextLine();

        System.out.print("So san pham: ");
        int sp2 = sc.nextInt();

        // Tạo đối tượng
        ClassNhanvien nv1 = new ClassNhanvien(ho1, ten1, sp1);
        ClassNhanvien nv2 = new ClassNhanvien(ho2, ten2, sp2);

        // Xuất thông tin
        System.out.println("\n=== THONG TIN NHAN VIEN ===");
        nv1.xuat();
        nv2.xuat();

        // So sánh dùng hàm LonHon
        System.out.println("\n=== SO SANH (Dung ham LonHon) ===");

        if (nv1.LonHon(nv2)) {
            System.out.println(nv1.getTen() + " nhieu hon " +
                    (nv1.getSoSP() - nv2.getSoSP()) + " san pham");
        } else {
            System.out.println(nv2.getTen() + " nhieu hon " +
                    (nv2.getSoSP() - nv1.getSoSP()) + " san pham");
        }

        // So sánh không dùng hàm
        System.out.println("\n=== SO SANH (Khong dung ham LonHon) ===");

        if (nv1.getSoSP() > nv2.getSoSP()) {
            System.out.println(nv1.getTen() + " nhieu hon");
        } else if (nv2.getSoSP() > nv1.getSoSP()) {
            System.out.println(nv2.getTen() + " nhieu hon");
        } else {
            System.out.println("Hai nhan vien bang nhau");
        }

        sc.close();
    }
}