public class Piskot extends DortDekorator{
    public Piskot(Dort dort) {
        super(dort);
    }

    public String decorate() {
        return super.decorate() + decoratesPiskot();
    }

    private String decoratesPiskot() {
        return " s Piskotem";
    }
}


}
