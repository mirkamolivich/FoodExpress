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
                            break;
                        case 3:
                            System.out.println("                ");
                            String removFoodName=scanner.nextLine();
                            foodManager.removeFoodByName(removFoodName);
                            System.out.println("                ");
                            break;
                        case 4:
                            System.out.println("                ");
                            String  searchName = scanner.nextLine();
                            foodManager.searchFoodByName(searchName);
                            break;
                        case 5:
                            foodManager.showAllFood();
                            break;
                        case 6:
                            back=true;
                            break;
                        default:
                            System.out.println("  commad is wronge ");
                    }
                }
            }
            else if (command==2) {
                boolean back = false;
                while(!back);
                System.out.println("");
                System.out.println("1-->    ");
                System.out.println("2-->      ");
                System.out.println("3-->       ");
                System.out.println("4-->        ");
                System.out.println("5-->         ");
                System.out.println("6-->          ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice){
                    case 1:
                        System.out.println("order food; ");
                        foodManager.showAllFood();
                        System.out.println("      ");
                        int choose = scanner.nextInt();
                        System.out.println("");
                        int quantitiy= scanner.nextInt();
                        for(int i=0;i<foodManager.foods.size();i++){
                       if (choose==foodManager.foods.get(i).id) {
                           double totalAmout = (foodManager.foods.get(i).priceOfFood * quantitiy);
                           MakeOrder makeOrder = new MakeOrder(foodManager.foods.get(i).nameOfFood,totalAmout);
                       }
                        }
                        break;
                    case 2:
                        System.out.println("         ");
                        String searchName = scanner.nextLine();
                        foodManager.searchFoodByName(searchName);
                        break;
                    case 3:
                        foodManager.orderList();
                        break;
                    case 4:
                        foodManager.showAllHistory();
                        break;
                    case 5:
                        back=true;
                                break;
                    default:
                        System.out.println("            ");
                }

            }
        }
    }
}