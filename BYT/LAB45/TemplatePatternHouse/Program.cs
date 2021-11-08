using System;

namespace TemplatePatternHouse
{
    class Program
    {
        static void Main(string[] args)
        {
          HouseTemplate houseTemplate = new ConcreteHouse();
          houseTemplate.BuildHouse();
          Console.WriteLine();
          
        }
    }
}
