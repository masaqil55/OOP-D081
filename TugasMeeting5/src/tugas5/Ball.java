
package tugas5;

public class Ball {
    private double jari_jari;

    public Ball (double Jarijari) {
        this.jari_jari = Jarijari;
    }

    public Ball () {
        this (0.0);
    }

    public double volumeResult () {
        double volume = (4.0/3.0) * Math.PI * Math.pow(jari_jari, 3);
        return volume;
    }

    public double getjariJari() {
        return jari_jari;
    }

    public void setJarijari (double Jarijari) {
        this.jari_jari = Jarijari;
    }
}
