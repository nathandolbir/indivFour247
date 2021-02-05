/**
 * bike class that creates bike according to bike specifications
 * 
 * @author nathan
 */
public class Bike {
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPeddals;
    protected boolean hasTrainingWheels;

    /** creates bike by adding frame, wheels, and pedals */
    public void createBike() {
        createFrame();
        addWheels();
        addPedals();
    }

    /** adds frame according to bike type */
    private void createFrame() {
        System.out.println("Assembling " + name + " frame");
    }

    /**
     * adds wheels according to number of wheels and if there are training wheels
     */
    private void addWheels() {
        if (numWheels == 0)
            return;
        System.out.println("Adding " + numWheels + " wheel(s)");
        if (hasTrainingWheels)
            System.out.println("Adding training wheels");
    }

    /** adds pedals if there are pedals */
    private void addPedals() {
        if (hasPeddals)
            System.out.println("Adding pedals");
    }

    /**
     * 
     * @return price of bike
     */
    public double getPrice() {
        return price;
    }

}
