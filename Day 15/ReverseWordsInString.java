package july2020;

public class ReverseWordsInString {
	
	public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer strBuffer = new StringBuffer();
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].isEmpty()){
              strBuffer= strBuffer.append(str[i]);
              strBuffer.append(" "); 
            }
 
        }
        return strBuffer.toString().trim();
    }

}
