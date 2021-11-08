using System;

namespace BuilderPatternPerson
{
    public class Client
    {
      public static void ClientCode()
      {
        PersonBuilder personBuilder = new PersonBuilder();

        personBuilder.Create("firstName", "lastName");
        personBuilder.Gender(Sex.Female);
        Person person = personBuilder.Build();

        Console.WriteLine(person.ToString());
      }
    }
}
