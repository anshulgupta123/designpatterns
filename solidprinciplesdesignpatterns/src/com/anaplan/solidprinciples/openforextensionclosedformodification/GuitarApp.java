package com.anaplan.solidprinciples.openforextensionclosedformodification;

import java.util.ArrayList;
import java.util.List;

public class GuitarApp {

    public static void main(String[] args) {
        List<Guitar> guitarList= new ArrayList<>();
        SuperCoolGuitarWithFlames superCoolGuitarWithFlames= new SuperCoolGuitarWithFlames();
        superCoolGuitarWithFlames.setFlameColor("Dark Coffe");
        superCoolGuitarWithFlames.setMake("ak");
        superCoolGuitarWithFlames.setModel("2023");
        superCoolGuitarWithFlames.setVolume(12);
        guitarList.add(superCoolGuitarWithFlames);
        SuperCoolGuitarWithFlames superCoolGuitarWithFlames1= new SuperCoolGuitarWithFlames();
        superCoolGuitarWithFlames.setFlameColor("yellow");
        superCoolGuitarWithFlames.setMake("ak1");
        superCoolGuitarWithFlames.setModel("2023");
        superCoolGuitarWithFlames.setVolume(15);
        guitarList.add(superCoolGuitarWithFlames1);
        guitarList.stream().forEach(System.out::println);

    }
}
