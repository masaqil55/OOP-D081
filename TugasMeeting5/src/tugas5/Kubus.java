/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

public class Kubus {
    private int side;

    public Kubus(int sisi) {
        this.side = sisi;
    }

    public Kubus() {
        this(0);
    }

    public int volumeResult() {
        int volume = side * side * side;
        return volume;
    }

    public int getSide () {
        return side;
    }

    public void setSide (int sisi) {
        this.side = sisi;
    }
}
