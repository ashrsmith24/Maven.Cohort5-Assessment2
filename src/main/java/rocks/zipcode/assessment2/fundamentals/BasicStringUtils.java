package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder stringBuilder = new StringBuilder(string1);
        stringBuilder.reverse();
        String result = stringBuilder.toString();
        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {

        String string1Revs = reverse(string1);
        String string2Revs = reverse(string2);
        String result = concatentate(string1Revs,string2Revs);
        return result;
    }
    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
       char[] array = charactersToRemove.toCharArray();
       for(int i = 0 ; i < array.length; i++){
           char characterToRemove = array[i];
           String characterToRemoveAsString = "" + charactersToRemove;
           string = string.replaceAll(charactersToRemove, "");

       }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedChar = removeCharacters(string, charactersToRemove);
        String result = reverse(removedChar);
        return result;
    }
}
