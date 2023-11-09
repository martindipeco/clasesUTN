public class EstadoEnTendencia extends Estado{
    @Override
    public void actuar(ContextoCancion contextoCancion) {
        if(this.cumpleCondicionDeNormal(contextoCancion))
        {
            contextoCancion.cambiarEstado(new EstadoNormal());
        }
    }

    private boolean cumpleCondicionDeNormal(ContextoCancion contextoCancion)
    {
        return contextoCancion.getUltimaReproEnMins()>=Categorias.getLimiteMinutosSinRepros();
    }
}
