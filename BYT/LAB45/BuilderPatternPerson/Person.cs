using System;

namespace BuilderPatternPerson
{
    public class Person
    {
        public Guid Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public DateTime DateOfBirth { get; set; }
        public Sex Sex { get; set; }

        public override string ToString()
        {
          return $"Id: {Id}, FirstName: {FirstName}, LastName: {LastName}, DateOfBirth: {DateOfBirth}, Sex: {Sex}";
        }
    }

    public enum Sex
    {
        Male,
        Female
    }
}
