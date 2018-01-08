/***
 * This package includes all the source code files for flight booking system
 */
package coe528.lab1;


/**
 * Each object will represent a flight
 * @author Pasindu Gusthinna Wadu - 500707381
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;

    /**
     * Create a flight object accordingly to given parameters
     * @param flightNumber Flight Number
     * @param origin Origin Airport
     * @param destination Destination Airport
     * @param departureTime Departure Date and Time
     * @param capacity Capacity of Total Passengers
     * @param originalPrice Original Price of tickets for the flight
     */
    public Flight (int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        if((origin.toUpperCase()).equals(destination.toUpperCase()))
            throw new IllegalArgumentException("Origin & Destination are the Same");
        if(origin==null)
            throw new NullPointerException("No Origin Entered");
        if(destination==null)
            throw new NullPointerException("No Destination Entered");

        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.capacity = capacity;
        this.originalPrice = originalPrice;
        this.numberOfSeatsLeft=capacity;
    }

    /**
     * Set the Flight Number
     * @param flightNumber Flight Number
     */
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * Set the Origin Airport
     * @param origin Origin Airport
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Set the Destination Airport
     * @param destination Destination Airport
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Set the Departure Date and Time
     * @param departureTime Departure Date and Time
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * Set the total Number of passengers
     * @param capacity the total Number of passengers
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Set the number of seats left in the flight
     * @param numberOfSeatsLeft the number of seats left in the flight
     */
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft) {
        this.numberOfSeatsLeft = numberOfSeatsLeft;
    }

    /**
     * Set the original price of a ticket for the flight
     * @param originalPrice the original price of a ticket for the flight
     */
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * Returns the Flight Number
     * @return the Flight Number
     */
    public int getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Returns the origin Airport of the flight
     * @return the origin Airport of the flight
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Returns the Number of seats left in the flight
     * @return the Number of seats left in the flight
     */
    public int getNumberOfSeatsLeft() {
        return numberOfSeatsLeft;
    }

    /**
     * Returns the Destination Airport
     * @return the Destination Airport
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Returns the Departure Date and Time
     * @return the Departure Date and Time
     */
    public String getDepartureTime() {
        return this.departureTime;
    }

    /**
     * Returns the Capacity of total passengers
     * @return the Capacity of total passengers
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Return the original price of a ticket
     * @return the original price of a ticket
     */
    public double getOriginalPrice() {
        return this.originalPrice;
    }
    
    /***
     * Return the flight details
     * @return String of the flight details
     */
    @Override
    public String toString() {
        return "Flight "+getFlightNumber()+", "+getOrigin()+" to "+getDestination()+", "+getDepartureTime()+", "+"Original Price: $"+getOriginalPrice();
    }
    
    /**
     * Returns true after booking a seat if available otherwise returns false
     * @return True if a seat is available otherwise false
     */
    public boolean bookASeat(){
        if(getNumberOfSeatsLeft()>0){
            this.numberOfSeatsLeft--;
            return true;
        }else{
            return false;
        }
        
    }
    
    
 
}
