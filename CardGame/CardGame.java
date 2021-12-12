package CardGame;

public class CardGame {
    public void play(SimpleStack<Integer> p1, SimpleStack<Integer> p2){
        boolean end = false;
        for (int i = 0; i < 106; i++){
            if ((p1.peek() > p2.peek() && !(p1.peek() == 9 && p2.peek() == 0)) || (p1.peek() == 0 && p2.peek() == 9)){
                p1.push(p1.peek());
                p1.push(p2.peek());
            } else if ((p1.peek() < p2.peek() && (p1.peek() == 9 && p2.peek() == 0)) || !(p1.peek() == 0 && p2.peek() == 9)){
                p2.push(p1.peek());
                p2.push(p2.peek());
            }

            p1.pop();
            p2.pop();

            if (p1.size() == 0){
                System.out.println("Second won");
                System.out.println("Количество ходов - " + (i+1));
                end = true;
                break;
            }
            if (p2.size() == 0){
                System.out.println("First win");
                System.out.println("Количество ходов - " + (i+1));
                end = true;
                break;
            }
        }
        if (!end){
            System.out.println("botva");
        }
    }
}
