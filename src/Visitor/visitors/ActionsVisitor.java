package Visitor.visitors;

import Visitor.interfaces.Visitor;
import Visitor.players.Libero;
import Visitor.players.MB;
import Visitor.players.OH;
import Visitor.players.Setter;

public class ActionsVisitor implements Visitor {

    @Override
    public void visitSetter(Setter setter) {
        System.out.println("gives a pass");
    }
    @Override
    public void visitMB(MB mb) {
        System.out.println("set up a block");
    }
    @Override
    public void visitLibero(Libero libero) {
        System.out.println("do receive");
    }
    @Override
    public void visitOH(OH oh) {
        System.out.println("do spike");
    }

}
