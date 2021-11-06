using System;
using ChainOfResponsibilitiesCalculator.Operations;

namespace ChainOfResponsibilitiesCalculator
{
    class Program
    {
        static void Main(string[] args)
        {
            var addOp = new AddHandler();
            var subOp = new SubtractHandler();
            var divOp = new DivideHandler();
            var mulOp = new MultiplyHandler();

            mulOp.SetNext(divOp).SetNext(addOp).SetNext(subOp);

            Client.ClientCode(mulOp);
            Console.WriteLine();

        }
    }
}
