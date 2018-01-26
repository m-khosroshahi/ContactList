package com.example.milad.contactlist.Model;


import android.widget.ImageView;
import android.widget.TextView;

public class ContactModel {

    private String imag = "";
    private String name = "";
    private String number = "";

    public ContactModel(String imag, String name, String number) {
        this.imag = imag;
        this.name = name;
        this.number = number;
    }

    public String getImag() {
        return imag;
    }

    public void setImag(String imag) {
        this.imag = imag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
