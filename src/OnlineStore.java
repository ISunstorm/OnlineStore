
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class OnlineStore {
    public static ArrayList<Item> inventory;
    private static Scanner amonger = new Scanner(System.in);


    public static void loadInventory(){
        try{
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            inventory = (ArrayList<Item>)ois.readObject();
            System.out.println("Inventory: " + inventory.size() + " Items loaded");

        }catch(Exception e){
            System.out.println("No Inventory Found! New Inventory Created");
            inventory = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        loadInventory();
        int n = 1;
        while (n != 4){
            printMenu();
            int a = amonger.nextInt();
            amonger.nextLine();

            switch (a){
                case 1:

            }
        }
    }

    private static void printMenu(){
        int n = -1;
        while (n != 0) {
            System.out.println("1 - Add an Item");
            System.out.println("2 - Remove an Item");
            System.out.println("3 - Modify Inventory");
            System.out.println("0 - fun wittle button c:");
        }
    }


}
