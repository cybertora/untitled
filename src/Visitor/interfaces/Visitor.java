package Visitor.interfaces;

import Visitor.players.Libero;
import Visitor.players.MB;
import Visitor.players.OH;
import Visitor.players.Setter;

public interface Visitor {
    public void visitOH(OH oh);
    public void visitSetter(Setter setter);
    public void visitMB(MB mb);
    public void visitLibero(Libero libero);
}
