public class figuras_3d {


    //definir los parametros de la figura cubo
    private double lado_cubo, area_cubo, volumen_cubo;

    /*Constructor para inicializar el parametro lado_cubo, puesto que es fundamental para el calculo de area y volumen del cubo*/
    public figuras_3d(double lado_cubo) {
        this.lado_cubo = lado_cubo;
    }
    //SETTERS and GETTERS del constructor creado
    //get>>lee, muestra el valor
    //Set>>asigna un valor
    private double getLado_cubo() {
        return lado_cubo;
    }
    public void setLado_cubo(double lado_cubo) {
        this.lado_cubo = lado_cubo;
    }
    //Mostrar area cubo
    public double getArea_cubo() {
        areaCubo();
        return area_cubo;
    }
    //Mostrar Volumen cubo
    public double getVolumen_cubo() {
        volumenCubo();
        return volumen_cubo;
    }
    //Calculo del area del cubo
    private void areaCubo() {
        //formula para calcular area
        area_cubo = 6 * getLado_cubo() * getLado_cubo();
    }
    //Calculo del Volumen del cubo
    private void volumenCubo() {
        //formula para calcular el volumen
        volumen_cubo = getLado_cubo() * getLado_cubo() * getLado_cubo();
    }
//CILINDRO

    //Definir los parametros de la figura cilindro
    private double altura_cilindro, radio_cilindro, area_cilindro, volumen_cilindro;

    //Constructores para los parametros de altura y radio
    public figuras_3d(double altura_cilindro, double radio_cilindro) {
        this.altura_cilindro = altura_cilindro;
        this.radio_cilindro = radio_cilindro;
    }
    //SETTERS and GETTERS de los constructores creados

    public double getAltura_cilindro() {
        return altura_cilindro;
    }
    public double getRadio_cilindro() {
        return radio_cilindro;
    }
    public void setAltura_cilindro(double altura_cilindro) {
        this.altura_cilindro = altura_cilindro;
    }

    public void setRadio_cilindro(double radio_cilindro) {
        this.radio_cilindro = radio_cilindro;
    }
    //Mostrar area cilindro
    public double getArea_cilindro() {
        areacilindro();
        return area_cilindro;
    }
    //Mostrar volumen cilindro
    public double getVolumen_cilindro() {
        volumencilindro();
        return volumen_cilindro;
    }
    //Calculo del area del cilindro
    private void areacilindro() {
        area_cilindro = 2 * 3.14 * getRadio_cilindro() * (getRadio_cilindro() + getAltura_cilindro());
    }
    //Calculo del Volumen del cilindro
    private void volumencilindro() {
        volumen_cilindro = 3.14 * (getRadio_cilindro() * getRadio_cilindro()) * getAltura_cilindro();
    }
//COMO
    //Definir los parametros de la figura cilindro
    private double radio_base_cono, longitud_cono, altura_cono, area_cono, volumen_cono;

    //Constructores para los parametros de  radio, longitud y altura
    public figuras_3d(double radio_base_cono, double longitud_cono, double altura_cono) {
        this.radio_base_cono = radio_base_cono;
        this.longitud_cono = longitud_cono;
        this.altura_cono = altura_cono;
    }
    //SETTERS and GETTERS de los constructores creados
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
    //Reorna el valor del area del cono
    public double getAreaCono() {
        areaCono();
        return area_cono;
    }
    //Retorna el valor del volumen del cono
    public double getVolumenCono() {
        volumenCono();
        return volumen_cono;
    }
//Calculo del area del cono
    private void areaCono() {
        //Math.Pi trabaja con el valor de pi, sin necesidad de definir este valor como uno constante
        area_cono = Math.PI * radio_base_cono * (radio_base_cono * longitud_cono);
    }
    //Calculo del Volumen del cono
    private void volumenCono() {
        volumen_cono = 0.33 * Math.PI * (radio_base_cono * radio_base_cono) * altura_cono;
    }
    // ESFERA
    //Definir los parametros para la esfera
    private double radio_esfera, area_esfera, volumen_esfera;
    ////SETTERS and GETTERS
    public double getRadio_esfera() {
        return radio_esfera;
    }

    public void setRadio_esfera(double radio_esfera) {
        this.radio_esfera = radio_esfera;
    }
    //muestra el valor del area del esfera
    public double getAreaEsfera() {
        areaEsfera();
        return area_esfera;
    }
    //muestra el valor del Volumen del esfera
    public double getVolumenEsfera() {
        volumenEsfera();
        return volumen_esfera;
    }
    //Calculo del area de la esfera
    private void areaEsfera() {
        //Math.Pi trabaja con el valor de pi, sin necesidad de definir este valor como uno constante
        area_esfera = (4 * Math.PI * (radio_esfera * radio_esfera));
    }
    //Calculo del area de la esfera
    private void volumenEsfera() {
        volumen_esfera = (4 / 3 * Math.PI * (radio_esfera * radio_esfera * radio_esfera));
    }

}