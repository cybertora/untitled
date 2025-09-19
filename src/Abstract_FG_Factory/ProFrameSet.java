package Abstract_FG_Factory;

public class ProFrameSet implements FGFactory {

    public Frame getFrame(){
        return new ProFrame();
    }

    public Fork getFork(){
        return new ProFork();
    }

}
