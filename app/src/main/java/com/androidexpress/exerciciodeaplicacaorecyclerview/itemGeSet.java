package com.androidexpress.exerciciodeaplicacaorecyclerview;

public class itemGeSet {

    private int id_contato;
    private int img_perfil;
    private boolean color_status;
    private String name;
    private String txt_msg;

    public itemGeSet(int id_contato, boolean color_status , int img_perfil, String name, String txt_msg) {
        this.id_contato = id_contato;
        this.img_perfil = img_perfil;
        this.color_status = color_status;
        this.name = name;
        this.txt_msg = txt_msg;
    }

    public int getId_contato() {
        return id_contato;
    }

    public void setId_contato(int id_contato) {
        this.id_contato = id_contato;
    }

    public int getImg_perfil() {
        return img_perfil;
    }

    public void setImg_perfil(int img_perfil) {
        this.img_perfil = img_perfil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTxt_msg() {
        return txt_msg;
    }

    public void setTxt_msg(String txt_msg) {
        this.txt_msg = txt_msg;
    }

    public boolean getColor_status() { return color_status; }

    public void setColor_status(boolean color_status) { this.color_status = color_status; }
}
