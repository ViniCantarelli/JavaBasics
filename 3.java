import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      int x=2, y=3;
      

    //Questão 1
      System.out.println("Questão 1:");
    // Letra a
      System.out.printf("x = %d\n", x);

    // Letra b
      System.out.printf("O valor de %d + %d é igual a %d\n", x, x, (x+x));

    // Letra c
      System.out.printf("x=");
      System.out.printf("\n");

    // Letra d
      System.out.printf("%d = %d\n", (x+y), (y+x));

    //Questão 3
      System.out.println("Questão 3:");
    //Letra a
      System.out.println("1 2 3 4");
    //Letra b
      System.out.print("1 ");
      System.out.print("2 ");
      System.out.print("3 ");
      System.out.print("4 ");

      System.out.println();
    //Letra c
      System.out.printf("%d %d %d %d\n", 1, 2, 3, 4);
      
      System.out.println();

    //Questão 4: Imprime uma árvore de Natal com *, uma linha abaixo da outra
      System.out.println("Questão 4:");
      System.out.printf("\n*\n*\n***\n");

      System.out.println();
    //Questão 5: Imprime uma imagem semelhante a um triângulo com *, uma linha abaixo da outra
      System.out.println("Questão 5:");
      System.out.println("*");
      System.out.println("*");
      System.out.println("***");
      System.out.println("**");
      System.out.println("**");

      System.out.println();
    //Questão 6: Imprime uma imagem semelhante a um tronco de triângulo com *, as linhas com printf ficam ao lado da próxima
      System.out.println("Questão 6:");
      System.out.print("*");
      System.out.println("*");
      System.out.println("***");
      System.out.print("**");
      System.out.println("**");

      System.out.println();
    //Questão 7: Imprime uma árvore de Natal com *, uma linha abaixo da outra, semelhante as questões 4 e 5
      System.out.println("Questão 7:");
      System.out.printf("%s\n%s\n%s\n", "", "*", "**");
      
      System.out.println();
    //Questão 8: Imprime todos os * em uma única linha
      System.out.println("Questão 8:");
      System.out.print("*");
      System.out.print("*");
      System.out.print("***");
      System.out.print("**");
      System.out.println("**");
      
      }
}
