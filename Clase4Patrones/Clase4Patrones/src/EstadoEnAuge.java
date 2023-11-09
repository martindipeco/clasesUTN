public class EstadoEnAuge extends  Estado{
    @Override
    public void actuar(ContextoCancion contextoCancion) {
        if(this.cumpleCondicionDeTendencia(contextoCancion))
        {
            contextoCancion.cambiarEstado(new EstadoEnTendencia());
        }
        if(this.cumpleCondicionDeNormal(contextoCancion))
        {
            contextoCancion.cambiarEstado(new EstadoNormal());
        }
    }

    private boolean cumpleCondicionDeTendencia(ContextoCancion contextoCancion)
    {
        return (contextoCancion.getReproducciones()>Categorias.getReprosParaTendencia())&&(contextoCancion.getLikes()>Categorias.getLikesParaTendencia());
    }

    private boolean cumpleCondicionDeNormal(ContextoCancion contextoCancion)
    {
        return contextoCancion.getDislikes()>=Categorias.getDislikesParaNormal();
    }
}
