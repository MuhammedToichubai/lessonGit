package com.company;



public class Truck {
    private int id;
    private String name;
    private String driver;
    private State state;

    public Truck() {
    }

    public Truck(int id, String name, String driver, State state) {
        this.id = id;
        this.name = name;
        this.driver = driver;
        this.state = state;
    }

    public static Truck makeCar(int id,String name, String driver, State state){
        Truck car = new Truck();
        car.id = id;
        car.name = name;
        car.driver = driver;
        car.state = state;
        return car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }



    @Override
    public java.lang.String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", driver=" + driver +
                ", state=" + state +
                '}';
    }
}
