package Visitor.players;

import Visitor.interfaces.Visitor;
import Visitor.interfaces.VolleyballPlayer;

public class MB implements VolleyballPlayer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitMB(this);
    }
}
