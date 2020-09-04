package sorting

import spock.lang.Specification

class SortTest extends Specification {

    def 'Test sorting scenarios'(Sort<Integer> sortAlgorithm, Integer[] data, Integer[] expectedResult) {
        given:

        when:
        def sortedArray = sortAlgorithm.sort(data)
        def sortedList = sortAlgorithm.sort(data.toList())

        then:
        expectedResult == sortedArray
        expectedResult.toList() == sortedList

        where:
        sortAlgorithm   | data  | expectedResult
        new BubbleSort()  | []   | []
    }

}
