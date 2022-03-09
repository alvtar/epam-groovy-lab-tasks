/**
Define, whether input string have a Ip format. Example:
Task05.isIp("10.0.152.164") == true
*/
package groovylab

class Task05 {

    static boolean isIp(String ip) {
        return ip ==~ /^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\.(?!$)|$)){4}$/
        // return ip ==~ /^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$/
        // return ip ==~ /^((25[0-5]|(2[0-4]|1\d|[1-9]|)\d)(\.(?!$)|$)){4}$/
    }

}
