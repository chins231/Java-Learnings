package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsFilterNull {

	public static void main(String[] args) {
		//List<String> list =new ArrayList<String>();
		List<String> list =Arrays.asList("HIU","Chins",null,"Great","NULL");
		System.out.println(list);
		List<String> updatedList=list.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(updatedList);
		System.out.println(list.stream().findFirst());
		List<String> updatedList1=list.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println(updatedList1);
		List<String> updatedList2=list.stream().map(str->str).filter(str->str!=null).collect(Collectors.toList());
		System.out.println(updatedList2);
	}

}
