package it.develhope.genericswildcars;


public class Tester{

    public static void main(String[] args){

        // generate 4 GenericsClass objects: 2 with T=Integer, 2 with T=String
        GenericsClass<Integer> firstElement  = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();
        GenericsClass<String>  thirdElement  = new GenericsClass<>();
        GenericsClass<String>  fourthElement = new GenericsClass<>();

        // assign values using the set methods
        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a String");
        fourthElement.setT("This is a String");

        // call the static method isEqual() to compare first vs second and third vs fourth elements
        System.out.println("Are these equals?: "+GenericsClass.isEqual(firstElement,secondElement));

        System.out.println("Are these equals?: "+GenericsClass.isEqual(thirdElement,fourthElement));
    }
}
