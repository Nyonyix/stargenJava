package com.nyonyix;

import java.util.concurrent.ThreadLocalRandom;

public class Star
{
    private char spectral_class;
    private short temperature;
    private double radius;
    private double mass;
    private double luminosity;

    public Star()
    {
        this.spectral_class = 'E';
        this.temperature = generate_temperature();
        this.radius = 0;
        this.mass = 0;
        this.luminosity = 0;
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
