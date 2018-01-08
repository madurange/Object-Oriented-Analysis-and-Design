/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab1;

/**
 * Each object will represent a Air Line
 * @author pasindu
 */
public class Manager {
    private static final int MAX=200;
    
    private final Flight[] ALLFlights=new Flight[MAX];
    private final Ticket[] ALLTickets=new Ticket[MAX];
    
    /**
     * Creating Flights. If there is a invalid flight, creation will be aborted.
     */
    public void createFlights(){
        try{
            //Same Origin and Destination
            ALLFlights[0]=new Flight(900, "Toronto", "Ottawa", "01/01/2018 6.00pm", 100, 2000);
            ALLFlights[1]=new Flight(901, "Toronto", "Ottawa", "01/02/2018 7.00pm", 90, 5000);
            ALLFlights[2]=new Flight(902, "Toronto", "Ottawa", "01/03/2018 8.00pm", 80, 6000);
            ALLFlights[3]=new Flight(903, "Toronto", "Ottawa", "01/04/2018 9.00pm", 70, 4500);
            
            //Random Flights
            ALLFlights[4]=new Flight(904, "Ottawa", "Vegas", "01/05/2018 6.00pm", 100, 2000);
            ALLFlights[5]=new Flight(905, "Ottawa", "Toronto", "01/06/2018 8.30pm", 100, 5000);
            ALLFlights[6]=new Flight(906, "Toronto", "New York", "01/07/2018 6.00pm", 100, 1500);
            ALLFlights[7]=new Flight(907, "Montreal", "Paris", "01/08/2018 9.30pm", 100, 500);
            ALLFlights[8]=new Flight(908, "Toronto", "Rome", "01/09/2018 7.00pm", 100, 6000);
            ALLFlights[9]=new Flight(909, "Toronto", "Chennai", "01/10/2018 3.00pm", 100, 2500);
            ALLFlights[10]=new Flight(910, "Toronto", "London", "01/11/2018 4.00pm", 100, 5500);
            ALLFlights[11]=new Flight(911, "Toronto", "Montreal", "01/12/2018 5.00pm", 100, 1500);
        }catch(Exception e){
            System.out.println("Construction of Flights Aborted: Due to Flights with"+e.getMessage());
            for(int i=0;i<MAX;i++){
                ALLFlights[i]=null;
            }
        }
        
    }
    
    /**
     * Displaying all the available flights from given Origin to given Destination
     * @param origin the origin Airport
     * @param destination the destination Airport
     */
    public void displayAvailableFlights(String origin, String destination){
        int i=0;
        Flight f=ALLFlights[i];
        while(f!=null){
            if(f.getOrigin().toUpperCase().equals(origin.toUpperCase()) && f.getDestination().toUpperCase().equals(destination.toUpperCase()) && f.getNumberOfSeatsLeft()>0){
                System.out.println(f.toString());
            }
            if(i==MAX-1) break;
            f=ALLFlights[++i];
        }
    }
    
    /**
     * Returns the flight object corresponding to the given flight number
     * @param flightNumber the number of the flight
     * @return flight object
     */
    public Flight getFlight(int flightNumber){
        int i=0;
        Flight f=ALLFlights[i];
        while(f!=null){
            if(f.getFlightNumber()==flightNumber){
                return f;
            }
            if(i==MAX-1) break;
            f=ALLFlights[++i];
        }
        return null;
    }
    
    /**
     * Book a seat to the given passenger if a seat is available in the given flight number 
     * @param flightNumber the number of the flight
     * @param p passenger who needs the booking
     */
    public void bookSeat(int flightNumber, Passenger p){
        boolean isBooked=false;
        Flight f=getFlight(flightNumber);
        if(f!=null){
            if(f.bookASeat()){
                ALLTickets[Ticket.ticketNumberCounter]=new Ticket(p, f, p.applyDiscount(f.getOriginalPrice()));
                isBooked=true;
            }
        }
        if(isBooked){
            System.out.println("Completed: A Seat Has Been Booked (Passenger Name: "+p.getName()+")");
        }else{
            System.out.println("Failed: Unable to Book a Seat");
        }
    }
    
    /***
     * Creating a Air Line, flights, passengers and booking tickets
     * @param args Executing Arguments
     */
    public static void main(String[] args) {
        
        //Creating a New Air Line Manager
        Manager AirCanada=new Manager();
        
        //Populating the arrayofFlights with 12 flights (First 4 flights are with Same Origin and Destination)
        AirCanada.createFlights();
        
        //Creating 5 passengers (3 Members & 2 NonMembers)
        Passenger M6=new Member(6, "M6", 20);
        Passenger M4=new Member(4, "M4", 25);
        Passenger M0=new Member(0, "M0", 25);
        Passenger NM80=new NonMember("NM80", 80);
        Passenger NM25=new NonMember("NM25", 25);
        
        //Setting the available number of seats to ZERO in one of the 4 flights (Flight number: 902) with same Origin and Destination
        AirCanada.ALLFlights[2].setNumberOfSeatsLeft(0);
        
        //Displaying all the available flights from Toronto to Ottawa
        System.out.println("-- AIR CANADA : Flights from Toronto to Ottawa --");
        AirCanada.displayAvailableFlights("Toronto", "Ottawa");
        
        //Booking seats for Members
        System.out.println("\n-- Booking Seats for Members --");
        AirCanada.bookSeat(901, M6);
        AirCanada.bookSeat(901, M4);
        AirCanada.bookSeat(901, M0);
        
        //Booking seats for NonMembers
        System.out.println("-- Booking Seats for NonMembers --");
        AirCanada.bookSeat(900, NM80);
        AirCanada.bookSeat(900, NM25);
        
        //Printing out All the booked tickets
        System.out.println("\n-- AIR CANADA : Booked Tickets--");
        int i=0;
        Ticket T=AirCanada.ALLTickets[i];
        while(T!=null){
            System.out.println(T.toString());
            if(i==MAX-1) break;
            T=AirCanada.ALLTickets[++i];
        }
        
        
    }
}
