import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//          Zadanie jest symulacją planszy do gry.
//        Board - plansza - posiada listę wierszy (Row)
//        Row - wiersz - posiada listę pól (Field)
//        Field - posiada symbol
//        Napraw kod tak, aby po wpisaniu rozmiaru tablicy 3 na konsoli pojawiło się:
//          _ _ _
//          _ _ _
//          _ _ _

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak duża tablica?");
        int size = scanner.nextInt();

        Board board = new Board();
        board.initialize(size);

        board.show();
    }
}
