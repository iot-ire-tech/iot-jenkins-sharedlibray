@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*

// instantiate
pl = new pipeline()

// work
pl.build()
pl.deploy(qa,api)
pl.test(regression)
pl.deploy(staging,api)
pl.test(load)
pl.deploy(prod,api)
