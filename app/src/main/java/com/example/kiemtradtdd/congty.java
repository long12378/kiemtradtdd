package com.example.kiemtradtdd;

public class congty {
    int anh; String ten, chuthich, tich;

    public congty(int anh, String ten, String chuthich, String tich) {
        this.anh = anh;
        this.ten = ten;
        this.chuthich = chuthich;
        this.tich = tich;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getChuthich() {
        return chuthich;
    }

    public void setChuthich(String chuthich) {
        this.chuthich = chuthich;
    }

    public String getTich() {
        return tich;
    }

    public void setTich(String tich) {
        this.tich = tich;
    }
}
