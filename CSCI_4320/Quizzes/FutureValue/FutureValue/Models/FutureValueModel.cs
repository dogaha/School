namespace FutureValue.Models
{
    public class FutureValueModel //class
    {
        public decimal MonthlyInvestment { get; set; } // read and writeable decimal property, monthly investment
        public decimal YearlyInterestRate { get; set; } // read an writeable decmial property, Interest Return
        public int Years { get; set; } //read and writeable integer property, Year

        public decimal CalculateFutureValue() //Function to get future value
        {
            int months = Years * 12; //get months
            decimal monthlyInterestRate = YearlyInterestRate / 12 / 100; //get monthly interest rate
            decimal futureValue = 0; // declare future value
            for (int i = 0; i < months; i++) //every month recalculte future value
            {
                futureValue = (futureValue + MonthlyInvestment) * (1 + monthlyInterestRate); // return = PRT
            }
            return futureValue;
        }

    }
}
