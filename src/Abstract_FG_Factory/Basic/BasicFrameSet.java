package Abstract_FG_Factory.Basic;

import Abstract_FG_Factory.Interface.FGFactory;
import Abstract_FG_Factory.Interface.Fork;
import Abstract_FG_Factory.Interface.Frame;

public class BasicFrameSet implements FGFactory {

    public Frame getFrame(){
        return new BasicFrame();
    }

    public Fork getFork(){
        return new BasicFork();
    }

}
