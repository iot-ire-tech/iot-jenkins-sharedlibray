@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*

mode = params.mode.toLowerCase()
def sut = params.serviceName
def env = params.env

node ("windows") {	

	pl = new pipeline()

	// work
	pl.build()
	pl.test("regression")
	pl.deploy("staging","api")
	pl.test("load")
	pl.deploy("prod","api")

}