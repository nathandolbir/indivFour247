/**
 * bikestore that creates and orders bikes
 * 
 * @author nathan
 */
public class BikeStore {
    /**
     * orders bike by creating it according to bike type
     * 
     * @param type of bike
     * @return the bike
     */
    public Bike orderBike(String type) {
        return createBike(type);
    }

    /**
     * creates a bike according to type of bike
     * 
     * @param type of biike
     * @return the bike
     */
    private Bike createBike(String type) {
        if (type.equals("tricycle")) {
            Tricycle t = new Tricycle();
            t.createBike();
            System.out.println("Price: " + t.getPrice());
            return t;
        } else if (type.equals("strider")) {
            Strider s = new Strider();
            s.createBike();
            System.out.println("Price: " + s.getPrice());
            return s;
        } else {
            KidsBike k = new KidsBike();
            k.createBike();
            System.out.println("Price: $" + k.getPrice());
            return k;
        }
    }
}