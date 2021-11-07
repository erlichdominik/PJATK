using System;
using ChainOfResponsibilitiesCalculator.Handler;

namespace ChainOfResponsibilitiesCalculator.Operations
{
    class AddHandler : AbstractHandler
    {
        public override object Handle(object request)
        {
            OperationModel _request = request as OperationModel;
            if (_request.Op.Equals('+'))
            {
              return _request.FirstNumber + _request.SecondNumber;
            }
            return base.Handle(request);
            /*            
                        if (_request[1].Equals('+'))
                        {
                            return int.Parse(_request[0].ToString()) + int.Parse(_request[2].ToString());
                        }
                        else
                        {
                            return base.Handle(request);
                        }

            */
        }
    }
}
