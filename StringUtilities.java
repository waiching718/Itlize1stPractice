
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        
        return baseValue.concat(valueToBeAdded);
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuilder sb = new StringBuilder();
        for(int i =valueToBeReversed.length()-1; i>=0;i--){
            sb.append(valueToBeReversed.charAt(i));
        }
        return sb.toString();
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int mid = word.length() / 2;
        return word.charAt(mid);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String ret = "";
        char[] ls = value.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char ch: ls){
        	if(ch != charToRemove){
        		sb.append(ch);
        	}
        }

        ret = sb.toString();

        return ret;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        int len= sentence.length();
        String str= " ";
        for(int i=len-1;i>0;i--){
            if(sentence.charAt(i)==' '){
                
                str = sentence.substring(i+1);
                break;
            }
            
        }
        
        return str;
    }
}
