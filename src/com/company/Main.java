package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();
    public static final Path PATH =  Path.of("./trucks");
    public static final Path PATH2 =  Path.of("./DriverTrucks");

    public static void main(java.lang.String[] args)  {
        Truck truck1 = new Truck(1,"Lexus","",State.BASE);
        Truck truck2 = new Truck(2,"Toyota","",State.BASE);
        Truck truck3 = new Truck(3,"Mercedes-Benz","",State.BASE);

        Truck[] trucks = {truck1,truck2,truck3};

        Driver driver1 = new Driver(1,"Sadyr","");
        Driver driver2 = new Driver(2,"Baiden","");
        Driver driver3 = new Driver(3,"Szinpin","");

        Driver[] drivers = {driver1,driver2, driver3};


        String json = GSON.toJson(trucks);
        String json2 = GSON.toJson(drivers);
        System.out.println(json);
        write(json);
        writerDriver(json2);




    }
    public static void write(String obj)  {
        try {
            Path write = Path.of(java.lang.String.valueOf(PATH));
            Files.writeString(write,obj, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void writerDriver(String obj) {
        try {
            Path write = Path.of(java.lang.String.valueOf(PATH2));
            Files.writeString(write, obj, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
