public class Main {
    public void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        Dort dort1 = new Garland(new DortIm());
        assertEquals(dort1.decorate(),


        Dort dort2 = new Piskot(
                new Garland(new Garland(new DortIm())));
        assertEquals(dort2.decorate(),

    }
}
