import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> values = Arrays.asList(7, 3, 9, 3, -2, 10, 7, 4);
        List<String> lines = Arrays.asList("java", "stream", "lambda", "jvm", "", "kotlin");
        int[] mixed = {11, -4, 8, 15, 0, 6};
        int[] onlyOdd = {1, 7, 13};

        System.out.println("\tЧисла: " + values);
        System.out.printf("Среднее значение: %.3f%n", StreamFunc.avg(values));
        System.out.println("Квадраты уникальных: " + StreamFunc.sqrOfUniq(values));
        System.out.println("Последний элемент: " + StreamFunc.last(values));

        System.out.println();
        System.out.println("\tСтроки: " + lines);
        System.out.println("Верхний регистр + префикс: " + StreamFunc.upperCaseWithPrefix(lines));
        System.out.println("Map по первому символу: " + StreamFunc.toAlphaMap(lines));

        System.out.println();
        System.out.println("\tСумма чётныx:");
        System.out.println(Arrays.toString(mixed) + " -> " + StreamFunc.sumOfEven(mixed));
        System.out.println(Arrays.toString(onlyOdd) + " -> " + StreamFunc.sumOfEven(onlyOdd));

        System.out.println();
        System.out.println("\tПустая коллекци:");
        try
        {
            StreamFunc.last(new ArrayDeque<String>());
        } catch (NoSuchElementException ex)
        {
            System.out.println("Ex: " + ex.getMessage());
        }
    }
}
