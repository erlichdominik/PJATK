using System;

namespace BuilderPatternPerson
{
    public class Person
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime DateOfBirth { get; set; }
        public Sex Sex { get; set; }
    }

    public enum Sex
    {
        Male,
        Female
    }
}
