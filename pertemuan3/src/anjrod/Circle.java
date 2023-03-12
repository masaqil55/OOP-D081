/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anjrod;

/**
 *
 * @author aqil
 */
public class Circle {
    public int rad;

    public Circle(int rad) {
        this.rad = rad;
    }

    public double HitungLuas() {
        return 3.14 * this.rad * this.rad;
    }

    public double HitungKeliling() {
        return 2 * 3.14 * this.rad;
    }
}
