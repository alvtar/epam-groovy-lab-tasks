/**
Find all adults in the input map and return them as map. Example:
Task06.adults([Kate: 24, Alan:16, Osvald: 18]) == [Kate: 24, Osvald: 18]
*/
package groovylab

class Task06 {

    static Map adults(Map people) {
        Map adultsPeople = [:]
        people.each { key, value -> (value >= 18) ? adultsPeople.put(key, value) : '' }
        return adultsPeople
    }

}
