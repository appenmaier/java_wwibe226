package main;

import java.time.LocalDate;

import model.Flight;
import model.FlightConnection;

/**
 * Demo 17: Demonstrates class attributes by creating {@link model.Flight} and
 * {@link model.FlightConnection} objects and printing their data.
 */
public class D17_Attributes {

   public static void main(String[] args) {
      Flight[] flights = new Flight[2];

      FlightConnection flightConnection = new FlightConnection();
      flightConnection.airline = "Lufthansa";
      flightConnection.connectionId = "0400";
      flightConnection.departureAirport = "Frankfurt Airport";
      flightConnection.arrivalAirport = "JFK International";

      Flight flight1 = new Flight();
      flight1.flightConnection = flightConnection;
      flight1.flightDate = LocalDate.of(2026, 11, 5);
      flight1.flightPriceInEuro = 499.99;

      Flight flight2 = new Flight();
      flight2.flightConnection = flightConnection;
      flight2.flightDate = LocalDate.of(2027, 5, 23);
      flight2.flightPriceInEuro = 199.99;

      flights[0] = flight1;
      flights[1] = flight2;

      for (int i = 0; i < flights.length; i++) {
         Flight flight = flights[i];
         System.out.println(flight.flightDate);
      }
   }

}
