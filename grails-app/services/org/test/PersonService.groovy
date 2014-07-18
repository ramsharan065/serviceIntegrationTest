package org.test

import grails.transaction.Transactional
import org.test.domain.Person

@Transactional
class PersonService {

    def createPerson(String name) {
    	new Person(name: name).save()
    }
}
