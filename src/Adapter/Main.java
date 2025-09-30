package Adapter;

public class Main {
    public static void main(String[] args) {
        Letter letter = new Letter("YOU WON A NEW FIXED GEAR!!!");
        FGlotteryadapter adapter = new FGlotteryadapter(letter);
        System.out.println(createTitle(adapter));
    }

    private static String createTitle(ShortMessege shortMessege){
        return "new messege: "  + shortMessege.getShortMessege();
    }
}
