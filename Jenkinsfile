@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*
import com.archive.*

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
	ArrayList<ArrayList<String>> servicesPack = new ArrayList<ArrayList<String>>();
	ArrayList<String> serviceItemBR = new ArrayList<String>();
	serviceItemBR.add("BR");
	serviceItemBR.add("BR-Ref");
	servicesPack.add(serviceItemBR);
	ArrayList<String> serviceItemApp = new ArrayList<String>();
	serviceItemBR.add("App");
	serviceItemBR.add("App-Ref");
	servicesPack.add(serviceItemApp);

	for (ArrayList<String> services : servicesPack) {
		println "INF: Service Name " + services.get(0)
		println "INF: Service Ref " + services.get(1)
		
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
}