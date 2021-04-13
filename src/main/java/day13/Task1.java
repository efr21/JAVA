package day13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Как дела?");
        user2.sendMessage(user1, "Приветик!");
        user2.sendMessage(user1, "Хорошо!");
        user2.sendMessage(user1, "А у тебя?");
        user3.sendMessage(user1, "эээй!");
        user3.sendMessage(user1, "Hello!");
        user3.sendMessage(user1, "Что делаешь?");
        user1.sendMessage(user3, "Здорова!");
        user1.sendMessage(user3, ":)");
        user1.sendMessage(user3, "Все норм! А у тебя?");
        user3.sendMessage(user1, "Все хорошо:))");


        MessageDatabase.showDialog(user1, user3);

    }
}
