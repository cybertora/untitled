package Visitor.visitors;

import Visitor.interfaces.Visitor;
import Visitor.players.Libero;
import Visitor.players.MB;
import Visitor.players.OH;
import Visitor.players.Setter;

public class AttackZonesVisitor implements Visitor {

    @Override
    public void visitSetter(Setter setter) {
        System.out.println("zone 2");
    }
    @Override
    public void visitMB(MB mb) {
        System.out.println("zone 3");
    }
    @Override
    public void visitLibero(Libero libero) {
        System.out.println("zone 5");
    }
    @Override
    public void visitOH(OH oh) {
        System.out.println("zone 4");
    }
}
