package com.putraaryotama.tugaskuliah.model;

import java.util.Date;

/**
 * Created by Putra Aryotama on 23/09/2017.
 */

public class Tugas {
    private int mataKuliah;
    private int deskripsi;
    private int gambar;
    private Date dueDate;

    public Tugas(int mataKuliah, int deskripsi, int gambar, Date dueDate) {
        this.mataKuliah = mataKuliah;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(int mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public int getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(int deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
