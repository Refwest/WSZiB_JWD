package modifieres.laboratory14;

public class Kot extends Animal {
    private int instanceNumber;
    public Kot() {
        instanceNumber++;
    }

    @Override
    public String getType() {
        return "To zwierze jest kotem";
    }

    @Override
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
