package com.company.HerenciaII;

public abstract class FiguraGeometricaCuerposGeometricos extends FiguraGeometrica {
    @Override
    String mostrarTipoFigura() {
        return super.mostrarTipoFigura();
    }
    @Override
    double calculoArea() {

        return 0;
    }

    @Override
    double calculoPerimetro() {

        return 0;
    }

    abstract double calcularVolumen();
}
