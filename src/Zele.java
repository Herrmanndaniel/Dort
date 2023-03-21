public class Zele extends DortDekorator{
    public Zele(Dort dort) {
        super(dort);
    }

    public String decorate() {
        return super.decorate() + decoratesZele();
    }

    private String decoratesZele() {
        return " se Želé";
    }
}

}
