package Models;

public class Common {

    public Common(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }
    

    private int iD;
    private String name;

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Common{" + "iD=" + iD + ", name=" + name + '}';
    }
    
}
