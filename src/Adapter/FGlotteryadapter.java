package Adapter;

public class FGlotteryadapter implements ShortMessege{

    private Letter letter;

    public FGlotteryadapter(Letter letter) {
        this.letter = letter;
    }

    @Override
    public String getShortMessege() {
        return letter.getMessege().substring(0,7);
    }
}
