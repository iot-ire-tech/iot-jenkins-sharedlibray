@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*

mode = params.mode.toLowerCase()
def sut = params.serviceName
def env = params.env

def debug=false



node ("windows") {	

	pl = new pipeline()

	stage ("init") {
		deleteDir()
	}

	stage ("checkoutTests") {
		checkOutTestAutomation 
	}

	// work
	pl.build()
	pl.test("regression")
	pl.deploy("staging","api")
	pl.test("load")
	pl.deploy("prod","api")

}