package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] words = {'w', 'o', 'r', 'l', 'd'};
        char[] prefix = {'w', 'o', 'r'};
        boolean result = ArrayChar.startsWith(words, prefix);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] words = {'w', 'o', 'r', 'l', 'd'};
        char[] prefix = {'W', 'o', 'r'};
        boolean result = ArrayChar.startsWith(words, prefix);
        assertThat(result, is(false));
    }
}