public class App {
    public static void main(String[] args) throws Exception {

        Double valor1 = 10.2;
        Double valor2 = 20.4;

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2 + "\n");

        System.out.println("Operação:");
        System.out.println("Soma: " + Calculo(valor1, valor2, "Soma"));
        System.out.println("Subtração: " + Calculo(valor1, valor2, "Subtração"));
        System.out.println("Divisão: " + Calculo(valor1, valor2, "Divisão"));
        System.out.println("Multiplicação: " + Calculo(valor1, valor2, "Multiplicação"));

        Calculo(valor1, valor2, "Soma");
    }

    public static Double Calculo(Double valor1, double valor2, String operacao){
        Double resposta = 0.0;
        

        switch (operacao){
            case "Soma":
                resposta = Soma(valor1, valor2);
            break;

            case "Subtração":
                resposta = Subtracao(valor1, valor2);
            break;

            case "Divisão":
                resposta = Divisao(valor1, valor2);
            break;

            case "Multiplicação":
                resposta = Multiplicacao(valor1, valor2);
            break;

            default:
                resposta = 0.0;
        }

         return resposta;
    }

    public static Double Soma(Double valor1, double valor2){
        Double resposta = 0.0;

        resposta = valor1 + valor2;

        return resposta;
    }

    public static Double Subtracao(Double valor1, double valor2){
        Double resposta = 0.0;

        resposta = valor1 - valor2;

        return resposta;
    }

    public static Double Divisao(Double valor1, double valor2){
        Double resposta = 0.0;

        resposta = valor1 / valor2;

        return resposta;
    }

    public static Double Multiplicacao(Double valor1, double valor2){
        Double resposta = 0.0;

        resposta = valor1 * valor2;

        return resposta;
    }
}
