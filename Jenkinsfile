@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*


var = new globals()
echo "INF: Org ${var.org}"
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