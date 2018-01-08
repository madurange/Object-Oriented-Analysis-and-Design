/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 * Each object will represent a flight ticket assigned to a single passenger
 * @author pasindu
 */
public class Ticket {
    
    public static int ticketNumberCounter=0;
    
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int ticketNumber;

    /**
     * Create a ticket object according to given parameters
     * @param passenger Assigned Passenger for the ticket
     * @param flight Belonging flight
     * @param price Price of the Ticket
     */
    public Ticket(Passenger passenger, Flight flight, double price) {
        this.passenger = passenger;
        this.flight = flight;
        this.price = price;
        this.ticketNumber=++ticketNumberCounter;
    }
    
    /***
     * Returns the unique ticket number for the ticket
     * @return the unique ticket number
     */
    public int getTicketNumber() {
        return ticketNumber;
    }



    /**
     *
     * @param passenger Assigned Passenger for the ticket
     */
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     *
     * @param flight Belonging flight
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     *
     * @param price Price of the Ticket
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     *
     * @return Assigned Passenger for the ticket
     */
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     *
     * @return Belonging flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     *
     * @return Price of the Ticket
     */
    public double getPrice() {
        return price;
    }

    /***
     * Return the ticket details
     * @return String of the ticket details
     */
    @Override
    public String toString() {
        return getPassenger().getName()+", "+getFlight().toString()+", Ticket Price: $"+getPrice();
    }
    
    
    
    
    
}
