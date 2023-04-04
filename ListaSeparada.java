/**
 * @author Rebeca
 */

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

        public class ListaSeparada {

            public static void main (String args[]){
                Scanner scanner = new Scanner(System.in);
                List <String> nomes = new ArrayList<>();
                List <String> masculinos =  new ArrayList<>();
                List <String> femininos = new ArrayList<>();

                System.out.println("Digite os nomes e respectivos sexos (F/M): ");
                while (true) {
                    String entrada = scanner.nextLine();
                    if (entrada.isEmpty()){
                    break;
                    }

                    String[] dados = entrada.split(",");
                    String nome = dados[0].trim();
                    String sexo = dados[1].trim();

                    nomes.add(nome);

                    if (sexo.equalsIgnoreCase("M")) {
                        masculinos.add(nome);
                    } else if ( sexo.equalsIgnoreCase("F")){
                        femininos.add(nome);
                    }
                }
                System.out.println("Masculinos:  " + masculinos.toString());
                System.out.println("Femininos:   " +femininos.toString());

            }



}
