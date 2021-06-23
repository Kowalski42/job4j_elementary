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

        //2й вариант
        /*int index = 0;
        while (post[post.length - index - 1] == word[word.length - index - 1]) {
            index++;
            if (post.length - index - 1 == 0) {
                return true;
            }
        }
        return false;*/
        //1й вариант
        /*boolean result = true;
        for (int index = 0; index < post.length; index++) {
            result = post[post.length - index - 1] == word[word.length - index - 1];
            if (!result) {
                break;
            }
        }
        return result;*/
    }
}
