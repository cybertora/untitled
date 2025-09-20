package Abstract_FG_Factory;

import Abstract_FG_Factory.Interface.FGFactory;
import Abstract_FG_Factory.Pro.ProFrameSet;

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
