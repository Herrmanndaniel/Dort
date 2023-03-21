public class DortDekorator implements Dort {
    private Dort dort;

    @Override
    public String decorate() {
        return dort.decorate();
    }
}