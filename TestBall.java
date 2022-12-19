package ru.mirea.pract1_2;
import java.lang.*;
public class Testball {
    public static void main(String [] args){
        ball b1 = new ball();
        System.out.println(b1);
        b1 = new ball (2,"Желтый");
        System.out.println(b1);
        System.out.println("Диаметр шара = " + b1.getDiametr());
    }
}
