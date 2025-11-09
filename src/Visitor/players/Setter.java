package Visitor.players;

import Visitor.interfaces.Visitor;
import Visitor.interfaces.VolleyballPlayer;

public class Setter implements VolleyballPlayer {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSetter(this);
    }
}
