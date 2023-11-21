package CodeWars;

public class Bob {
    public static void main(String[] args) {
        System.out.println(enough(20, 15, 10));
        System.out.println(enough2(20, 15, 10));
    }

    public static int enough(int cap, int on, int wait) {
        return ((cap - on) >= wait) ? 0 : (-1 * (cap - on - wait));
    }
    public static int enough2(int cap, int on, int wait) {
        return ((cap - on) >= wait) ? 0 : (Math.abs(cap - on - wait));
    }
}
