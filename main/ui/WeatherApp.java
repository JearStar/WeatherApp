package ui;

import JSON.JSONParser;
import model.*;

import java.io.IOException;
import java.util.Scanner;

public class WeatherApp {
    public static String API_KEY = "bdae2e3555fb4a1eadb153333212008";

    Forecast forecast;
    Location location;
    Weather weather;

    Scanner input;
    String city;
    String country;

    public WeatherApp() {
        input = new Scanner(System.in);
        boolean keepGoing = true;
        int choice;

        System.out.println("Enter City:");
        city = input.nextLine();

        System.out.println("Enter Country:");
        country = input.nextLine();

        while(keepGoing) {
            System.out.println("Would you like to view the:\n" +
                    "[1] Current weather report\n" +
                    "[2] Forecast\n" +
                    "[3] Location information\n" +
                    "[4] Change city\n" +
                    "[5] Quit");
            choice = input.nextInt();

            if (choice == 1) {
                displayCurrentWeather(city, country);
            } else if (choice == 2) {
                displayForecast(city, country);
            } else if (choice == 3) {
                displayLocation(city, country);
            } else if (choice == 4) {
                System.out.println("Enter City:");
                city = input.nextLine();

                System.out.println("Enter Country:");
                country = input.nextLine();
            } else if (choice == 5) {
                System.out.println("Goodbye!");
                keepGoing = false;
            }
        }

    }

    public void displayCurrentWeather(String city, String country) {
        try {
            weather = new Weather(JSONParser.readJsonFromUrl("http://api.weatherapi.com/v1/current.json?key=" +
                    API_KEY + "&q=" + city + "," + country + "&aqi=yes"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
        System.out.println("Feels like " + weather.getFeelslikeC());
        //TODO.... can add more

        System.out.println("\nEnter anything to continue\n");
        input.next();
    }

    public void displayForecast(String city, String country) {
        int days;

        System.out.println("How many days? (max 10)");
        days = input.nextInt();

        try {
            String urlForecast = "http://api.weatherapi.com/v1/forecast.json?key=" +
                    API_KEY + "&q=" + city + "," + country + "&days=" + days + "&aqi=yes&alerts=no";
            forecast = new Forecast(JSONParser.readJsonFromUrl(urlForecast));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
        //TODO.... method to view either forecast for the day or extended forecast

        System.out.println("\nEnter anything to continue\n");
        input.next();
    }

    public void displayLocation(String city, String country) {
        try {
            location = new Location(JSONParser.readJsonFromUrl("http://api.weatherapi.com/v1/current.json?key=" +
                    API_KEY + "&q=" + city + "," + country + "&aqi=yes"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n\n");
        System.out.println("City: " + location.getName());
        System.out.println("Country: " + location.getCountry());
        System.out.println("Local Time: " + location.getLocalTime());
        //TODO.... can add more

        System.out.println("\nEnter anything to continue\n");
        input.next();
    }

}
