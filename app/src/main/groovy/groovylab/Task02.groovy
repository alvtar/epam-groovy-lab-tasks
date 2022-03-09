/**
Return a list of input elements, where odd numbers are multiplied by 3 and even
numbers by 2. Example:
Task02.mulEvenOdd([4,5,6]) == [8,15,12]
*/
package groovylab

class Task02 {

    static List mulEvenOdd(List l) {
        l.eachWithIndex { i, index -> ((i % 2) == 0) ? (l[index] *= 2) : (l[index] *= 3) }
        return l
    }

}
