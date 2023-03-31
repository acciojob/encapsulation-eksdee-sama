package com.driver;

class RWOnly {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameWriteOnly(String name) {
        this.name = name;
    }
}
