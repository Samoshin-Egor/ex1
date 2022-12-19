package ru.mirea.pract1_2;
import java.lang.*;
public class ball {
    private int Radius;
    private String Color;
    public ball(int Radius, String Color){
        this.Radius = Radius;
        this.Color = Color;
    }
    public ball ( int Radius ){
        this.Radius = Radius;
        this.Color = " Зеленый ";
    }
    public ball (String Color ){
        this.Radius = 1;
        this.Color = Color;
    }
    public ball(){
        this.Radius = 1;
        this.Color = " Зеленый ";
    }
    public int getRadius(){
        return Radius;
    }
    public void setRadius( int Radius){
        this.Radius = Radius;
    }
    public String getColor(){
        return Color;
    }
    public void setColor(String Color){
        this.Color = Color;
    }
    public String toString(){
        return "ball{" + "Radius=" + Radius + ", color= " + Color + '\'' + '}';
    }
    public int getDiametr(){
        return 2*Radius;
    }
}
