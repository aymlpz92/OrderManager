public class Exercice {

    public void process(String cType, double amt, int i, boolean flag) {
        if (amt > 0) {
            if (i > 0) {
                double d = 0.0;

                if (cType.equals("VIP")) {
                    if (amt > 1000) {
                        d = amt * 0.20;
                    } else {
                        d = amt * 0.10;
                    }
                } else if (cType.equals("NORMAL")) {
                    if (amt > 1000) {
                        d = amt * 0.05;
                    } else {
                        d = 0.0;
                    }
                } else if (cType.equals("NEW")) {
                    d = amt * 0.15;
                }

                double total = amt - d;

                double t = 0.0;
                if (flag == true) {
                    t = total * 0.20;
                    total = total + t;
                    System.out.println("Shipping international. Tax: " + t);
                } else {
                    t = total * 0.20;
                    total = total + t;
                    System.out.println("Shipping international. Tax: " + t);
                }

                System.out.println("Connecting to database jdbc:mysql://localhost:3306/shop...");
                System.out.println("INSERT INTO orders (total, type) VALUES (" + total + ", '" + cType + "')");
                System.out.println("Sending email to customer...");
            } else {
                System.out.println("Error: No items");
            }
        } else {
            System.out.println("Error: Amount is zero or less");
        }
    }
}