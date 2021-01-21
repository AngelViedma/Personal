package tiendaconsolas;

import java.util.Scanner;

public class TiendaConsolas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pPs5, pXbox, pMandoXbox, pMandoPs5, pNintendo, totalSinIva, iva, totalIva, precioFinal, recargoTarjeta, precioRecargo, precioPlazos; //precios
        int ps5cantidad = 0, xboxcantidad = 0, mandoxboxcantidad = 0, mandops5cantidad = 0, nintendocantidad = 0;  //unidades que pide el cliente
        int stock_ps5, stock_xbox, stock_nintendo, stock_mps5, stock_mxbox, stock; //unidades de stock
        int opcion_clientes, opcionpago, opcionplazos, plazos = 0, plazooriginal = 0;
        boolean comprobacion;

        String nombrecliente;
        pPs5 = 499;
        pXbox = 485;
        pMandoXbox = 45;
        pMandoPs5 = 50;
        pNintendo = 289;

        iva = 21;
        recargoTarjeta = 2;

        //STOCK
        stock_ps5 = 10;
        stock_xbox = 10;
        stock_nintendo = 10;
        stock_mps5 = 10;
        stock_mxbox = 10;
        stock = stock_ps5 + stock_xbox + stock_nintendo + stock_mps5 + stock_mxbox;
        comprobacion = true;

        //MENSAJE BIENVENIDA
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Bienvenido a SMART GAMING. Tu tienda de consolas de confianza");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("      _=====_                               _=====_\n"
                + "     / _____ \\                             / _____ \\\n"
                + "   +.-'_____'-.---------------------------.-'_____'-.+\n"
                + "  /   |     |  '.     SMART GAMING      .'  |  _  |   \\\n"
                + " / ___| /|\\ |___ \\                     / ___| /_\\ |___ \\\n"
                + "/ |      |      | ;  __           _   ; | _         _ | ;\n"
                + "| | <---   ---> | | |__|         |_:> | ||_|       (_)| |\n"
                + "| |___   |   ___| ;SELECT       START ; |___       ___| ;\n"
                + "|\\    | \\|/ |    /  _     ___      _   \\    | (X) |    /|\n"
                + "| \\   |_____|  .','\" \"', |___|  ,'\" \"', '.  |_____|  .' |\n"
                + "|  '-.______.-' /       \\ANALOG/       \\  '-._____.-'   |\n"
                + "|               |       |------|       |                |\n"
                + "|              /\\       /      \\       /\\               |\n"
                + "|             /  '.___.'        '.___.'  \\              |\n"
                + "|            /                            \\             |\n"
                + " \\          /                              \\           /\n"
                + "  \\________/                                \\_________/");

        System.out.println("");

        System.out.println("Precios de articulos y Stock:");
        System.out.println("-----------------------------");
        System.out.println("Videoconsola PS5: " + pPs5 + "€" + " || Stock disponible: " + stock_ps5);
        System.out.println("Videoconsola Xbox X-Series:" + pXbox + "€" + " || Stock disponible: " + stock_xbox);
        System.out.println("Nintendo Switch:" + pNintendo + "€" + " || Stock disponible: " + stock_nintendo);
        System.out.println("Mando para PS5:" + pMandoPs5 + "€" + " || Stock disponible: " + stock_mps5);
        System.out.println("Mando para Xbox X-Series:" + pMandoXbox + "€" + " || Stock disponible: " + stock_mxbox);
        System.out.println("-----------------------------");

        do {
            System.out.println("¿Hay algun cliente esperando?");
            do {
                System.out.println("1.)si");
                System.out.println("2.)No");

                opcion_clientes = sc.nextInt();

            } while (opcion_clientes != 1 && opcion_clientes != 2);

            if (opcion_clientes == 1 && stock > 0) {
                if (stock == 0) {

                    System.out.println("----------------------------------------");
                    System.out.println("No nos quedan mas existencias de momento");
                    System.out.println("----------------------------------------");
                } else {

                    if (stock_ps5 > 0) {

                        do {

                            System.out.println("Introduzca la cantidad de PS5:");
                            System.out.println("Stock disponible: " + stock_ps5);
                            ps5cantidad = sc.nextInt();

                            if (ps5cantidad >= 0 && ps5cantidad <= stock_ps5) {

                                stock -= ps5cantidad;

                            }

                        } while (ps5cantidad < 0 || ps5cantidad > stock_ps5);
                        stock_ps5 -= ps5cantidad;
                    } else {

                    }

                    if (stock_xbox > 0) {

                        do {

                            System.out.println("Introduzca la cantidad de Xbox X-Series:");
                            System.out.println("Stock disponible: " + stock_xbox);
                            xboxcantidad = sc.nextInt();
                            if (xboxcantidad >= 0 && xboxcantidad <= stock_xbox) {

                                stock -= xboxcantidad;
                            }

                        } while (xboxcantidad < 0 || xboxcantidad > stock_xbox);
                        stock_xbox -= xboxcantidad;
                    } else {

                    }

                    if (stock_nintendo > 0) {

                        do {

                            System.out.println("Introduzca la cantidad de Nintendo Switch:");
                            System.out.println("Stock disponible: " + stock_nintendo);
                            nintendocantidad = sc.nextInt();

                            if (nintendocantidad >= 0 && nintendocantidad <= stock_nintendo) {

                                stock -= nintendocantidad;
                            }

                        } while (nintendocantidad < 0 || nintendocantidad > stock_nintendo);
                        stock_nintendo -= nintendocantidad;
                    } else {

                    }

                    if (stock_mps5 > 0) {

                        do {

                            System.out.println("Introduzca la cantidad de mandos de PS5:");
                            System.out.println("Stock disponible: " + stock_mps5);
                            mandops5cantidad = sc.nextInt();

                            if (mandops5cantidad >= 0 && mandops5cantidad <= stock_mps5) {

                                stock -= mandops5cantidad;
                            }

                        } while (mandops5cantidad < 0 || mandops5cantidad > stock_mps5);
                        stock_mps5 -= mandops5cantidad;
                    } else {

                    }

                    if (stock_mxbox > 0) {

                        do {

                            System.out.println("Introduzca la cantidad de mandos de Xbox:");
                            System.out.println("Stock disponible: " + stock_mxbox);
                            mandoxboxcantidad = sc.nextInt();

                            if (mandoxboxcantidad > 0 && mandoxboxcantidad <= stock_mxbox) {

                                stock -= mandoxboxcantidad;
                            }

                        } while (mandoxboxcantidad < 0 || mandoxboxcantidad > stock_mxbox);
                        stock_mxbox -= mandoxboxcantidad;
                    } else {

                    }
                    if (ps5cantidad + xboxcantidad + nintendocantidad + mandops5cantidad + mandoxboxcantidad == 0) {
                        System.out.println("No has seleccionado ningun producto. Esperamos veerte de nuevo por aqui!");
                    } else {
                        System.out.println("Datos registrados con exito,");

                        sc.nextLine();
                        do {
                            System.out.println("Por favor introduzca Nombre y Apellidos");

                            nombrecliente = sc.nextLine();
                        } while (nombrecliente.equals(""));

                        totalSinIva = (pPs5 * ps5cantidad) + (pXbox * xboxcantidad) + (pMandoXbox * mandoxboxcantidad) + (pMandoPs5 * mandops5cantidad) + (pNintendo * nintendocantidad);
                        totalIva = (totalSinIva * iva) / 100;
                        precioFinal = totalSinIva + totalIva;
                        precioRecargo = precioFinal + (precioFinal * recargoTarjeta) / 100;

                        //PLAZOS
                        System.out.println("¿Desea pagar al contado o con tarjeta?");
                        do {
                            System.out.println("1)Al contado");
                            System.out.println("2)Con tarjeta?");
                            opcionpago = sc.nextInt();
                        } while (opcionpago != 1 && opcionpago != 2);

                        switch (opcionpago) {
                            case 1: //al contado

                                System.out.printf("El precio final es de: %.2f€\n", precioFinal);
                                System.out.println("");
                                System.out.println("No hay recargo");
                                System.out.println("");
                                System.out.println("Por favor elija si quiere fraccionar el pago en plazos");
                                System.out.println("");

                                do {
                                    System.out.println("1)fraccionar");
                                    System.out.println("2)No fraccionar");

                                    opcionpago = sc.nextInt();

                                } while (opcionpago != 1 && opcionpago != 2);

                                switch (opcionpago) {
                                    case 1: //plazos al contado

                                        System.out.println("¿En cuantos plazos quieres fraccionarlo?");
                                        System.out.println("");

                                        do {
                                            System.out.println("Elige de 1-24 plazos");

                                            plazos = sc.nextInt();
                                            plazooriginal = plazos;

                                        } while (plazos > 24 || plazos < 1);

                                        if (plazos > 1) {
                                            plazos = plazos - 1;
                                            precioPlazos = precioFinal + (precioFinal * plazos) / 100;

                                            System.out.println("-----------------------------");
                                            System.out.println("-----Resumen del pedido-----");
                                            System.out.println("-----------------------------");
                                            System.out.println("Nombre: " + nombrecliente);
                                            System.out.println("PS5: " + ps5cantidad);
                                            System.out.println("Xbox X-Series " + xboxcantidad);
                                            System.out.println("Nintendo Switch " + nintendocantidad);
                                            System.out.println("Mandos PS5 " + mandops5cantidad);
                                            System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                            System.out.printf("Total sin IVA: %.2f€\n" ,totalSinIva);
                                            System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                            System.out.printf("Total con IVA %.2f€\n" ,precioFinal);
                                            System.out.println("Esta transaccion no tiene recargo");
                                            System.out.printf("Plazos elegidos:" + plazooriginal + " plazos, el importe total con los plazos es: %.2f€\n", precioPlazos);
                                            System.out.println("");
                                            System.out.println("-----------");
                                            System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                            System.out.println("-----------");
                                            System.out.println("SMART GAMING S.A");

                                        } else {

                                            System.out.println("-----------------------------");
                                            System.out.println("-----Resumen del pedido-----");
                                            System.out.println("-----------------------------");
                                            System.out.println("Nombre: " + nombrecliente);
                                            System.out.println("PS5: " + ps5cantidad);
                                            System.out.println("Xbox X-Series " + xboxcantidad);
                                            System.out.println("Nintendo Switch " + nintendocantidad);
                                            System.out.println("Mandos PS5 " + mandops5cantidad);
                                            System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                            System.out.printf("Total sin IVA: %.2f€\n" ,totalSinIva);
                                            System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                            System.out.printf("Total con IVA %.2f€\n" ,precioFinal);
                                            System.out.println("Esta transaccion no tiene recargo");
                                            System.out.println("Plazos elegidos: " + plazooriginal + ", el importe no varia");
                                            System.out.println("");
                                            System.out.println("-----------");
                                            System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                            System.out.println("-----------");
                                            System.out.println("SMART GAMING S.A");

                                        }

                                        break;

                                    case 2://no plazos al contado

                                        System.out.println("-----------------------------");
                                        System.out.println("-----Resumen del pedido-----");
                                        System.out.println("-----------------------------");
                                        System.out.println("Nombre: " + nombrecliente);
                                        System.out.println("PS5: " + ps5cantidad);
                                        System.out.println("Xbox X-Series " + xboxcantidad);
                                        System.out.println("Nintendo Switch " + nintendocantidad);
                                        System.out.println("Mandos PS5 " + mandops5cantidad);
                                        System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                        System.out.printf("Total sin IVA: %.2f€\n" ,totalSinIva);
                                        System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                        System.out.printf("Total con IVA %.2f€\n" ,precioFinal);
                                        System.out.println("Esta transaccion no tiene recargo");
                                        System.out.println("");
                                        System.out.println("-----------");
                                        System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                        System.out.println("-----------");
                                        System.out.println("SMART GAMING S.A");

                                        break;

                                }

                                break;

                            case 2: //tarjeta

                                System.out.printf("Recargo por pago con tarjeta: %.2f€\n" ,recargoTarjeta);
                                System.out.println("");
                                System.out.printf("El precio final es de: %.2f€\n" ,precioRecargo + precioFinal);
                                System.out.println("");
                                System.out.println("Por favor elija si quiere fraccionar el pago en plazos.");
                                System.out.println("");

                                do {

                                    System.out.println("1)fraccionar");
                                    System.out.println("2)No fraccionar");

                                    opcionplazos = sc.nextInt();

                                } while (opcionplazos != 1 && opcionplazos != 2);

                                switch (opcionplazos) {

                                    case 1: //plazos tarjeta

                                        System.out.println("¿En cuantos plazos quieres fraccionarlo?");
                                        System.out.println("");

                                        do {
                                            System.out.println("Elige de 1-24 plazos");

                                            plazos = sc.nextInt();
                                            plazooriginal = plazos;

                                        } while (plazos > 24 || plazos < 1);

                                        if (plazos > 1) {
                                            plazos = plazos - 1;
                                            precioPlazos = (precioRecargo + (precioRecargo * plazos) / 100);

                                            System.out.println("-----------------------------");
                                            System.out.println("-----Resumen del pedido-----");
                                            System.out.println("-----------------------------");
                                            System.out.println("Nombre: " + nombrecliente);
                                            System.out.println("PS5: " + ps5cantidad);
                                            System.out.println("Xbox X-Series " + xboxcantidad);
                                            System.out.println("Nintendo Switch " + nintendocantidad);
                                            System.out.println("Mandos PS5 " + mandops5cantidad);
                                            System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                            System.out.printf("Total sin IVA: %.2f\n€" ,totalSinIva);
                                            System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                            System.out.printf("Total con IVA %.2f€\n" ,precioFinal);
                                            System.out.println("Recargo por tarjeta de: " + recargoTarjeta + " %");
                                            System.out.printf("Precio de recargo es de: %.2f€\n" ,precioRecargo);
                                            System.out.println("Plazos elegidos: " + plazooriginal + " plazos, el importe total con los plazos es: " + precioPlazos);
                                            System.out.println("");
                                            System.out.println("-----------");
                                            System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                            System.out.println("-----------");
                                            System.out.println("SMART GAMING S.A");

                                        } else {

                                            System.out.println("-----------------------------");
                                            System.out.println("-----Resumen del pedido-----");
                                            System.out.println("-----------------------------");
                                            System.out.println("Nombre: " + nombrecliente);
                                            System.out.println("PS5: " + ps5cantidad);
                                            System.out.println("Xbox X-Series " + xboxcantidad);
                                            System.out.println("Nintendo Switch " + nintendocantidad);
                                            System.out.println("Mandos PS5 " + mandops5cantidad);
                                            System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                            System.out.printf("Total sin IVA: %.2f€\n" ,totalSinIva);
                                            System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                            System.out.printf("Total con IVA %.2f€\n" ,precioFinal);
                                            System.out.println("Recargo por tarjeta de: " + recargoTarjeta + " %");
                                            System.out.println("Precio de recargo es de: " + precioRecargo);
                                            System.out.println("Plazos elegidos: " + plazooriginal + ", el importe no varia");
                                            System.out.println("");
                                            System.out.println("-----------");
                                            System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                            System.out.println("-----------");
                                            System.out.println("SMART GAMING S.A");

                                        }

                                        break;

                                    case 2: //no plazos tarjeta

                                        System.out.println("-----------------------------");
                                        System.out.println("-----Resumen del pedido-----");
                                        System.out.println("-----------------------------");
                                        System.out.println("Nombre: " + nombrecliente);
                                        System.out.println("PS5: " + ps5cantidad);
                                        System.out.println("Xbox X-Series " + xboxcantidad);
                                        System.out.println("Nintendo Switch " + nintendocantidad);
                                        System.out.println("Mandos PS5 " + mandops5cantidad);
                                        System.out.println("Mandos Xbox " + mandoxboxcantidad);
                                        System.out.printf("Total sin IVA: %.2f€\n" ,totalSinIva);
                                        System.out.printf("IVA:%.2f TOTAL IVA %.2f€\n", iva,totalIva);
                                        System.out.println("Recargo por tarjeta de: " + recargoTarjeta + " %");
                                        System.out.printf("Precio de recargo es de: %.2f€\n" ,precioRecargo);
                                        System.out.println("");
                                        System.out.println("-----------");
                                        System.out.println("Gracias por su Compra, esperamos volver a verle pronto");
                                        System.out.println("-----------");
                                        System.out.println("SMART GAMING S.A");

                                        break;

                                }

                                break;
                            default:
                                System.out.println("Elige una opcion correcta");

                        }

                    }
                }
            } else {

                System.out.println("Cerrando tienda");
                comprobacion = false;

            }

        } while (comprobacion && stock > 0);
        System.out.println("");
        System.out.println("");
        if (stock == 0) {
            System.out.println("No nos queda mas stock!");
        } else {
            System.out.println("");
        }
    }

}
