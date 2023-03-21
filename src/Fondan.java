public class Fondan extends DortDekorator{
    public Fondan(Dort dort) {
        super(dort);
    }

    public String decorate() {
        return super.decorate() + decoratesFondan();
    }

    private String decoratesFondan() {
        return " s Fondánem";
    }
}

