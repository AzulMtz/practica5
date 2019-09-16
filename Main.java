/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5;

/**
 *
 * @author pumit
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prisma prisma = new Prisma();
        Esfera esfera = new Esfera();
        Cono cono = new Cono();
        DecimalFormat formato1= new DecimalFormat("#.00");
        Scanner sc = new Scanner (System.in);
        int i =0;
        do{ 
            System.out.println("Bienvenido, elige una de las siguientes opciones");
            System.out.println("1.- Area superficial");
            System.out.println("2.- Volúmen");
            System.out.println("3.- Salir");
            switch (sc.nextInt()){
                case 1:{
                    System.out.println("Elige la figura");
                    System.out.println("1.- Esfera");
                    System.out.println("2.- Prisma");
                    System.out.println("3.- Cono");
                    switch (sc.nextInt()){
                        case 1:{
                            System.out.println("Ingresa el radio de la esfera");
                            esfera.setRadio(sc.nextFloat());
                            System.out.println("El area superficial es: " + formato1.format(esfera.obtenerAreaSuperficial()));
                            break;
                        }
                        case 2:{
                            System.out.println("Ingrese la altura del prisma");
                            prisma.setal(sc.nextFloat());
                            System.out.println("Ingrese el ancho de la base del prisma");
                            prisma.setan(sc.nextFloat());
                            System.out.println("Ingrese el largo de la base del prisma");
                            prisma.setlar(sc.nextFloat());
                            System.out.println("El área superficial es: " + formato1.format(prisma.areaSuperficial()));
                            break;
                        }
                        case 3:{
                            System.out.println("Ingresa el radio del cono");
                            cono.setRadio(sc.nextInt());
                            System.out.println("Ingresa la altura del cono");
                            cono.setAltura(sc.nextInt());
                            double g = cono.crearGeneratriz(cono.getAltura(), cono.getRadio());
                            System.out.println("Con un radio de " + cono.getRadio() + " y una altura de " + cono.getAltura());
                            System.out.println("Se obtiene una generatriz de " + formato1.format(g));
                            System.out.println("El area superficial del cono es: " + formato1.format(cono.sacarArea(cono.getRadio(), (int) g)));
                            break;
                        }
                        
                    }
                    break;
                }  
                case 2:{
                    System.out.println("Elige la figura");
                    System.out.println("1.- Esfera");
                    System.out.println("2.- Prisma");
                    System.out.println("3.- Cono");
                    switch (sc.nextInt()){
                        case 1:
                            System.out.println("Ingresa el radio");
                            esfera.setRadio(sc.nextFloat());
                            System.out.println("El volúmen es: "+ formato1.format(esfera.obtenerVolumen()));
                            break;
                        case 2:{                            
                            System.out.println("Ingrese la altura del prisma");
                            prisma.setal(sc.nextFloat());
                            System.out.println("Ingrese el ancho de la base del prisma");
                            prisma.setan(sc.nextFloat());
                            System.out.println("Ingrese el largo de la base del prisma");
                            prisma.setlar(sc.nextFloat());
                            System.out.println("El volumen es: "+formato1.format(prisma.volumen()));
                            break;
                        }
                        case 3:{
                            System.out.println("Ingresa el radio del cono");
                            cono.setRadio(sc.nextInt());
                            System.out.println("Ingresa la altura del cono");
                            cono.setAltura(sc.nextInt());
                            System.out.println("El volúmen del cono es: " + formato1.format(cono.sacarVolumen(cono.getRadio(), cono.getAltura())));
                            break;
                        }
                        default:
                            System.out.println("Opción no encontrada");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Hasta luego");
                    i=1;
                    break;
                }
                default:
                    System.out.println("Opción no encontrada");
            
            }
        }while (i==0);
    }
    
}
