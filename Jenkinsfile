@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*
import com.archive.*

mode = params.mode.toLowerCase()
def sut = params.serviceName
def env = params.env

def debug=false

agit = new gitIt()
builder = new gradleIt()
reporter = new reportIt()
arch = new archiveIt()

node ("windows") {	

	stage ("init") {
		deleteDir()
	}

	stage ("checkoutTests") {
		agit.checkOutTestAutomation ()
	}

	stage ("runTests-"+sut) {
		serviceRef ="https://github.aig.net/commercial-it-global-delivery/ael-policy-autobooker-test-automation-5416.git";
		targetDir = "myAcceptanceTests"
		builder.test (serviceRef, targetDir)
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