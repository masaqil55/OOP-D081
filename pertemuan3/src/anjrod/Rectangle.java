/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anjrod;

/**
 *
 * @author aqil
 */
public class Rectangle {
    public int height;
    public int width;

    public Rectangle(int panjang, int lebar) {
        this.height = panjang;
        this.width = lebar;
    }

    public double HitungLuas() {
        return this.width * this.height;
    }

    public double HitungKeliling() {
        return 2 * (this.height + this.width);
    }
}
