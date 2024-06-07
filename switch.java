public class switch {

    public static void main(String[] args) {

        
        Scanner l = new Scanner (System.in);
        
        int opcion;
        int precio=0;
        int cantidad;
        double total=0;
        
        System.out.println("Sistema de Ventas de Productos: ");
        System.out.println("Presione 1: Si quiere comprar Electrodomesticos");
        System.out.println("Presione 2: Si quiere comprar Computadores");
        System.out.println("Presione 3: Si quiere comprar Accesorios");
        System.out.println("Presione 4: Si quiere comprar Repuestos");
        System.out.println("Presione 5: Si quiere comprar Video Porteros");
        opcion = l.nextInt();
        
        switch(opcion){
        
            case 1:
                System.out.println("Gracias por elegir la seccion de electrodomesticos:");
                System.out.println("Tenemos a disposición: ");
                System.out.println("Refrigeradores a $500");
                precio = 500;
                
                System.out.println("Cuantas refrigeradoras quiere comprar: ");
                cantidad = l.nextInt();
                
                total = cantidad * precio;
                
                System.out.println("Ud. debe cancelar el valor de $" + total);
                
                break;
            
            case 2:
                System.out.println("Gracias por elegir la seccion de Computadores:");
                System.out.println("Tenemos a disposición: ");
                System.out.println("HP a $700");
                precio = 700;
                
                System.out.println("Cuantas Computadores HP quiere comprar: ");
                cantidad = l.nextInt();
                
                total = cantidad * precio;
                
                System.out.println("Ud. debe cancelar el valor de $" + total);
                
                
                
                break;
            
            case 3:
                System.out.println("Gracias por elegir la seccion de Accesorios:");
                System.out.println("Tenemos a disposición: ");
                System.out.println("Discos duros a $70");
                
                precio = 70;
                
                System.out.println("Cuantas Accesorios - Parlantes quiere comprar: ");
                cantidad = l.nextInt();
                
                total = cantidad * precio;
                
                System.out.println("Ud. debe cancelar el valor de $" + total);
                
                
                break;
        
            case 4:
                System.out.println("Gracias por elegir la seccion de Repuestos:");
                System.out.println("Tenemos a disposición: ");
                System.out.println("Destornilladores a $10");
                precio = 10;
                
                System.out.println("Cuantas Repuestos - Destornilladores quiere comprar: ");
                cantidad = l.nextInt();
                
                total = cantidad * precio;
                
                System.out.println("Ud. debe cancelar el valor de $" + total);
                
                
                
                
                break;
        
            case 5:
                System.out.println("Gracias por elegir la seccion de Video Porteros:");
                System.out.println("Tenemos a disposición: ");
                System.out.println("Video Porteros con 1700p a $1000");
               
                precio = 1000;
                
                System.out.println("Cuantas Video Porteros de 1700px quiere comprar: ");
                cantidad = l.nextInt();
                
                total = cantidad * precio;
                
                System.out.println("Ud. debe cancelar el valor de $" + total);
                
                
                
                break;
        
            default:
                System.out.println("Ingrese un valor entre 1 - 5");
                break;
        
        }
        
        
        
    }
    
}
