package Abstract_Factory_Antes;

public class FactoryCientifico extends FactoryPublicacionArticulo {

    public Articulo createArticulo() {
        return new ArticuloCientifico(null, null);
    }

    public Publicacion createPublicacion() {
        return new Blog(null);
    }

}
