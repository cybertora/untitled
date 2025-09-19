package Abstract_FG_Factory;

public class BasicFrameSet implements FGFactory{

    public Frame getFrame(){
        return new BasicFrame();
    }

    public Fork getFork(){
        return new BasicFork();
    }

}
