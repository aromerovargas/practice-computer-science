package sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sorter {

  public Sort<Integer> bubbleSort = new BubbleSort();

  public static void main(String[] args){
    Sorter sorter = new Sorter();
    sorter.runSorting(sorter.bubbleSort);
  }

  public void runSorting(Sort<Integer> sorter) {
    Integer[] elements = {5,3,6,7,1,2};
    Integer[] result = sorter.sort(elements);

    String resultStr = Arrays.stream(result).map(value ->  value.toString()).collect(Collectors.joining(", "));
    System.out.println(resultStr);
  }

}
