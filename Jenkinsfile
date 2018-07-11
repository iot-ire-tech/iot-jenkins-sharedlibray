@Library("jenkins-shared-libraries@release")
import io.abc.*

// instantiate
pl = new pipeline()

// work
pl.build()
pl.deploy(qa,api)
pl.test(regression)
pl.deploy(staging,api)
pl.test(load)
pl.deploy(prod,api)
