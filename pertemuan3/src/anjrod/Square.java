/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anjrod;

/**
 *
 * @author aqil
 */
public class Square {
    public int PanjangSisi;

    public Square(int length) {
        this.PanjangSisi = length;
    }

    public double HitungKeliling() {
        return this.PanjangSisi * 4;
    }

    public double HitungLuas() {
        return this.PanjangSisi * this.PanjangSisi;
    }
}
