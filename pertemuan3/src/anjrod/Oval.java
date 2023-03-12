/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anjrod;

/**
 *
 * @author aqil
 */
public class Oval {
    public int Mayor;
    public int Minor;

    public Oval(int major, int minor) {
        this.Mayor = major;
        this.Minor = minor;
    }

    public double HitungLuas() {
        return 3.14 * this.Mayor * this.Minor;
    }

    public double HitungKeliling() {
        return 3.14 * (this.Mayor + this.Minor);
    }
}
