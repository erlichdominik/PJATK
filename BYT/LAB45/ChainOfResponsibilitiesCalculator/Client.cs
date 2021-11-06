using System;
using ChainOfResponsibilitiesCalculator.Handler;

namespace ChainOfResponsibilitiesCalculator
{
    class Client
    {
      public static void ClientCode(AbstractHandler handler)
      {
        string op = "2*3+2";
        Console.WriteLine($"Operation is: {op}");
        var result = handler.Handle(op);

        if (result != null)
        {
          Console.WriteLine($"{result}");
        }
        else 
        {
          Console.WriteLine($"{op} was left untouched");
        }
      }
    }
}
