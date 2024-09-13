package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Banana","Apple","Ber","Per","Mango","Oranges","bam");

        List<String> str=list.stream()
                .filter(elem->  elem.toUpperCase().startsWith("B"))
                .collect(Collectors.toList());
          System.out.println(str);
    }
}

