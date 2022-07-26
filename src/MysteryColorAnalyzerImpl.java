import java.util.List;

/**
 * This class contains the necessary methods to meet the requirements.
 *
 * <p>
 *     This class implements two methods of MysteryColorAnalyzer.
 * </p>
 *
 * @see MysteryColorAnalyzer
 * @author LeonardoHerrera
 */
public class MysteryColorAnalyzerImpl implements MysteryColorAnalyzer{

    /**
     * This method will determine how many distinct colors are in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the number of distinct colors
     * @return number of distinct colors
     */
    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        int distinctColors = 0;
        boolean foundRed = false;
        boolean foundBlue = false;
        boolean foundGreen = false;
        for(Color color : mysteryColors) {
            if(!foundRed){
                if(color == Color.RED) {
                    distinctColors++;
                    foundRed = true;
                }
            }
            if(!foundBlue){
                if(color == Color.BLUE) {
                    distinctColors++;
                    foundBlue = true;
                }
            }
            if(!foundGreen){
                if(color == Color.GREEN) {
                    distinctColors++;
                    foundGreen = true;
                }
            }
        }

        return distinctColors;
    }

    /**
     * This method will count how often a specific color is in the given list
     *
     * <p>
     * Colors are defined via the {@link Color} enum.
     * </p>
     *
     * @param mysteryColors list of colors from which to determine the count of a specific color
     * @param color color to count
     * @return number of occurrence of the color in the list
     */
    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int appearanceNumber = 0;
        for (Color currentColor: mysteryColors) {
            if(currentColor == color) {
                appearanceNumber++;
            }
        }
        return appearanceNumber;
    }
}
