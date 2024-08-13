public class SinhVien {
    private String ten;
    private int tuoi;
    private String lop;

    public SinhVien() {

    }

    public SinhVien(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "Tên SV='" + ten + '\'' +
                ", Tuối=" + tuoi +
                ", Lớp='" + lop + '\'' ;
    }
}
