package Abstract_Factory_Antes;

public class FactoryDivulgacion extends FactoryPublicacionArticulo {
    public Articulo createArticulo() {
        return new ArticuloDivulgacion(null, null);
    }

    public Publicacion createPublicacion() {
        return new Blog(null);
    }
}
