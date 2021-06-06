package com.eldev.alphanotes;

/**
 Nama               : Lana Septiana
 NIM                : 10118416
 Kelas              : IF10
 Tanggal Pengerjaan : 4 Jun 2021
 **/

public class Model {

    String title;
    String description;
    String id;

    public Model(String id, String title, String description) {
        this.title = title;
        this.description = description;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
