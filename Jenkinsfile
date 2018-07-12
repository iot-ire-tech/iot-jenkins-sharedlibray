@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*

mode = params.mode.toLowerCase()
def sut = params.serviceName
def env = params.env

def debug=false



node ("windows") {	

	pl = new pipeline()
	agit = new gitIt()
	builder = new gradleIt()
	reporter = new reportIt()

	stage ("init") {
		deleteDir()
	}

	stage ("checkoutTests") {
		agit.checkOutTestAutomation ()
	}

	stage ("runTests") {
		targetDir = "myAcceptanceTests"
		builder.test (targetDir)
	}
	stage ("report") {
		targetDir = "myAcceptanceTests"
		reporter.test (targetDir)
	}
	
}