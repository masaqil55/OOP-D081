/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

public class Tabung {
    private double jariJari;
    private double tinggi;

    public Tabung(double jari, double height) {
        this.jariJari = jari;
        this.tinggi = height;
    }

    public Tabung () {
        this(0.0, 0.0);
    }

    public Tabung (float jari) {
        this(jari, 0);
    }

    public double volumeResult () {
        double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
        return volume;
    }

    public double getjariJari () {
        return jariJari;
    }

    public void setJarijari (double jari) {
        this.jariJari = jari;
    }

    public double getTinggi () {
        return tinggi;
    }

    public void setTinggi (double height) {
        this.tinggi = height;
    }
}
