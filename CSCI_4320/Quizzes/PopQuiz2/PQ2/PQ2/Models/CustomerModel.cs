using System.ComponentModel.DataAnnotations;
using System.Runtime.InteropServices;
using System.Security.Cryptography.X509Certificates;

namespace PQ2.Models
{
    public class CustomerModel
    {
        public string FullName { get; set; }
        public string CompanyName { get; set; }
        public string TimeZone { get; set; }
        public string Membership { get; set; }
        public string Email { get; set; }
        public string Password { get; set; }
        public string RePassword { get; set; }

        public (string,string) CreateAccount()
        {
            if (TimeZone == "" || TimeZone==null)
            {
                return ("Invalid Timezone","");
            }
            if (Membership == null) {
                return ("Please Choose A Membership Plan", "");
            }
            if (Email == null || Email == "" || !Email.Contains("@"))
            {
                return ("Invalid Email", "");
            }
            if (Password == null ||Password.Length < 8)
            {
                return ("Invalid Password","");
            }
            if (Password != RePassword) 
            {
                return ("Passwords Don't Match", "");
            }
            
            string fee() 
            {
                if (Membership == "Free") {
                    return "$0";
                } else if (Membership == "Basic")
                {
                    return "$30";
                }
                else 
                {
                    return "$60";
                }
            }
            return ("",FullName+", you are successfully registered! Your "+Membership+" fee is "+fee()+".");
        }
    }
}
