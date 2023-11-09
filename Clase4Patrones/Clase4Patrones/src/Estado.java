public abstract class Estado {

    protected String icono;
    protected String leyenda;

    public abstract void actuar(ContextoCancion contextoCancion);
}
