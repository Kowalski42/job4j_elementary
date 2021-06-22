package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            result = post[post.length - index - 1] == word[word.length - index - 1];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
