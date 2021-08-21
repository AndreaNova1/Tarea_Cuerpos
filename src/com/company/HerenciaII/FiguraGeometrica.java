package com.company.HerenciaII;
public abstract class FiguraGeometrica {
    private String figura;
    public FiguraGeometrica(){
        this.figura="Tipo de Figura";
    }
    String mostrarTipoFigura(){
        return this.figura;
    }

    abstract double calculoArea();

    abstract double calculoPerimetro();
}
