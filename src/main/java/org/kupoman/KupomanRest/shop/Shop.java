package org.kupoman.KupomanRest.shop;

import lombok.Data;

import java.io.Serializable;

@Data
public class Shop implements Serializable {

    private static final long serialVersionUID = 4887390123909407000L;
    private Long id;
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
