package oop.Animals;

public class Animal {
    private String name;
    private int age;

     public Animal(){
        this.name = "unknown"; // to jest kontruktor
        this.age = 0;
    }
    public Animal(String name){ // konstruktor
         this.name= name;
         this.age = 0;
    }
    public Animal(String name, int age){ // konstruktor
         this.name = name;
         this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void printInfo(){
        System.out.println("To jest zwierze o nazwie  " + this.name + ". A jego wiek to " + this.age);
    }

    @Override
    public String toString(){
         return "Animal | name=" +this.name + "| age=" + this.age; // konwertuje bazowa metode - służy najczęściej do prostego formatowania danych
    }

    public void useVoice() {
        System.out.println("Każde zwierze wydaje jakiś głos");
     }
}
