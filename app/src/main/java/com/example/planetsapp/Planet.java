package com.example.planetsapp;

public class Planet {
    private  String planetName;
    private  int planetImage;
    private String moons;

    public Planet(String planetName, int planetImage, String moons) {
        this.planetName = planetName;
        this.planetImage = planetImage;
        this.moons = moons;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }

    public String getMoons() {
        return moons;
    }

    public void setMoons(String moons) {
        this.moons = moons;
    }
}
