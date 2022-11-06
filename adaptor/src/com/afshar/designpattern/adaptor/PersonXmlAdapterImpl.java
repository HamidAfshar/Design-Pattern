package com.afshar.designpattern.adaptor;

public class PersonXmlAdapterImpl implements XmlAdapter {

    private Person person;

    public PersonXmlAdapterImpl(Person person) {
        this.person = person;
    }

    @Override
    public String toXml() {
        return "<Person><firstName>%s</firstName><lastName>%s</lastName><age>%d</age></Person>".formatted(person.getFirstName(), person.getLastName(), person.getAge());
    }
}
