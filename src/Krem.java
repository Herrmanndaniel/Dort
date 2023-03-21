public class Krem extends DortDekorator{
    public Krem(Dort dort) {
        super(dort);
    }

    public String decorate() {
        return super.decorate() + decoratesKrem();
    }

    private String decoratesKrem() {
        return " s Krémem";
    }
}


