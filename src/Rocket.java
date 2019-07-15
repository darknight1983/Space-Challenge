public class Rocket implements SpaceShip {

    private double weightLimit;
    private double currentWeight;



    public Boolean launch() {
        return true;
    }

    public Boolean land() {
        return true;
    }

    public void carry(Item item) {
        this.currentWeight += item.getWeight();
    }

    public Boolean canCarry(Item item) {
        if (this.currentWeight > this.weightLimit) {
            return true;
        }
        return false;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
}
