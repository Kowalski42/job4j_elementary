package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        //3й вариант без boolean result
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - index - 1] != word[word.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}
