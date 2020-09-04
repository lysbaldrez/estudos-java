package cursojava.devdojo.aularegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        // Expressão regular não reutiliza caractere que ja teve um "match"
        String regex = "aba";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 012345678");
        System.out.println("expressao: " + matcher.pattern());
        System.out.println("posicoes encontradas: ");
        while(matcher.find ()) {
            System.out.print(matcher.start() + "");
        }
        
    }

}
