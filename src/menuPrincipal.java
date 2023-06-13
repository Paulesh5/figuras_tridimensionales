import java.util.Scanner;
 //muestra los valores de gran cantidad de decimales, solo con el numero de decimales que se desee
import java.text.DecimalFormat;

public class menuPrincipal {
    public static void main(String[] args) {
        //intancias creadas para cada figura
        Scanner sc = new Scanner(System.in);
        figuras_3d cubo = new figuras_3d(0);
        figuras_3d cilindro = new figuras_3d(0, 0);
        figuras_3d cono = new figuras_3d(12, 23, 24);
        figuras_3d esfera = new figuras_3d(0, 0, 0);
    //variable para uso del menu
        int op;
        //variables para ingreso de valores de los constructores creados de las figuras
        double lado, altura_C, radio_C;//cubo
        double altura_Cono, radio_cono, longitud_cono;//cono
        double radio_esfera;//esfera

        do {
            menu();
            System.out.print("Ingresar opción: ");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("\n\t *** CUBO ***\n");
                    System.out.print("Ingrese un lado: ");
                    //Ingreso del valor del lado del cubo
                    lado = sc.nextDouble();
                    cubo.setLado_cubo(lado);
                    //establece el numero de decimales que se muesta del resultado de area y volumen
                    DecimalFormat formato = new DecimalFormat("#.##");//solo dos decimales
                    System.out.println("El area del cubo es: " + formato.format(cubo.getArea_cubo()));//muestra area
                    System.out.println("El volumen del cubo es: " + formato.format(cubo.getVolumen_cubo()));//muestra volumen
                    break;
                }
                case 2: {
                    System.out.println("\n\t *** CILINDRO ***\n");
                    System.out.print("Ingrese la altura: ");
                    //Ingreso del valor de altura y radio del cilindro
                    altura_C = sc.nextDouble();
                    cilindro.setAltura_cilindro(altura_C);
                    System.out.print("Ingrese el radio: ");
                    radio_C = sc.nextDouble();
                    cilindro.setRadio_cilindro(radio_C);
                    //establece el numero de decimales que se muesta del resultado de area y volumen
                    DecimalFormat formato = new DecimalFormat("#.##");
                    System.out.println("El area del cilindro es: " + formato.format(cilindro.getArea_cilindro()));//muestra area
                    System.out.println("El volumen del cilindro es: " + formato.format(cilindro.getVolumen_cilindro()));//muestra volumen
                    break;
                }
                case 3: {
                    System.out.println("\n\t *** CONO ***\n");
                    System.out.print("Ingrese la altura: ");
                    //Ingreso del valor de altura, radio y longitud del cono
                    altura_Cono = sc.nextDouble();
                    cono.setAltura_cono(altura_Cono);
                    System.out.print("Ingrese el radio: ");
                    radio_cono = sc.nextDouble();
                    cono.setRadio_cilindro(radio_cono);
                    System.out.print("Ingrese la longitud: ");
                    longitud_cono = sc.nextDouble();
                    cono.setLongitud_cono(longitud_cono);
                    DecimalFormat formato = new DecimalFormat("#.##");//uso de solo dos decimales
                    System.out.println("El area del cono es: " + formato.format(cono.getAreaCono()));//muestra area
                    System.out.println("El volumen del cono es: " + formato.format(cono.getVolumenCono()));//muestra volumen
                    break;
                }
                case 4: {
                    System.out.println("\n\t *** Esfera ***\n");
                    System.out.print("Ingrese el radio: ");
                    //Ingreso del valor de radio de la esfera
                    radio_esfera = sc.nextDouble();
                    esfera.setRadio_esfera(radio_esfera);
                    DecimalFormat formato = new DecimalFormat("#.##");
                    System.out.println("El area de la esfera es: " + formato.format(esfera.getAreaEsfera()));//muestra area
                    System.out.println("El volumen de la esfera es: " + formato.format(esfera.getVolumenEsfera()));//muestra volumen
                    break;
                }
            }
        } while (op != 5);
    }

    private static void menu() {
        System.out.println("\n\t\t ===== MENU PRINCIPAL =====\n");
        System.out.println("1. CUBO");
        System.out.println("2. CILINDRO");
        System.out.println("3. CONO");
        System.out.println("4. ESFERA");
        System.out.println("5. SALIR");
    }

}