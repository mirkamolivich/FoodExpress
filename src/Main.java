import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodManager foodManager = new FoodManager();
        boolean exit = false;
        while (!exit) {
            System.out.println("=======FoodExpresss======= ");
            System.out.println("               ");
            System.out.println("            ");
            System.out.println("                ");
            System.out.println("                 ");
            int command = scanner.nextInt();
            scanner.nextLine();
            if (command == 1) {
                boolean back = false;
                while (!back) {
                    System.out.println("");
                    System.out.println("1-->    ");
                    System.out.println("2-->      ");
                    System.out.println("3-->       ");
                    System.out.println("4-->        ");
                    System.out.println("5-->         ");
                    System.out.println("6-->          ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("                ");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("            ");
                            String country = scanner.nextLine();
                            System.out.println("             ");
                            String name = scanner.nextLine();
                            System.out.println("                ");
                            double price = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("            ");
                            int quantity = scanner.nextInt();
                            scanner.nextLine();
                            Food food = new Food(id, country, name, price, quantity);
                            foodManager.addFood(food);
                            System.out.println("                ");
                            break;
                        case 2:
                            System.out.println("        ");
                            String nameUpdate = scanner.nextLine();
                            System.out.println("                ");
                            double priceUpdate = scanner.nextDouble();
                            Food food1 = new Food();
                            for (int i = 0; i < foodManager.foods.size(); i++) {
                                if (foodManager.foods.get(i).getNameOfFood().equals(nameUpdate)) {
                                    foodManager.foods.get(i).priceOfFood = priceUpdate;
                                }
                            }
                            System.out.println("                ");
                    }
                }
            }
        }
    }
}