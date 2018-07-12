@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*
import com.archive.*
import groovy.json.*;
import java.util.ArrayList;
import java.util.List;

mode = params.mode.toLowerCase()
def sut = params.sut
def env = params.env

def debug=false

agit = new gitIt()
builder = new gradleIt()
reporter = new reportIt()
arch = new archiveIt()

node ("windows") {	

	// For each new service repeat!!!	
	serviceRef ="https://github.aig.net/commercial-it-global-delivery/ael-policy-autobooker-test-automation-5416.git";
		
//		for (String service  : services) {
//			println "INF: New Service Test " + service
//			println "INF: New Service Test " + service
//			
////			deleteDir()
////					
////			stage ("coTests") {
////				targetDir = "myAcceptanceTests"
////				agit.checkOutTestAutomation (serviceItem, targetDir)
////			}
////					
////			stage ("exeTest-"+sut) {
////				builder.test (targetDir)
////			}
////					
////			stage ("report") {
////				targetDir = "myAcceptanceTests"
////				reporter.test (targetDir)
////			}
////					
////			stage ("archive") {
////				targetDir = "myAcceptanceTests/build/report/**"
////				arch.archive (targetDir)
////			}
//		}

}
class JsonToObject {

    public static void main(String[] args) {

        // Person object

        def person = new Person(firstName: "John", lastName: "Doe")

        // Json String

        def personJSON = new JsonBuilder(person).toPrettyString()

        // Json String to Map

        def personMap = new JsonSlurper().parseText(personJSON)

        // using Map to convert to Person object type

        def newPerson = new Person(personMap)

        println(person)

        println(newPerson)

        assert newPerson.firstName.equals(person.firstName)

        assert newPerson.lastName.equals(person.lastName)

    }

}

class Person {  

    String firstName

    String lastName

}