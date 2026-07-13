class MobilePhone {
    int phoneId;
    String brand;
    String model;
    double price;

    static String company = "Samsung";

    MobilePhone() {

    }

    MobilePhone(int phoneId, String brand, String model, double price) {
        this.phoneId = phoneId;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    MobilePhone(MobilePhone p) {
        this.phoneId = p.phoneId;
        this.brand = p.brand;
        this.model = p.model;
        this.price = p.price;
    }

    void displaydetails() {
        System.out.println("Mobile Phone Company:            " + company);
        System.out.println("Mobile Phone ID:                 " + phoneId);
        System.out.println("Mobile Phone Brand:              " + brand);
        System.out.println("Mobile Phone Model:              " + model);
        System.out.println("Mobile Phone Price:             $" + price);
        System.out.println("***************************************");
        System.out.println("***************************************");
    }

    void updatePrice(double amount) {
        price = price + amount;
    }

    static void showCompanyName() {
        System.out.println("Company of all Mobile Phones is: " + company);
        System.out.println();
    }
}

public class EXP_2_2 {
    public static void main(String[] args) {
        MobilePhone.showCompanyName();

        MobilePhone p1 = new MobilePhone();

        MobilePhone p2 = new MobilePhone(101, "Galaxy", "S25 Ultra", 129999);

        MobilePhone p3 = new MobilePhone(p2);

        p2.updatePrice(15000);

        System.out.println("-----MOBILE PHONE INVENTORY SYSTEM-----");

        System.out.println("**Mobile Phone 1 Details**");
        p1.displaydetails();

        System.out.println("**Mobile Phone 2 Details**");
        p2.displaydetails();

        System.out.println("**Mobile Phone 3 Details**");
        p3.displaydetails();

    }
}
