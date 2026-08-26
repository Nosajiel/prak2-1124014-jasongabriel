public class prak1_1124014_jasongabriel {
    static class Menu{
        string name;
        double price;
        string category;
        static int totalMenu;
        
        Menu (string name, double price, string category){
            this.name = name;
            this.price = price;
            this.category = category;
            totalMenu++;
        }
        void showMenu(){
            System.out.println("Name :" + name + "Price :" + price + "Category :" + category);
        }
        double discount(double percentage){
            return price * (1 - percentage /100);
        }
        double changePrice(double newPrice){
            this.price = newPrice;
        }
    }

    static class Order{
        string orderId;
        string customerName;
        Menu menu;
        int quantity;


        Order(string orderId, string customerName, Menu menu, int quantity){
            this.orderId = orderId;
            this.customerName = customerName;
            this.menu = menu;
            this.quantity = quantity;
        }

        int calculateTotal(){
            return menu.price * quantity;
        }

        void showOrder() {
            System.out.println("Order ID     : " + orderId);
            System.out.println("Customer     : " + customerName);
            System.out.println("Menu         : " + menu.name);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Total Payment: Rp" + calculateTotal());
        }
    }

    public static void main (String[] args){
        Menu.espresso = new Menu("Espresso", 20000, "Beverage");
        Menu.croissant = new Menu("Croissant", 25000, "Food");
        Menu.matcha = new Menu("Matcha", 22000, "Beverage");
        Menu.sandwich = new Menu("Sandwich", 30000, "Food");

        Menu[] menuList = {espresso, croissant, matcha, sandwich};
        System.out.println("=== CAFE MENU ===");
        for (Menu m : menuList){
            m.showMenu();
        }
        System.out.println();

        System.out.println("=== AFTER UPDATE ===");
        System.out.println();
    }
}