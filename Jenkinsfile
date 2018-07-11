@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@test")
import com.iot.*

node {
// instantiate
pl = new pipeline()

// work
pl.build()
pl.test("regression")
pl.deploy("staging","api")
pl.test("load")
pl.deploy("prod","api")
}