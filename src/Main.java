import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {


        DataBase text = new DataBase("Words.txt");

        System.out.println(BotLogic.PrintHelp());// ф-я, которая возвращает строку со справкой

        Dialog dialog = new Dialog(); // ф-я, создающая объект класса Dialog

        Scanner console = new Scanner(System.in);

        while(true) {
            while (dialog.IsActive()) {
                String userMessage = console.nextLine(); // читаем с консоли сообщение пользователя
                String botMessage = BotLogic.GetAnswer(userMessage, dialog); // генерим сообщение бота и выводим сообщение
            }
        }
    }
}
