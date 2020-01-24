 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int temp = number;
          while(number!=1){
              number--;
              temp = temp*number;
          }
          return temp;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
         StringBuilder sb = new StringBuilder();
     	sb.append(Character.toUpperCase(phrase.charAt(0)));
      	for(int i=0;i<phrase.length();i++){
        	if(phrase.charAt(i)== ' '){
        		int index = ++i;
           		sb.append(Character.toUpperCase(phrase.charAt(index)));
        	}
        }
      	
      	return sb.toString();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
              char[] shift = word.toCharArray();
              
              for (int i = 0; i < shift.length; i++) {
       
                   if(26 - shift[i]>=2){
                       int tmp = 26 -i;
                    shift[i] = (char)('a'+ tmp);
                    }
                    else{
                    shift[i] += 3;
                    }
        
              }
              word = String.valueOf(shift);
              
              return word;
      }
}
