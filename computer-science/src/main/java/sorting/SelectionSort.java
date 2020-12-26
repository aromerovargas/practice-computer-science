package sorting;

/**
 * https://www.geeksforgeeks.org/insertion-sort
 *
 * Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part.
 * Algorithm
 * To sort an array of size n in ascending order:
 * 1: Iterate from arr[1] to arr[n] over the array.
 * 2: Compare the current element (key) to its predecessor.
 * 3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.
 */
public class SelectionSort implements Sort<Integer>
{

  @Override
  public Integer[] sort(Integer[] elements) {
    for(int orderedIndex = 0 ; orderedIndex <= elements.length ; orderedIndex++){
      int minValue = elements[orderedIndex];
      for(int index = orderedIndex, adjacent = index +1; adjacent <= 0 ; index++, adjacent++){
        if(elements[index] > elements[adjacent]){
          int temp = elements[adjacent];
          elements[adjacent] = elements[index];
          elements[index] = temp;
        }
      }
    }
    return elements;
  }

}
