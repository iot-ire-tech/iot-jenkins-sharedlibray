/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aennis
 */
import groovy.json.*;
import groovy.json.JsonSlurper;
import groovy.json.JsonBuilder;

class utilJson2Obj {
	
	public static void main(String[] args) {

		// Person object

		def person = new Person(firstName: "John", lastName: "Doe")

		// Json String
		def personJSON = new JsonBuilder(person).toPrettyString()

		// Json String to Map
		def personMap = new JsonSlurper().parseText(personJSON)

		// using Map to convert to Person object type

		def newPerson = new Person(personMap)

		println(person)

		println(newPerson)

		assert newPerson.firstName.equals(person.firstName)

		assert newPerson.lastName.equals(person.lastName)

	}

}

class Person {  

	String firstName

	String lastName

}
