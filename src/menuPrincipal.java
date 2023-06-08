import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        figuras_3d cubo = new figuras_3d(0);

        int op;
        double lado;

        do {
            menu();
            System.out.print("Ingresar opción: ");
            op = sc.nextInt();
            switch (op){
                case 1:{
                    System.out.println("\n\t *** CUBO ***\n");
                    System.out.print("Ingrese un lado: ");
                    lado = sc.nextDouble();
                    cubo.setLado_cubo(lado);
                    System.out.println("El area del cubo es: " + cubo.getArea_cubo());
                    System.out.println("El volumen del cubo es: " + cubo.getVolumen_cubo());
                    break;
                }
                case 2:{
                    System.out.println("\n\t *** FIGURA 2 ***\n");
                    break;
                }
                case 3:{
                    System.out.println("\n\t *** FIGURA 3 ***\n");
                    break;
                }
                case 4: {
                    System.out.println("\n\t *** FIGURA 4 ***\n");
                    break;
                }
            }
        }while (op != 5);
    }

    private static void menu(){
        System.out.println("\n\t\t ===== MENU PRINCIPAL =====\n");
        System.out.println("1. CUBO");
        System.out.println("2. FIGURA 2");
        System.out.println("3. FIGURA 3");
        System.out.println("4. FIGURA 4");
        System.out.println("5. SALIR");
    }

}
