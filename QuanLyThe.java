import java.util.ArrayList;
import java.util.List;

public class QuanLyThe {
    private List<The> thes;

    public QuanLyThe() {
        this.thes = new ArrayList<The>();
    }

    public void addThe(The the) {
        this.thes.add(the);
    }

    public void removeThe(int id) {
        thes.removeIf(the -> the.getIdthe() == id);
    }

    public void showThe() {
        this.thes.forEach(the -> System.out.println(the.toString()));
    }
}
