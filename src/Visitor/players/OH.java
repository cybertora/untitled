package Visitor.players;

import Visitor.interfaces.Visitor;
import Visitor.interfaces.VolleyballPlayer;

public class OH implements VolleyballPlayer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOH(this);
    }
}
