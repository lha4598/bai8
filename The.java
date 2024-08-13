import java.util.Scanner;

public class The {
    private SinhVien sinhVien;
    private int idthe;
    private int ngaymuon;
    private int ngaytra;
    private String sohieusach;

    public The() {

    }

    public The(SinhVien sinhVien, int idthe, int ngaymuon, int ngaytra, String sohieusach) {
        this.sinhVien = sinhVien;
        this.idthe = idthe;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.sohieusach = sohieusach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public int getIdthe() {
        return idthe;
    }

    public int getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(int ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public int getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(int ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(String sohieusach) {
        this.sohieusach = sohieusach;
    }

    @Override
    public String toString() {
        return "Thẻ số " + idthe + " " +
                sinhVien.toString() +
                ", ngaymuon=" + ngaymuon +
                ", ngaytra=" + ngaytra +
                ", sohieusach='" + sohieusach + '\'' +
                '}';
    }
}
