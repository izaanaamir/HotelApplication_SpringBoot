package com.example.lmdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    private String hotelName;
    private int numOfNights;
    private double pricePerNights;
    private double totalPrice;

    public Bookings() {
    }

    public Bookings(String hotelName, int numOfNights, double pricePerNights) {
        this.hotelName = hotelName;
        this.numOfNights = numOfNights;
        this.pricePerNights = pricePerNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getId() {
        return id;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public double getPricePerNights() {
        return pricePerNights;
    }

    public void setPricePerNights(double pricePerNights) {
        this.pricePerNights = pricePerNights;
    }
    public double getTotalPrice(){
        totalPrice = pricePerNights*numOfNights;
        return totalPrice;
    }

}
