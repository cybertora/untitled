package FG_factory.FIXFactory;

import FG_factory.FGSizes.L_fg;
import FG_factory.FGSizes.M_fg;
import FG_factory.FGSizes.S_fg;

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
