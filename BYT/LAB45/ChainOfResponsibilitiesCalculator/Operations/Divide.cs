using ChainOfResponsibilitiesCalculator.Handler;

namespace ChainOfResponsibilitiesCalculator.Operations
{
    class DivideHandler : AbstractHandler
    {
        public override object Handle(object request)
        {
            string _request = request as string;
            if (_request[1].Equals('/'))
            {
                return int.Parse(_request[0].ToString()) / int.Parse(_request[2].ToString());
            }
            else
            {
                return base.Handle(request);
            }
        }
    }

}
