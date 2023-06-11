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

    //Figura tridimensional Eduardo Almachi
    private double radio_base_cono, longitud_cono, altura_cono, area_cono, volumen_cono;

    public figuras_3d(double radio_base_cono, double longitud_cono, double altura_cono) {
        this.radio_base_cono = radio_base_cono;
        this.longitud_cono = longitud_cono;
        this.altura_cono = altura_cono;
    }

    public double getAltura_cono() {
        return altura_cono;
    }
    public void setAltura_cono(double altura_cono) {
        this.altura_cono = altura_cono;
    }

    public double getArea_cono() {
        return area_cono;
    }
    public void setArea_cono(double area_cono) {
        this.area_cono = area_cono;
    }

    public double getLongitud_cono() {
        return longitud_cono;
    }

    public void setLongitud_cono(double longitud_cono) {
        this.longitud_cono = longitud_cono;
    }

    public double getVolumen_cono() {
        return volumen_cono;
    }
    public void setVolumen_cono(double volumen_cono) {
        this.volumen_cono = volumen_cono;
    }

    public double getAreaCono() {
        areaCono();
        return area_cono;
    }

    public double getVolumenCono() {
        volumenCono();
        return volumen_cono;
    }

    private void areaCono() {
        area_cono = Math.PI * radio_base_cono * (radio_base_cono * longitud_cono);
    }

    private void volumenCono() {
        volumen_cono = 0.33 * Math.PI * (radio_base_cono *radio_base_cono) * altura_cono;
    }

    // Esfera
    private double radio_esfera, area_esfera, volumen_esfera;

    public double getRadio_esfera() {
        return radio_esfera;
    }

    public void setRadio_esfera(double radio_esfera) {
        this.radio_esfera = radio_esfera;
    }
    public double getAreaEsfera(){
        areaEsfera();
        return area_esfera;
    }
    public double getVolumenEsfera(){
        volumenEsfera();
        return volumen_esfera;
    }
    private void areaEsfera(){
        area_esfera = (4 * Math.PI * (radio_esfera * radio_esfera));
    }
    private void volumenEsfera(){
        volumen_esfera = (4/3 * Math.PI * (radio_esfera * radio_esfera * radio_esfera));
    }

}