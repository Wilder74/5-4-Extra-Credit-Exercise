public static void main(String[] args) {

    String custName = "Alex";
    String itemDesc = "Shirt";
    String message = custName + " wants to purchase a " + itemDesc;

    int quantity = 2;
    double price = 20.0;
    double total;

    boolean outOfStock = false;

    // If quantity > 1 = plural
    if (quantity > 1) {
        message = custName + " wants to purchase " + quantity + " " + itemDesc + "s";
    }

    // If item is out of stock
    if (outOfStock) {
        System.out.println("Sorry, this item is currently unavailable.");
    } else {
        total = quantity * price;
        System.out.println(message);
        System.out.println("Total cost: $" + total);
    }
}
