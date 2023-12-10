package modifieres.laboratory14;

public class Pies extends Animal {
    private int instanceNumber;
    public Pies() {
        instanceNumber++;
    }

    public String getType(){
        return "To zwierze jest psem";
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
}
