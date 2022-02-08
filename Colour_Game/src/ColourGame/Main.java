package ColourGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    ArrayList<String> currentObjects = new ArrayList<>();
    HashMap<String, ArrayList<String>> itemsRelation = new HashMap<String,ArrayList<String>>();
    boolean wrongCommandFlag = false;

    public void findColouredObject(String colour){
         ArrayList<String> presentInlist = new ArrayList<>();

         for (HashMap.Entry<String,ArrayList<String>> entry : itemsRelation.entrySet()){

             String entryKey = entry.getKey();

            if(entryKey.equalsIgnoreCase(colour)) {
                presentInlist = entry.getValue();
                for (int i = 0; i < presentInlist.size(); i++) {
                    if(currentObjects.contains(presentInlist.get(i))){
                        String val = presentInlist.get(i);
                        Game Object = new Game(val);
                        Object.colour(colour);
                        return;
                    }
                } } else {
                System.out.println("Command wrong: Try Again");
                wrongCommandFlag = true;
                break;
            } } }

    public  void run_game(String command){
        if(command.charAt(0) == '+') {
            currentObjects.add(command.substring(1));
            System.out.println(command.substring(1) + " subscribed");
            return;
        }
        if(command.charAt(0) == '-') {
            currentObjects.remove(command.substring(1));
            System.out.println(command.substring(1) + " unsubscribed");
            return;
        }
        if(command.equalsIgnoreCase( "list")) {
            System.out.println(this.currentObjects);
            return;
        }
        else{
             findColouredObject(command);
             return;
        }
    }
        public static void main(String[] args) {

         Main main = new Main();
            main.itemsRelation.put("red",new ArrayList<String>(
                    Arrays.asList("book", "apple", "ink")));
            main.itemsRelation.put("blue",new ArrayList<String>(
                    Arrays.asList("sky", "frog")));
            main.itemsRelation.put("green",new ArrayList<String>(
                    Arrays.asList("banana", "apple")));
            main.itemsRelation.put("yellow",new ArrayList<String>(
                    Arrays.asList("banana", "frog")));
            main.itemsRelation.put("black",new ArrayList<String>(
                    Arrays.asList("sky", "ink")));
            main.itemsRelation.put("white",new ArrayList<String>(
                    Arrays.asList("salt")));


            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a command");
            System.out.println("For Subscribe = +ItemName");
            System.out.println("For Unsubscribe = -ItemName");
            System.out.println("For Listing Items = list");
            System.out.println("For Information = colourName");

            String command = sc.next();

            while(!command.equalsIgnoreCase( "exit")) {
                main.run_game(command);
                if(main.wrongCommandFlag)
                    break;
                command = sc.next();
            }


        }

    }

