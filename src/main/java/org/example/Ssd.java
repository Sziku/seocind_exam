package org.example;

public class Ssd extends Component{
    private int capacityInGb;

    public Ssd(int price, int capacityInGb) {
        super(price);
        this.capacityInGb=capacityInGb;
    }


    public int getCapacityInGb() {
        return capacityInGb;
    }
}
