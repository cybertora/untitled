package Visitor;

import Visitor.interfaces.Visitor;
import Visitor.interfaces.VolleyballPlayer;
import Visitor.players.Libero;
import Visitor.players.MB;
import Visitor.players.OH;
import Visitor.players.Setter;
import Visitor.visitors.ActionsVisitor;
import Visitor.visitors.AttackZonesVisitor;

public class Main {
    public static void main(String[] args) {
        VolleyballPlayer mb = new MB();
        VolleyballPlayer s = new Setter();
        VolleyballPlayer oh = new OH();
        VolleyballPlayer l = new Libero();

        Visitor actionVisitor = new ActionsVisitor();
        Visitor attackzoneVisitor = new AttackZonesVisitor();

        mb.accept(actionVisitor);
        mb.accept(attackzoneVisitor);

        s.accept(actionVisitor);
        s.accept(attackzoneVisitor);

        oh.accept(actionVisitor);
        oh.accept(attackzoneVisitor);

        l.accept(actionVisitor);
        l.accept(attackzoneVisitor);


    }
}
