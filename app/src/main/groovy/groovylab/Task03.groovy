/**
Define, whether second list sublist of the first list. Example:
Task03.isSublist([1,2,3], [2,3]) == true
*/
package groovylab

class Task03 {

    static boolean isSublist(List a, List b) {
        return a.intersect(b)
    }

}
