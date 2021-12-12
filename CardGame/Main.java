package CardGame;

import java.util.Scanner;

public class Main extends  CardGame{
    public static void main(String[] args){
        CardGame game = new CardGame();
        Scanner scanner = new Scanner(System.in);
        SimpleStack p1 = new SimpleStack();
        SimpleStack p2 = new SimpleStack();

        System.out.println("Введите 5 карт первого игрока: ");
        for (int i = 0; i < 5; i++){
            p1.push(scanner.nextInt());
        }

        System.out.println("Введите 5 карт второго игрока: ");
        for (int i = 0; i < 5; i++){
            p2.push(scanner.nextInt());
        }
        game.play(p1, p2);
    }
}