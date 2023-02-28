package org.example;

public class Ram extends Component{
   private String memoryType;

    public Ram(int price, String memoryType) {
        super(price);
        this.memoryType=memoryType;
    }

    public String getMemoryType() {
        return memoryType;
    }
}
