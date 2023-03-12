/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

public class Limas {
    private float panjangAlas;
    private float lebarAlas;
    private float tinggi;
    private float tinggiLimas;

    public Limas (float panjangAlas, float lebarAlas, float tinggi, float tinggiLimas) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggiLimas;
    }

    public Limas (float panjangAlas, float lebarAlas, float tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = lebarAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggi / 2;
    }

    public Limas (float panjangAlas, float tinggi) {
        this.panjangAlas = panjangAlas;
        this.lebarAlas = panjangAlas;
        this.tinggi = tinggi;
        this.tinggiLimas = tinggi / 2;
    }

    public float volumeResult () {
        float volume = (panjangAlas * lebarAlas * tinggi)/3;
        return volume;
    }

    public float getPanjangAlas () {
        return panjangAlas;
    }

    public void setPanjangAlas (float panjangAlas) {
        this.panjangAlas = panjangAlas;
    }

    public float getLebarAlas () {
        return lebarAlas;
    }

    public void setLebarAlas (float lebarAlas) {
        this.lebarAlas = lebarAlas;
    }

    public float getTinggi () {
        return tinggi;
    }

    public void setTinggi (float tinggi) {
        this.tinggi = tinggi;
    }

    public float getTinggiLimas () {
        return tinggiLimas;
    }

    public void setTinggiLimas (float tinggiLimas) {
        this.tinggiLimas = tinggiLimas;
    }
}
