/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/
package groovylab

class Task04 {

    static int fib(int n) {
    int a = 0, b = 1
      n.times { // times is used to for looping n times
       (a, b) = [b, a + b] // groovy way of multiple assignment where a is assigned b and b is assigned  a + b
      }
      return a
    }

}
