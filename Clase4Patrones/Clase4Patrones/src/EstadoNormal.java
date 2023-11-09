public class EstadoNormal extends Estado {
    @Override
    public void actuar(ContextoCancion contextoCancion) {
        if(this.cumpleCondicionDeAuge(contextoCancion))
        {
            contextoCancion.cambiarEstado(new EstadoEnAuge());
        }
    }

    private boolean cumpleCondicionDeAuge(ContextoCancion contextoCancion)
    {
        return contextoCancion.getReproducciones() > Categorias.getReprosParaAuge();
    }

}
