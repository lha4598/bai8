import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyThe quanLyThe = new QuanLyThe();
        while (true) {
            System.out.println("--------MENU--------");
            System.out.println("1. Thêm thẻ");
            System.out.println("2. Xóa thẻ theo id thẻ");
            System.out.println("3. Hiển thị thông tin thẻ");
            System.out.println("4. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập tên SV");
                    String ten = sc.nextLine();
                    System.out.println("Nhập tuổi SV");
                    int tuoi = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập lớp");
                    String lop = sc.nextLine();
                    SinhVien sinhVien = new SinhVien(ten, tuoi, lop);
                    System.out.println("Nhập id thẻ: ");
                    int idthe = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập ngày mượn: ");
                    int ngaymuon = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập ngày trả: ");
                    int ngaytra = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập mã sách: ");
                    String sohieusach = sc.nextLine();
                    The the = new The(sinhVien, idthe, ngaymuon, ngaytra, sohieusach);
                    quanLyThe.addThe(the);
                    break;

                }
                case 2: {
                    System.out.println("Nhập id thẻ cần xóa");
                    int id = sc.nextInt();
                    sc.nextLine();
                    quanLyThe.removeThe(id);
                    break;
                }
                case 3: {
                    quanLyThe.showThe();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}