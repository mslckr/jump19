package com.endpoint;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.example.person.CreatePersonRequest;
import org.example.person.CreatePersonResponse;
import org.example.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.domain.PersonModel;
import com.domain.PersonRepository;

@Endpoint
public class PersonEndpoint {
	private static final String NAMESPACE_URI = "http://www.example.org/person";
private PersonRepository personRepository;

@Autowired
public PersonEndpoint(PersonRepository personRepository) {
	    this.personRepository = personRepository;
	}
@PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreatePersonRequest")
@ResponsePayload
public CreatePersonResponse createPerson(@RequestPayload CreatePersonRequest request) {
    PersonModel personModel = new PersonModel();
    personModel.setFirstName(request.getFirstName());
    personModel.setLastName(request.getLastName());
    personModel.setDob(toDate(request.getDob()));

    PersonModel model = personRepository.save(personModel);

    Person person = null;
    if (model != null) {
        person = toDto(model);
    }

    CreatePersonResponse response = new CreatePersonResponse();
    response.setPerson(person);
    return response;
}
/*
 * Converts XMLGregorianCalendar to java.util.Date in Java
 */
private static Date toDate(XMLGregorianCalendar calendar) {
	if (calendar == null) {
		return null;
	}
	return calendar.toGregorianCalendar().getTime();
}

private static Person toDto(PersonModel model) {
	Person person = new Person();
	person.setId(model.getId().intValue());
	person.setFirstName(model.getFirstName());
	person.setLastName(model.getLastName());
	if (model.getDob() != null) {
		person.setDob(toXMLGregorianCalendar(model.getDob()));
	}
	return person;
}
/*
 * Converts java.util.Date to javax.xml.datatype.XMLGregorianCalendar
 */
private static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
	GregorianCalendar gCalendar = new GregorianCalendar();
	gCalendar.setTime(date);
	XMLGregorianCalendar xmlCalendar = null;
	try {
		xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
	} catch (DatatypeConfigurationException ex) {
	}
	return xmlCalendar;
}

}
