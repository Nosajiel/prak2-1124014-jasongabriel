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
        
    }
}