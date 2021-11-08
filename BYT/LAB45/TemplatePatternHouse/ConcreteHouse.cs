using System;
namespace TemplatePatternHouse
{
    public class ConcreteHouse : HouseTemplate
    {
        protected override void BuildFoundation()
        {
          Console.WriteLine("Building Foundation");
        }

        protected override void BuildPillars()
        {
          Console.WriteLine("Building Pillars"); 
        }

        protected override void BuildWalls()
        {
          Console.WriteLine("Building Walls"); 
        }

        protected override void BuildWindows()
        {
          Console.WriteLine("Building Windows");
        }
    }
}
