package modifieres.laboratory14;

public class Papuga extends Animal{

    private int instanceNumber;
    public Papuga() {
        instanceNumber++;
    }

    public String getType(){
        return "To zwierze jest papugą";
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
}
