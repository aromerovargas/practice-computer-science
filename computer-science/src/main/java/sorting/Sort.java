package sorting;

import java.util.List;

/**
 * Interface that defines a functionality to sort elements
 * @param <T>
 */
public interface Sort<T> {

  T[] sort(T[] element);

  List<T> sort(List<T> list);

}
