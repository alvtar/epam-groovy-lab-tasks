/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/
package groovylab

class Task07 {

    static String encryptThis(String s) {
        List s2 = s.split(' ').collect { (int) it[0] + it[-1..1] }
        return s2.join(' ')
    }

}
