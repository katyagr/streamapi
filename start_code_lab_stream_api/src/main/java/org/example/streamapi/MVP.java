package org.example.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MVP {

    /*
        Convert a List<String> to an object stream and for each element -> System,out.println.
     */

    public void printNames(List<String> names) {
        names.forEach(n -> System.out.println(n));
    }

    /*
        Given a List<Integers>, return a List<Integer> with event numbers.
     */
    public List<Integer> returnEvenNumbers(List<Integer> numbers) {
        numbers = numbers
                        .stream()
                        .filter(n -> n % 2 == 0)
                        .toList();
        return numbers;
    }

    /*
        Given an int [], double the value of each int and return an int [].
    */
    public int[] doubleInts(int[] numbers) {
        numbers = Arrays.stream(numbers)
                        .map(n -> n*2)
                        .toArray();
        return numbers;
    }

    /*
        Given a String, return a List<String>, all caps.
     */
    public List<String> splitToAllCapsList(String input) {
        Stream<String> stream = Arrays.stream(input.split( "" ));
        stream = stream
                .map(c -> c.toUpperCase());
        List<String> list = stream.toList();
        return list;
    }

    /*
    Given a list of animals:
     - filter the ones that start with a given letter
     - return sorted List<String>, all caps.
    */
    public List<String> filterByFirstLetterAndOrder(List<String> list, String letter) {
        list = list
                .stream()
                .filter(a -> a.startsWith(letter))
                .map(a -> a.toUpperCase())
                .sorted()
                .toList();
        return list;
    }

    /*
        Given a list of words, return elements that:
         - are shorter than the given number and
         - start with a given letter.
    */
    public List<String> filterWords(List<String> words, int maxLength, String firstLetter) {
        words = words
                .stream()
                .filter(w -> w.length() < maxLength)
                .filter(w -> w.startsWith(firstLetter))
                .toList();
        return words;
    }
}