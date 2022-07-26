import java.util.ArrayList;
import java.util.List;

/**
 * This is the main class.
 *
 * @author Leonardo Herrera
 */
public class Main {
    public static void main(String[] args) {
        List<Color> list1 = new ArrayList<>(List.of(Color.RED, Color.BLUE, Color.GREEN));
        List<Color> list2 = new ArrayList<>(List.of(Color.RED, Color.RED, Color.BLUE, Color.BLUE, Color.GREEN, Color.GREEN));
        List<Color> list3 = new ArrayList<>(List.of(Color.RED, Color.RED, Color.BLUE, Color.BLUE, Color.BLUE));

        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();

        System.out.println("\nNumber of distinct colors: " + mysteryColorAnalyzer.numberOfDistinctColors(list1));
        System.out.println("Number of appearances: " + mysteryColorAnalyzer.colorOccurrence(list1, Color.RED));
        System.out.println("\nNumber of distinct colors: " + mysteryColorAnalyzer.numberOfDistinctColors(list2));
        System.out.println("Number of appearances: " + mysteryColorAnalyzer.colorOccurrence(list2, Color.BLUE));
        System.out.println("\nNumber of distinct colors: " + mysteryColorAnalyzer.numberOfDistinctColors(list3));
        System.out.println("Number of appearances: " + mysteryColorAnalyzer.colorOccurrence(list3, Color.GREEN));
    }
}
