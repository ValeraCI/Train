package com.company;

import java.util.Scanner;

public class Main {

    public static int intInput(){
        while (true){
            try {
                return new Scanner(System.in).nextInt();
            }
            catch (Exception e){
                System.out.println("Введите целое число");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("***Поезд***\n");
        System.out.println(new Reserved().toString() + "\n" + new Compartment().toString() + "\n" + new VIP().toString() +
                "\n" + new Baggage().toString());
        boolean work = true;
        Train train = new Train();
        while (work){
            train.seeTrain();
            System.out.println("\nКакой вагон хотите добавить?\n1.Плацкартный вагон\n2.Вагон купе\n3.VIP вагон\n4.Багажный вагон\n0.Завершить дабовление\n");
            switch(intInput()){
                case 1->{
                    Van van = new Reserved();
                    van.using();
                    train.addVan(van);
                    System.out.println("Добавление выполнено успешно");
                }
                case 2->{
                    Van van = new Compartment();
                    van.using();
                    train.addVan(van);
                    System.out.println("Добавление выполнено успешно");
                }
                case 3->{
                    Van van = new VIP();
                    van.using();
                    train.addVan(van);
                    System.out.println("Добавление выполнено успешно");
                }
                case 4->{
                    Van van = new Baggage();
                    van.using();
                    train.addVan(van);
                    System.out.println("Добавление выполнено успешно");
                }
                case 0 ->{
                    work = false;
                }
                default -> {
                    System.out.println("Неверный индекс");
                }
            }
        }
        System.out.println("Общая численность пасажиров: " + train.getPassengers() + "\nОбщая численность багажа: " +
                train.getLuggage());

        System.out.print("\nПосле сортировки по комфорту:");
        train.comfortSorting();
        train.seeTrain();
        int x;
        int y;
        do{
            System.out.println("\nУкажите диопазон, поиск по которому бедет осуществляться:");
            x = intInput();
            y = intInput();
            if(x > y || x < 0) System.out.println("Неверные значения, повторите ввод");
        }while(x > y || x < 0);
        train.searchByNumberOfPeople(x, y);
    }
}
