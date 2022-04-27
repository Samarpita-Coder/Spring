//pojo class
package com.sm.holiday;
import java.util.List;
public class Holiday {
    private String name;
    private float fare;
    private String city;
    private String country;
    private List<String> destination;
    public Holiday() {
        super();
    }
    public Holiday(String name, float fare, String city, String country, List<String> destination) {
        super();
        this.name = name;
        this.fare = fare;
        this.city = city;
        this.country = country;
        this.destination = destination;
    }
    public List<String> getDestination() {
        return destination;
    }
    public void setDestination(List<String> destination) {
        this.destination = destination;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getFare() {
        return fare;
    }
    public void setFare(float fare) {
        this.fare = fare;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void display() {
        System.out.printf("%s has paid a fare of %.2f\n", this.name,this.fare);
        System.out.printf("The holiday is in %s, %s\n", this.city,this.country);
        System.out.println("The places of visit are.....");
        for(String x : this.destination) {
            System.out.println(x);
        }
    }
}