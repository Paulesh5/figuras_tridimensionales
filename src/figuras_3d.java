public class figuras_3d {
    private double lado_cubo, area_cubo, volumen_cubo;

    public figuras_3d(double lado_cubo) {
        this.lado_cubo = lado_cubo;
    }

    private double getLado_cubo() {
        return lado_cubo;
    }

    public void setLado_cubo(double lado_cubo) {
        this.lado_cubo = lado_cubo;
    }

    public double getArea_cubo() {
        areaCubo();
        return area_cubo;
    }

    public double getVolumen_cubo() {
        volumenCubo();
        return volumen_cubo;
    }

    private void areaCubo(){
        area_cubo = 6 * getLado_cubo() * getLado_cubo();
    }

    private void volumenCubo(){
        volumen_cubo = getLado_cubo() * getLado_cubo() * getLado_cubo();
    }

}
