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

gifRef ="https://github.aig.net/commercial-it-global-delivery";
servicePre="ael-policy-";
servicePost="-5416.git";

serviceRef ="autobooker-test-automation";
serviceRef2 ="autobooker"; // ael-policy-autobooker-5416
serviceRef3 ="transformation-service";
serviceRef4 ="data-service";
serviceRef5 ="application-service";
serviceRef6 ="client-service";
serviceRef7 ="agent-api-service";
serviceRef8 ="rule-cache-service";

//servicePack = [serviceRef, serviceRef2 ]
servicePack = [serviceRef2 ]

for (String service  : servicePack) {

	node ("windows") {	

		// For each new service repeat!!!	
		aservice = service
		aserviceRef = gifRef + "/" + servicePre + service + servicePost
		println "INF: New Service To Test " + aservice
		println "INF: New Service Ref " + aserviceRef
		
		deleteDir()
							
		stage ("coTests") {
			targetDir = "myAcceptanceTests"
			agit.checkOutTestAutomation (aserviceRef, targetDir)
		}
							
		stage ("exeTest-"+aservice) {
			builder.test (targetDir)
		}
							
		stage ("report") {
			targetDir = "myAcceptanceTests"
			reporter.test (targetDir)
		}
							
		stage ("archive") {
			targetDir = "myAcceptanceTests/build/report/**"
			arch.archive (targetDir)
		}
	}

}