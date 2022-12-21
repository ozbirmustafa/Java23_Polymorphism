package day23inheritancepolymorphism.animals;

public class Animal  {

     void eat(){
        System.out.println("Animals eat");
    }

    public int add (int a, int b){
         return a+b;
    }

    public Integer multiply(int a , int b){
         return a*b;
    }

    //"Overridden Method" olarak adlandırılır.
    public Animal create (){
         return new Animal();
    }

    // final methodlar override edilemezler
    public final double divide(int a, int b){
         return a/b;
    }






}
