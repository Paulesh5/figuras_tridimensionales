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

    //Cilindro
    private double altura_cilindro,radio_cilindro,area_cilindro,volumen_cilindro;
    public figuras_3d(double altura_cilindro, double radio_cilindro) {
        this.altura_cilindro = altura_cilindro;
        this.radio_cilindro = radio_cilindro;
    }
    public double getAltura_cilindro() { return altura_cilindro; }
    public double getRadio_cilindro() { return radio_cilindro; }
    public void setAltura_cilindro(double altura_cilindro) { this.altura_cilindro = altura_cilindro;  }
    public void setRadio_cilindro(double radio_cilindro) { this.radio_cilindro = radio_cilindro;  }
    public double getArea_cilindro(){
        areacilindro();
        return area_cilindro;
    }
    public double getVolumen_cilindro() {
        volumencilindro();
        return volumen_cilindro;
    }
    private void areacilindro(){
        area_cilindro = 2*3.14*getRadio_cilindro()*(getRadio_cilindro()+getAltura_cilindro());
    }
    private void volumencilindro(){
        volumen_cilindro = 3.14*(getRadio_cilindro()*getRadio_cilindro())*getAltura_cilindro();
    }
}
