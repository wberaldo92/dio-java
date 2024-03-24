public class MinhaClasse {
    
public static void main (String [] args) {

    String primmeiroNome = "Wellington";
    String segundoNome = "Beraldo";

    String nomeCompleto = nomeCompleto(primmeiroNome,segundoNome);// variavel nomeCompleto que chama o método com dois parametros
    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
