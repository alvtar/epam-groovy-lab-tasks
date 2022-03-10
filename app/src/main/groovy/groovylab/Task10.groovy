/**
Perform a HTTP request to the address, specified in function and return text
output. Example:
Task10.urlText("http://httpstat.us/200") == "200 OK"
*/
package groovylab

class Task10 {

    static String urlText(String url) {
        url.toURL().text
    }

}
