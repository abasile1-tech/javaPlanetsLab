package com.codebase;

public class Main {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 908973);
        System.out.printf("%s is %.2f", mars.getName(), mars.getSize());
        System.out.println(mars.explode());
    }
}