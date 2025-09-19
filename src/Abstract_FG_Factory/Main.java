package Abstract_FG_Factory;

public class Main {
    public static void main(String[] args) {
        ProFrameSet proFrameSet = new ProFrameSet();
        System.out.println(sprintSet(proFrameSet));

    }

    public static String sprintSet(FGFactory fgFactory){
        return "The set is " + fgFactory.getFrame().getName() + " and " +
                fgFactory.getFork().getName();
    }
}
