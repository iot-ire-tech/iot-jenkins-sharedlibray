@Library("github.com/iot-ire-tech/iot-jenkins-sharedlibray@master")
import com.iot.*
import com.scm.*
import com.gradle.*
import com.reports.*
import com.archive.*

import java.util.ArrayList;
import java.util.List;

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
	List<String> list = new ArrayList<String>();
	list.add("A");
	list.add("A");
	list.add("B");
	list.add("C");
	for (String item : list) {

	}
ArrayList<ArrayList<String>> aObject;

// Create the 2D array list
	aObject  = new ArrayList<ArrayList<String>>();

// Add an element to the first dimension
	aObject.add ( new ArrayList<String>());

// Place a string in position [0,0]
aObject.get ( 0).add(new String("Quarks"));

// Display the string in position [0,0]
println(aObject.get (0).get(0).toString());	

	//	for ( serviceItem in servicesPack ) {
	//		println "INF: New Service Test " + serviceItem.value
	//
	//		deleteDir()
	//		
	//		//		stage ("coTests") {
	//		//			targetDir = "myAcceptanceTests"
	//		//			agit.checkOutTestAutomation (serviceItem, targetDir)
	//		//		}
	//		//
	//		//		stage ("exeTest-"+sut) {
	//		//			builder.test (targetDir)
	//		//		}
	//		//
	//		//		stage ("report") {
	//		//			targetDir = "myAcceptanceTests"
	//		//			reporter.test (targetDir)
	//		//		}
	//		//
	//		//		stage ("archive") {
	//		//			targetDir = "myAcceptanceTests/build/report/**"
	//		//			arch.archive (targetDir)
	//		//		}
	//	}
}