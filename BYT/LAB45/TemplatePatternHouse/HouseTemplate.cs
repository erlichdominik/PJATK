using System;
namespace TemplatePatternHouse
{
  public abstract class HouseTemplate
  {
    public void BuildHouse()
    {
      BuildFoundation();
      BuildPillars();
      BuildWalls();
      BuildWindows();
      Console.WriteLine("House is built");
    }

    protected abstract void BuildFoundation();
    protected abstract void BuildPillars();
    protected abstract void BuildWalls();
    protected abstract void BuildWindows();
  }
}
