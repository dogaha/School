using System.Collections;
using System.Diagnostics.Eventing.Reader;
using System.Security.Cryptography.Xml;
using Microsoft.Extensions.ObjectPool;

namespace Assignment1.Models
{
    public class MyModel
    {
        public string input { get; set; }
        public string inputType { get; set; }

        public string Sort() {
            string[] arr = input.Split(',');
            ArrayList parseArr = null;
            if (inputType == "Integer")
            {
                parseArr = new ArrayList(Array.ConvertAll(arr, int.Parse));
            }
            else if (inputType == "Date")
            {
                parseArr = new ArrayList(Array.ConvertAll(arr, DateTime.Parse));
                
            }
            else {
                parseArr = new ArrayList(arr);
            }

            /* Long Way To transform arr
            int[] parseArr = new int[arr.Length];
            for (int i = 0; i < arr.Length; i++) {
                parseArr[i] = int.Parse(arr[i]);
            }
            */
            parseArr.Sort();
            if (inputType == "Date") {
                DateTime[] temp = (DateTime[])parseArr.ToArray(typeof(DateTime));
                parseArr = new ArrayList(Array.ConvertAll(temp, x=> x.ToString("d")));
            }
            return String.Join(", ", parseArr.ToArray());
        }
    }
}
