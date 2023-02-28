package org.example;

public class Motherboard extends Component{
    String chipset;

    public Motherboard(int price, String chipset) {
        super(price);
        this.chipset=chipset;
    }

    public String getChipset() {
        return chipset;
    }
}
