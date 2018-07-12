@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*

mode = params.mode.toLowerCase()
def sut = params.serviceName
def env = params.env

def debug=false



node ("windows") {	

	pl = new pipeline()
	agit = new gitIt()
	builder = new gradleIt()

	stage ("init") {
		deleteDir()
	}

	stage ("checkoutTests") {
		agit.checkOutTestAutomation ()
	}

	stage ("runTests") {
			echo "INF: Current Path (" + pwd() +")"
			dir ( _targetDir ) {
				echo "INF: New Current Path (" + pwd() +")"
				bat "./gradlew.bat clean"
				bat "./gradlew.bat test"
				if (debug ) bat "dir /s ." 
			}
            
		}
	// work
	pl.build()
	pl.test("regression")
	pl.deploy("staging","api")
	pl.test("load")
	pl.deploy("prod","api")

}