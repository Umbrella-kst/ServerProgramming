package com.project.planirovchic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_profile")
public class User_profile {
    @Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String FIO;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }
}
