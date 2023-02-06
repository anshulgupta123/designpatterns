package com.anaplan.solidprinciples.openforextensionclosedformodification;

public class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }

    @Override
    public String toString() {
        return "SuperCoolGuitarWithFlames{" +
                "flameColor='" + flameColor + '\'' +
                '}';
    }
}