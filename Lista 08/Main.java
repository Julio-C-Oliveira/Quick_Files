import animais.Animal;
import animais.Mamifero;
import animais.Peixe;
import java.util.Scanner;
import pokemon.Tipo;
import pokemon.Status;
import pokemon.Move;
import pokemon.Especie;

public class Main {
    public static void main(String[] args) {
        // Questão 03:
        System.out.println("----------------------");
        Animal animal = new Animal("Camelo", 1.5f, 4, "Amarelo", "Terra", 2.0f);
        System.out.println(animal.toString());
        System.out.println("----------------------");
        Mamifero mamifero = new Mamifero("Urso", 1.8f, 4, "Vermelho", "Terra", 0.5f, "Mel");
        System.out.println(mamifero.toString());
        System.out.println("----------------------");
        Peixe peixe = new Peixe("Tubarão", 3.0f, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        System.out.println(peixe.toString());
        System.out.println("----------------------");

        // Questão 04:
        Utilitarios.escolherIngresso(new Scanner(System.in), 15.0f, 10.0f, 10.0f, "Bloco 01", "Bloco 02");

        Move move1 = new Move(
            (short) 10,
            "Choque do Trovão",
            (byte) 5,
            Tipo.ELETRICO
        );
        Move move2 = new Move(
            (short) 5,
            "Investida",
            (byte) 15,
            Tipo.NORMAL
        );
        Move move3 = new Move(
            (short) 2,
            "Cauda de Ferro",
            (byte) 20,
            Tipo.PEDRA
        );
        Move[] moveSet = {move1, move2, move3};
        // Questão 05:
        Especie pikachu = new Especie(
            (short) 11,
            (short) 8,
            Status.NORMAL,
            (short) 20,
            moveSet,
            "Pikachu",
            (short) 25,
            (short) 12,
            (short) 17,
            Tipo.ELETRICO,
            Tipo.NORMAL
        );
        System.out.println(pikachu);
    }
}