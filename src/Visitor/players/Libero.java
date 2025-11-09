package Visitor.players;

import Visitor.interfaces.Visitor;
import Visitor.interfaces.VolleyballPlayer;

public class Libero implements VolleyballPlayer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitLibero(this);
    }
}
