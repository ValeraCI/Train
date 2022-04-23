package com.company;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private int passengers = 0;
    private int luggage = 0;
    private List<Van> vanList = new ArrayList();


    public void addVan(Van van){
        vanList.add(van);
        passengers += van.getNumberOfUsedSeats();
        luggage += van.getAmountOfUsedLuggage();
    }

    public int getPassengers() {
        return passengers;
    }

    public int getLuggage() {
        return luggage;
    }

    public Van getThisVan(int index){
        return vanList.get(index);
    }

    public void setThisVan(int index, Van van){
        vanList.set(index, van);
    }

    public List<Van> getVanList() {
        return vanList;
    }
    public int trainSize(){
        return  vanList.size();
    }

    public void seeTrain(){
        System.out.print("\nПоезд имеет вид: \n(Головной вагон)");
        for(int i = 0; i < trainSize(); i++){
            System.out.print("-(" + getThisVan(i).getName() + ")");
        }
    }
    public void comfortSorting(){
        Van buffer;
        for(int i = 0; i < trainSize(); i++){
            for(int j = 1; j < trainSize(); j++){
                if(getThisVan(j-1).getComfortLevel() < getThisVan(j).getComfortLevel()){
                    buffer = getThisVan(j);
                    setThisVan(j, getThisVan(j-1));
                    setThisVan(j-1,  buffer);
                }
            }
        }
    }

    public void searchByNumberOfPeople(int x, int y){
        int num = 0;
        for(int i = 0; i < trainSize(); i++){
            if(getThisVan(i).getNumberOfUsedSeats() >= x && getThisVan(i).getNumberOfUsedSeats() <= y){
                System.out.println("Вагон номер " + (i+1));
                num++;
            }
        }
        if (num == 0) System.out.println("Вагоны с таким диапозоном отсутствуют");
    }
}
