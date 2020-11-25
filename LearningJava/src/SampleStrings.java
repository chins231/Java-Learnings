
public class SampleStrings {

	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		//String s ="abcbcdef";
  
		// ababcbaca defegde hijhklij

		// String s = "abcadefd";

		// String s = "abcdadeedekkok";

       

		for (int i = 0; i < s.length(); i++) {

			int fIndex = s.indexOf(s.charAt(i), i);

			int lIndex = s.lastIndexOf(s.charAt(i));

			int finalIndex = lIndex;



			String result = s;// s.substring(fIndex,lIndex+1);
			System.out.println(result);

			/*

			 * for(int j=lIndex,k=0;j<s.length()&& k<result.length();j++,k++) { lIndex =

			 * s.lastIndexOf(result.charAt(k)); } if(finalIndex<lIndex) finalIndex = lIndex;

			 */



			for (int j = fIndex + 1; j < s.length(); j++) {

				lIndex = s.lastIndexOf(s.charAt(j));

			}

			if (finalIndex > lIndex)

				finalIndex = lIndex;



			System.out.println(s.substring(fIndex, finalIndex + 1));



			i = finalIndex;



			/*

			 * int key = lIndex; for(int j=lIndex;j<s.length();j++) {

			 * if(key<s.lastIndexOf(s.charAt(j))) lIndex = s.lastIndexOf(s.charAt(j)); }

			 */

		}


	}

}
