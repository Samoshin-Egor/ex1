package ru.mirea.pract1_3;
import java.lang.*;
public class book {
    private String Author, Name;
    private int publishYear;
   public book(String Author, String Name, int publishYear){
   this.Author = Author;
   this.Name = Name;
   this.publishYear = publishYear;
   }
   public book(String Author){
      this.Author = Author;
      this.Name = "Три мушкетера";
      this.publishYear = 1844;
   }
   public book( int publishYear){
      this.Author = "Александр Дюма";
      this.Name = " Три мушкетера";
      this.publishYear = publishYear;
   }
    public String getAuthor(){ return Author; }
    public void setAuthor(){ this.Author = Author; }
    public String getName(){ return Name; }
    public void setName(){ this.Name = Name; }
    public int getPublishYear(){ return publishYear; }
    public void setPublishYear(){   this.publishYear = publishYear;}
    public String toString(){return "book{" + "Author = " + Author + ", Name = " + Name + ", publishYear = " + publishYear + '/'; }}
