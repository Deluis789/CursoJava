package abstracto.domain;
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica (String tipoFigura){
    this.tipoFigura = tipoFigura;
    }
    //La clase padre no define el comporatamiento
    
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
}
