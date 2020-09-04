package test.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.DummyBot;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.answer("Привет, Бот."),
                is("Привет, умник.")

        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.answer("Пока."),
                is("До скорой встречи.")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.answer("How are you?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }

    @Test
    public void whenNoQuestion() {
        assertThat(
                DummyBot.answer(null),
                is("Please, ask your question! ")
        );
    }
}