package Ducat.ducat.Associations;

//Association is a type of relationship between two classes where one class uses the properties and methods of another class.

//There are two types of association: Aggregation and Composition.
//Aggregation is a weak association where one class uses the properties and methods of another class but does not own it.
//Composition is a strong association where one class uses the properties and methods of another class and owns it.

// Independent class
class SIMCard {
    private String number;
    private String provider;

    public SIMCard(String number, String provider) {
        this.number = number;
        this.provider = provider;
    }

    public String getNumber() {
        return number;
    }

    public String getProvider() {
        return provider;
    }

}

class Mobile {
    private String model;
    private SIMCard simCard; // Aggregation (HAS-A). parent class is using the properties of SIMCard class

    public Mobile(String model, SIMCard simCard) {
        this.model = model;
        this.simCard = simCard;
    }

    public String getModel() {
        return model;
    }

    public void displayDetails() {
        System.out.println("Mobile Model: " + getModel());
        System.out.println("SIM Card Number: " + simCard.getNumber());
        System.out.println("SIM Card Provider: " + simCard.getProvider());
    }

}

public class AggregationDemo {
    public static void main(String[] args) {
        // 1. Create SIMCard independently
        SIMCard mysim = new SIMCard("1234567890", "Airtel");

        // 2. Pass SIMCard to Mobile
        Mobile mymobile = new Mobile("iPhone 16 pro", mysim);
        mymobile.displayDetails();

        // 3. Destroy the Mobile object
        mymobile = null;

        // 4. SIMCard still exists in memory!
        System.out.println("\nAfter destroying Mobile object:");
        System.out.println("Mobile model: " + mymobile);
        System.out.println("SIM Card Number: " + mysim.getNumber());
        System.out.println("SIM Card Provider: " + mysim.getProvider());

    }
}
