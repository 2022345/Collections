/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collections;

import java.util.ArrayList;

/**
 *
 * @author suele
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle[] rectangles = {new Rectangle (2, 3), new Rectangle (4, 1)};
        for (int rectangle = 0; rectangle < rectangles.length; rectangle ++){
            System.out.println(rectangles[rectangle].length);
            
        }
        
        for (Rectangle rectangle : rectangles){
            System.out.println(rectangles.width);
        }
        
        ArrayList<Integer> numList = new ArrayList <>();
        
        numList.add(5);
        numList.add(10);
        
        numList.add(0,3);
        numList.clear();
        numList.add(5);
        numList.contains(4);
        numList.set(0,10);
        numList.add(5);
        numList.set(0,7);
        numList.set(1,2);
        
        
        ArrayList<String> stringList = new ArrayList<>();
        
        stringList.add("Hello!");
        stringList.add("Hello!");
        stringList.add("World");
        
          stringList.set(0, "World");
          
          stringList.remove("World");
          
        //  while (stringList.contains("World")){
         //     stringList.remove("World");
        //  }
        
        stringList.remove(1);
    }
    
}
