import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ConsultaMoeda consultaMoeda = new ConsultaMoeda();
        Moeda novaMoeda = consultaMoeda.buscaMoeda("USD");

        boolean continuar = true;

        while (true){
            System.out.println("***************************************");
            System.out.println("Seja bem vindo/a ao Converor de Moeda");
            System.out.println("");

            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar");
            System.out.println("5) Dólar =>> Peso colonbiano");
            System.out.println("6) Peso colonbiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida");
            System.out.println("***************************************");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1 : {
                    System.out.println("Digite o valor em Dólar:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("ARS");
                    if (taxa != null){
                        double convertido = valor * taxa;
                        System.out.printf("Valor convertido: %.2f ARS%n", convertido);
                    } else {
                        System.out.println("Taxa de conversão para ARS não encontrada.");
                    }
                    break;
                }
                case 2 : {
                    System.out.println("Digite o valor em Peso Argentino:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("ARS");
                    if (taxa != null){
                        double convertido = valor / taxa;
                        System.out.printf("Valor convertido: %.2f USD%n", convertido);
                    }else {
                        System.out.println("Taxa de conversão para ARS não encontrada.");
                    }
                    break;
                }
                case 3 : {
                    System.out.println("Digite o valor em Dólar:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("BRL");
                    if (taxa != null){
                        double convertido = valor * taxa;
                        System.out.printf("Valor convertido: %.2f BRL%n", convertido);
                    }else {
                        System.out.println("Taxa de conversão para BRL não encontrada.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Digite o valor em Real:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("USD");
                    if (taxa != null){
                        double convertido = valor / taxa;
                        System.out.printf("Valor convertido: %.2f USD%n", convertido);
                    } else {
                        System.out.println("Taxa de conversão para BRL não encontrada.");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Digite o valor em Dólar:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("COP");
                    if (taxa != null) {
                        double convertido = valor * taxa;
                        System.out.printf("Valor convertido: %.2f COP%n", convertido);
                    } else {
                        System.out.println("Taxa de conversão para COP não encontrada.");
                    }
                    break;
                }
                case 6: {
                    System.out.println("Digite o valor em Peso Colombiano:");
                    double valor = scanner.nextDouble();
                    Double taxa = novaMoeda.getConversion_rates().get("COP");
                    if (taxa != null) {
                        double convertido = valor / taxa;
                        System.out.printf("Valor convertido: %.2f USD%n", convertido);
                    } else {
                        System.out.println("Taxa de conversão para COP não encontrada.");
                    }
                    break;
                }
                case 7: {
                    System.out.println("Saindo do programa. Até logo!");
                    continuar = false;
                    break;
                }
                default: {
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
                }

            }
        }

    }
}