package writinghomeworkweek5;

import java.util.ArrayList;

/*
   Write a Java program to create a new array list, add some colours (String)
   and printout the collection using for each loop.
    */
public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("Yellow");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("ORANE");
        colorList.add("PURPLE");
        colorList.add("CLAY");

        for (String colourList : colorList){
            System.out.println(colourList + " , ");
        }
    }

}
