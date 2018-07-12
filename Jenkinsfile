@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*
import com.archive.*

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
	servicesPack = [
		br :  ["br", serviceRef]
	]
	for ( serviceItem in servicesPack ) {
		println "INF: New Service Test " + serviceItem.value

		serviceItem.value.list.each  {
			println "INF: Service Item " + it 
			deleteDir()
		
			//		stage ("coTests") {
			//			targetDir = "myAcceptanceTests"
			//			agit.checkOutTestAutomation (serviceItem, targetDir)
			//		}
			//
			//		stage ("exeTest-"+sut) {
			//			builder.test (targetDir)
			//		}
			//
			//		stage ("report") {
			//			targetDir = "myAcceptanceTests"
			//			reporter.test (targetDir)
			//		}
			//
			//		stage ("archive") {
			//			targetDir = "myAcceptanceTests/build/report/**"
			//			arch.archive (targetDir)
			//		}
		}
	}
}