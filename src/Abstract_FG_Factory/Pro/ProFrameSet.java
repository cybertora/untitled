package Abstract_FG_Factory.Pro;

import Abstract_FG_Factory.Interface.FGFactory;
import Abstract_FG_Factory.Interface.Fork;
import Abstract_FG_Factory.Interface.Frame;

public class ProFrameSet implements FGFactory {

    public Frame getFrame(){
        return new ProFrame();
    }

    public Fork getFork(){
        return new ProFork();
    }

}
