public class ContextoCancion {

    private String artista;
    private String album;
    private int anio;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private int ultimaReproEnMins;
    private Estado estado;

    public ContextoCancion() {
        this.estado = new EstadoNormal();
    }

    public ContextoCancion(String artista, String album, int anio) {
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.ultimaReproEnMins = -1;
        this.estado = new EstadoNormal();
    }
    public ContextoCancion(String artista, String album, int anio, int reproducciones, int likes, int dislikes, int ultimaReproEnMins, Estado estado) {
        this.artista = artista;
        this.album = album;
        this.anio = anio;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultimaReproEnMins = ultimaReproEnMins;
        this.estado = new EstadoNormal();
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public int getUltimaReproEnMins() {
        return ultimaReproEnMins;
    }

    public void actuar()
    {
        this.estado.actuar(this);
    }

    public void cambiarEstado(Estado estado)
    {
        this.estado = estado;
    }
}
