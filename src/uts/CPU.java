/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author fachry
 */
public class CPU {

    protected String nama;
    protected int kecepatan;

    public CPU(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public CPU() {}

    public String getCPUData() {
        return nama+" "+kecepatan+" GHZ";
    }
}

class Intel extends CPU {

    public Intel(int kecepatan) {
        this.kecepatan = kecepatan;
        this.nama = "intel";
    }

}

class AMD extends CPU {

    public AMD(int kecepatan) {
        this.kecepatan = kecepatan;
        this.nama = "AMD";
    }
}
