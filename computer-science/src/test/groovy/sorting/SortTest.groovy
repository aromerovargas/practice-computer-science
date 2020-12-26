package sorting

import spock.lang.Specification

class SortTest extends Specification {

    def 'Test sorting scenarios'(Sort<Integer> sortAlgorithm, Integer[] data, Integer[] expectedResult) {
        given:

        when:
        def sortedArray = sortAlgorithm.sort(data)

        then:
        expectedResult == sortedArray

        where:
        sortAlgorithm   | data  | expectedResult
        new BubbleSort()  | [] | []
        new BubbleSort()  | [2]   | [2]
        new BubbleSort()  | [1,2,3]   | [1,2,3]
        new BubbleSort()  | [1,2,3,4,5,6,7,8,9]   | [1,2,3,4,5,6,7,8,9]
        new BubbleSort()  | [2,1]   | [1,2]
        new BubbleSort()  | [3,2,1]   | [1,2,3]
        new BubbleSort()  | [3,2,1,3]   | [1,2,3,3]
    }

}
