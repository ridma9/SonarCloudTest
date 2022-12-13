package org.example;

import java.util.List;

public class Colors {

    private String color;
    private List<String> code;

    public Colors() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getCode() {
        return code;
    }

    public void setCode(List<String> code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Colors{" +
                "color='" + color + '\'' +
                ", code=" + code +
                '}';
    }
}
