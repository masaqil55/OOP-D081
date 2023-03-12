package Object3D;

public class Balok {
    public int width, length, height;
    
    public Balok (int panjang, int lebar, int tinggi) {
        this.height = tinggi;
        this.length = panjang;
        this.width = lebar;
    }

    public void setPanjang (int panjang) {
        this.length = panjang;
    }

    public void setLebar (int lebar) {
        this.width = lebar;
    }

    public void setTinggi (int tinggi) {
        this.height = tinggi;
    }

    public float setVolume (int panjang, int lebar, int tinggi) {
        return this.length * this.width * this.height;
    }
}
