package com.macitepos.macitepos.model;

import javax.persistence.*;

@Entity
public class Suplier {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id_suplier;
    private Character nama_suplier;
    private Character alamat_suplier;

    @Version
    @Column(name="opt_version", columnDefinition = "integer DEFAULT 0")
    private Integer version;

    public Integer getId_suplier() {
        return id_suplier;
    }

    public void setId_suplier(Integer id_suplier) {
        this.id_suplier = id_suplier;
    }

    public Character getNama_suplier() {
        return nama_suplier;
    }

    public void setNama_suplier(Character nama_suplier) {
        this.nama_suplier = nama_suplier;
    }

    public Character getAlamat_suplier() {
        return alamat_suplier;
    }

    public void setAlamat_suplier(Character alamat_suplier) {
        this.alamat_suplier = alamat_suplier;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
