import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            case 1:
                double notaUm=10.0;
                double notaDois=9.0;
                double notaTres=8.5;
                double media=(notaUm+notaDois+notaTres/3);

                System.out.println(notaUm);
                System.out.println(notaDois);
                System.out.println(notaTres);
                System.out.println(media);
                break;
            
            case 2:
                double baseB= 16;
                double alturaH= 4.5;
                double area=(baseB*alturaH);

                System.out.println(baseB);
                System.out.println(alturaH);
                System.out.println(area);
                break;
            
            case 3:
                double largura= 3;
                double altura= 2;
                double profundidade= 5;
                double volume= (altura*profundidade*largura);

                System.out.println(altura);
                System.out.println(profundidade);
                System.out.println(largura);
                System.out.println(volume);
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro valor
            case 4:
                double valorBase= 25;
                double valorMaiorQueDobro= 40;

                System.out.println(valorBase);
                System.out.println(valorMaiorQueDobro);

                if(valorMaiorQueDobro>(valorBase*2)){
                    System.out.println("O valor secundário é maior que o dobro do primeiro valor");
                }
                else{
                    System.out.println("O valor não é maior que o dobro do primeiro valor");
                }
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                // bhaskara(int a, int b, int c);
                break;
            case 6:
                double distancia= 433;
                double tempo= 10.50;
                double mediaViagem= (distancia/tempo);
                System.out.println(distancia);
                System.out.println(tempo);
                System.out.println(mediaViagem);
                break;
            case 7:
                double faturamento= 1000.99; 
                double qtdImposto= 10;
                double percentualImposto= ((faturamento*qtdImposto)/100);
                System.out.println(faturamento);
                System.out.println(qtdImposto);
                System.out.println(percentualImposto);
                break;
            case 8:
                int parOuImpar= 121;

                if((parOuImpar%2)==0){
                    System.out.println("Este valor é par");
                }else{
                    System.out.println("Este valor é impar");
                }
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(
                    String stringUm= "C";
                    String stringDois= "C++"; 
                    System.out.println("A linguagem " +stringUm +" é igual a linguagem " +stringDois +" ?:");
                    System.out.println("Resposta: "+stringUm.equals(stringDois));
                    System.out.println();
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta seu valor para inteiro
            case 10:
                Double Val= 99.10;
                int convertString= Integer.parseInt(Val);
                System.out.println(Val);
                System.out.println(convertString);

                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:
            // Base                     | Alíquota
            // ---------                | ------
            // Até 1.903,98             | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68        | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return 0;
    }

    public static double area(double ladoUm, double ladoDois) {
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        return false;
    }

    public static double[] bhaskara(int a, int b, int c) {
        return new double[2];
    }

    public static double mediaViagem(double distancia, double tempo) {
        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        return 0;
    }

    public static boolean parOuImpar(int valor) {
        return false;
    }

    public static boolean compareString(String stringUm, String stringDois) {
        return false;
    }

    public static int convertString(String valor) {
        return 0;
    }

    public static double percentualImpostoSalario(double salario) {
        return -1;
    }

    public static boolean testePrimo(int valor) {
        return false;
    }

}