package proyectofinal;j

/**
*Bogantes Céspedes María Aurora
*Chaves González Fiorella
* González Carrillo Omar Steve
* Valderrama Blanco Juan David
 */
public class ProyectoFinal {
private static final String abc = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789 ";
private static final int mod = 38;
private static final int inv_mult = 3;

public static String cifrar(String plaintext) {
    StringBuilder textoCifrado = new StringBuilder();
    for(int i=0; i<plaintext.length(); i++) {
        char c = plaintext.toUpperCase().charAt(i);
        int og = abc.indexOf(c);
        int cifrado = (inv_mult*og+3)*3%mod;
        textoCifrado.append(abc.charAt(cifrado));
    }
    return textoCifrado.toString();
}

public static String descifrar(String textoCifrado) {
    StringBuilder plaintext = new StringBuilder();
    for(int i=0; i<textoCifrado.length(); i++) {
        char c = textoCifrado.charAt(i);
        int cifrado = abc.indexOf(c);
        int descifrado = (13*(cifrado*13-3))%mod;
        if(descifrado<0) {
            descifrado += mod;
        }
        plaintext.append(abc.charAt(descifrado));
    }
    return plaintext.toString();
}

public static void main(String[] args) {
    String texto= "EN EL CORAZON DEL OCASO LA CIUDAD SE TRANSFORMA EN UN ESCENARIO LUMINOSO RASCACIELOS PROYECTAN SOMBRAS QUE DANZAN EN LAS CALLES ANIMADAS CAFES REBOSAN CON RISAS Y CONVERSACIONES MIENTRAS EL AROMA DEL CAFE FLOTA EN EL AIRE EN LOS PARQUES BANCOS DESGASTADOS ACOGEN ENCUENTROS FUGACES Y CONTEMPLACIONES SOLITARIAS ENTRE EDIFICIOS QUE ROZAN EL CIELO EL BULLICIO URBANO SE CONVIERTE EN UNA SINFONIA CONTEMPORANEA LUCES DE NEON PINTAN EL PAISAJE NOCTURNO REVELANDO LA ENERGIA INAGOTABLE DE LA METROPOLIS EN ESTE MICROCOSMOS EFERVESCENTE EL TIEMPO SE ACELERA CADA ESQUINA CUENTA UNA HISTORIA UNICA EN EL INTERMINABLE DRAMA URBANO";
    System.out.println("Texto original: "+texto);
    String textoCifrado = cifrar(texto);
    System.out.println("Texto cifrado: "+textoCifrado);
    String textoDescifrado = descifrar(textoCifrado);
    System.out.println("Texto descifrado: "+textoDescifrado);
}
}