using System;

namespace BuilderPatternPerson
{
    interface IBuilder
    {

    }

    public class PersonBuilder
    {
        private Person _person;

        public PersonBuilder Create(string firstName, string lastName)
        {
            _person = new Person();
            _person.FirstName = firstName;
            _person.LastName = lastName;
            _person.Id = Guid.NewGuid();
            return this;
        }
        public PersonBuilder DateOfBirth(DateTime dob)
        {
            _person.DateOfBirth = dob;
            return this;
        }
        public PersonBuilder Gender(Sex sex)
        {
            _person.Sex = sex;
            return this;
        }

        public Person Build()
        {
            return _person;
        }
    }


}
