/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

public class Beam {
    private float length;
    private float width;
    private float height;

    public Beam(float panjang, float lebar, float tinggi) {
        this.length = panjang;
        this.width = lebar;
        this.height = tinggi;
    }

    public Beam() {
        this(0, 0, 0);
    }

    public Beam (float panjang, float lebar) {
        this(panjang, lebar, 0);
    }

    public float volumeResult () {
        float volume = length * width * height;
        return volume;
    }

    public float getLength() {
        return length;
    }

    public void setlength(float panjang) {
        this.length = panjang;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float lebar) {
        this.width = lebar;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float tinggi) {
        this.height = tinggi;
    }
}
