import java.util.ArrayList;

class Order {
    private String name;
    private boolean isReady;
    private ArrayList<Item> items;

    // Constructors
    public Order(){
        this.name = "Guest";
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    public Order(String name){
        this.name = name;
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setIsReady(boolean isReady){
        this.isReady = isReady;
    }
    public void setItems(Item item){
        items.add(item);
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public boolean getIsReady(){
        return this.isReady;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }

    // Methods
    public void addItem(Item item){
        items.add(item);
    }
    public String getStatusMessage(){
        if(isReady == true){
            return "Your order is ready";
        }else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item item: items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.printf("Customer Name: %s %n", this.name);
        for(Item item: items){
            System.out.println(item.getName() + " - " + item.getPrice());
        }
        System.out.printf("Total: $%.2f%n", getOrderTotal());
    }
}