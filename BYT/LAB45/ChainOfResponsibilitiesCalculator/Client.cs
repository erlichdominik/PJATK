using System;
using ChainOfResponsibilitiesCalculator.Handler;
using ChainOfResponsibilitiesCalculator.Operations;

namespace ChainOfResponsibilitiesCalculator
{
    class Client
    {
        /* public static void ClientCode(AbstractHandler handler)
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

        */
      public static void ClientCode(AbstractHandler handler)
      {
        OperationModel operationModel = new OperationModel
        {
          FirstNumber = 3.0,
          SecondNumber = 2.0,
          Op = '+'
        };
        var result = handler.Handle(operationModel); 
        
        if(result != null)
        {
          Console.WriteLine($"{result}");
        }
        else
        {
          Console.WriteLine($"{operationModel} was left untouched");
        }


      }


    }

}
