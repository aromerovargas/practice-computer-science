import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateElements {


  public static Integer[] rotateToRight(Integer[] arr, int times){
    times = times % arr.length;
    Integer[] result = new Integer[arr.length];
    for (int i = 0 ; i < arr.length; i++){
      int pos = -1;
      if((i + times) >= arr.length){
        pos = i + times - arr.length;
      }
      else{
        pos = i + times;
      }
      result[pos] = arr[i];
    }

    return result;
  }

  public static void main(String[] args){
    Integer[] array = {1, 2, 3, 4};

    Integer[] result = RotateElements.rotateToRight(array, 5);
    String resultTxt = Stream.of(result).map(val -> val + "").collect(Collectors.joining(", "));
    System.out.println("Resultado -> ");
    System.out.println(resultTxt);
  }
}
