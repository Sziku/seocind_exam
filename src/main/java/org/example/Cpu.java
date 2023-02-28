package org.example;

public class Cpu extends Component{
    private int numOfCore;

    public Cpu(int price, int numOfCore) {
        super(price);
        this.numOfCore=numOfCore;
    }

    public int getNumOfCore() {
        return numOfCore;
    }
}
