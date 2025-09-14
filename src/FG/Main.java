package FG;

public class Main {
    public static void main(String[] args) {
        FG basic = new FG.Builder()
                .build();
        System.out.println(basic);

        FG custom = new FG.Builder()
                .bars("bullhorns")
                .frame("carbon")
                .system("intro7")
                .chain("izumi")
                .saddle("3t")
                .build();
        System.out.println(custom);
    }
}
