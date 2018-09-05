/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author WINDOWS 10
 */
public class Truck {
    //the Truck class has three fields(atribut)
    public int cadence;
    public int gear;
    public int speed;
        //the Truck class has one constructor
    public Truck (int startCadence, int startSpeed, int startGear)
    {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    //the Truck class has four method
    public void setCadence (int newValue)
    {
        cadence = newValue;
    } 
    public void setGear (int newValue)
    {
        gear = newValue;
    } 
    public void applybrake (int decrement)
    {
        speed = decrement;
    } 
    public void speedUp (int increment)
    {
        speed = increment;
    } 
}
