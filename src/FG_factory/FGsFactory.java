package FG_factory;

public class FGsFactory {
    public FGs selectionFG(int height){
        if (height > 150 && height < 162){
            return new S_fg();
        }
        else if (height > 162 && height < 173){
            return new M_fg();
        }
        else {
            return new L_fg();
        }

    }
}
