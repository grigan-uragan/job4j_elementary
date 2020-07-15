package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
         if (question == null) {
             return "Please, ask your question! ";
         } else if (question.equals("Привет, Бот.")) {
             return "Привет, умник.";
         } else if (question.equals("Пока.")) {
             return "До скорой встречи.";
         } else {
             return "Это ставит меня в тупик. Задайте другой вопрос.";
         }
    }

    public static void main(String[] args) {
        System.out.println(answer(null));
        System.out.println(answer("Привет, Бот."));
        System.out.println(answer("Как дела?"));
        System.out.println(answer("Пока."));
    }
}
