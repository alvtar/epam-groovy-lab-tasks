/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/
package groovylab

class Task08 {

    static String parseAndFilterJson(String input) {
        def inputJson = new groovy.json.JsonSlurper().parseText(input)
        def result = inputJson.findAll { (it.value.toString()[0] as int) + (it.value.toString()[1] as int) == 9 }
        return groovy.json.JsonOutput.toJson(result)
    }

}
