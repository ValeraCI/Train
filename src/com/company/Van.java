package com.company;

public class Van {
    private final int numberOfSeats;
    private final int amountOfLuggage;

    private int numberOfUsedSeats;
    private int amountOfUsedLuggage;

    private final int comfortLevel;
    private final String name;

    Van(int numberOfSeats, int amountOfLuggage, int comfortLevel, String name){
        this.numberOfSeats = numberOfSeats;
        this.amountOfLuggage = amountOfLuggage;
        this.comfortLevel = comfortLevel;
        this.name = name;
    }

    public void using(){
        System.out.println("Введите количество посажиров, занявших вагон");
        do{
            numberOfUsedSeats = Main.intInput();
            if(numberOfUsedSeats < 0) System.out.println("Число пассажиров не может быть меньше нуля");
            else if (numberOfUsedSeats > numberOfSeats) System.out.println("Пассажири не влазят в вагон");
        }while(numberOfUsedSeats < 0 || numberOfUsedSeats > numberOfSeats);
        System.out.println("Введите количество единиц багажа");
        do{
            amountOfUsedLuggage = Main.intInput();
            if(amountOfUsedLuggage < 0) System.out.println("Количество багажа не может быть меньше нуля");
            else if (amountOfUsedLuggage > amountOfLuggage) System.out.println("Багаж не влазит");
        }while(amountOfUsedLuggage < 0 || amountOfUsedLuggage > amountOfLuggage);
    }

    public int getNumberOfUsedSeats() {
        return numberOfUsedSeats;
    }

    public int getAmountOfUsedLuggage() {
        return amountOfUsedLuggage;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getAmountOfLuggage() {
        return amountOfLuggage;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    public String getName() {
        return name;
    }
}
