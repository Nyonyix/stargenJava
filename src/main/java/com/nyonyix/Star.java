package com.nyonyix;

import java.util.concurrent.ThreadLocalRandom;

public class Star
{
    private char spectral_class;
    private short temperature;
    private String luminosity_class;
    private double radius;
    private double mass;
    private double luminosity;

    public Star()
    {
        this.spectral_class = generate_spectral_class();
        this.temperature = generate_temperature();
        this.luminosity_class = "X";
        this.radius = 0;
        this.mass = 0;
        this.luminosity = 0;
    }

    private char generate_spectral_class()
    {
        return 'E';
    }

    private short generate_temperature()
    {
        return (short)ThreadLocalRandom.current().nextInt(2000, 32001);
    }

    public char getSpectral_class()
    {
        return spectral_class;
    }

    public void setSpectral_class(char spectral_class)
    {
        this.spectral_class = spectral_class;
    }

    public String getLuminosity_class()
    {
        return luminosity_class;
    }

    public void setLuminosity_class(String luminosity_class)
    {
        this.luminosity_class = luminosity_class;
    }

    public short getTemperature()
    {
        return temperature;
    }

    public void setTemperature(short temperature)
    {
        this.temperature = temperature;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getMass()
    {
        return mass;
    }

    public void setMass(double mass)
    {
        this.mass = mass;
    }

    public double getLuminosity()
    {
        return luminosity;
    }

    public void setLuminosity(double luminosity)
    {
        this.luminosity = luminosity;
    }

}
