import java.util.Scanner;

public class CalculadoraPintura4261213239{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // New achivment unlocked
        // Nova Descoberta: o Final antes do double, indica que e uma variavel imutavel 
        // por isso tb a variavel ta em maiusculo, para deixar que ela não vai mudar

        final double ALTURA_PAREDE= 2.7; // e a altura que o exercicio da q e o "limite"
        final double RENDIMENTO_LITRO = 10.0; // aq eu travo q o litro rende 10 metros quadrados
        final double DESCONTO_ABERTURAS = 0.10;// aq e os 10% a menos la

        // mini introdução ux btw

        System.out.println("====  Bem vindo Ao programa X  ====");
        System.out.println("O programa X SERVE PARA Calcular quantidade de tinta necessária para 4 paredes de um comodo com 4 paredes");
        System.out.println("Regras: será sempre debitado 10% da área do quarto afim de janela e porta,");
        System.out.println("        O programa usa a área de quatro paredes iguals, e necessário que seja um quarto quadrado perfeito. ");

        System.out.println("Iniciando programa ...");
        System.out.println("...");
        System.out.println(" ======================================================");

        System.out.println("Insira aqui a medida de um lado do quarto ( altura padrão de tero 2.70 m ) : ");
        double lado = sc.nextDouble(); // lendo oque o usuario digita e colocando na variavel comum LADO
        sc.nextLine();// limpando o buffer pra pegar bons modos

        double areaUmaParede = lado * ALTURA_PAREDE; // calculando a área de uma unica parede

        double areaTotalParedes = areaUmaParede * 4; // para achar de todas, e so multiplicar por 4 visto q todas são iguais

        double areaLiquida = areaTotalParedes * (1 - DESCONTO_ABERTURAS); // aq e liquida ou seja, isso serve para mostrar que 1 - 0.10 e a msm coisa q o total menos o desconto

        double litrosNecessarios = areaLiquida / RENDIMENTO_LITRO; // dividindo para descobrir quantos l de tinta tem q ter para pintar a parede

        // entrega: 
        System.out.println(" --- Resumo do orçamento ---");
        System.out.printf("Area bruta das Paredes ( forma individual) : %.2f m²\n ", areaUmaParede);
        System.out.printf("Area de todas as paredes que vai ser pintada ( conjuntas - 10%  ): %.2f m² \n", areaLiquida);
        System.out.printf("A quantidade de L necessária foi de: %.2f Litros\n", litrosNecessarios);
        System.out.println(" ==============================");

        sc.close(); // fechando o scanner para economizar ram e criar bons modos

    }
}