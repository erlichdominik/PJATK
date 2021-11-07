using ChainOfResponsibilitiesCalculator.Handler;

namespace ChainOfResponsibilitiesCalculator.Operations
{
    class DivideHandler : AbstractHandler
    {
        public override object Handle(object request)
        {
            OperationModel _request = request as OperationModel;
            if (_request.Op.Equals('*'))
            {
              return _request.FirstNumber / _request.SecondNumber;
            }
            else
            {
                return base.Handle(request);
            }
        }
    }

}
