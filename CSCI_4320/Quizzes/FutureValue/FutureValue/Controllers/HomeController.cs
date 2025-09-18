using Microsoft.AspNetCore.Mvc;
using FutureValue.Models;

public class HomeController : Controller
{
    [HttpGet] //what to request
    public IActionResult Index()
    {
        ViewBag.FV = 0; //initilly start at 0
        return View();
    }

    [HttpPost] // when data is changed and submitted / cleared
    public IActionResult Index(FutureValueModel model)
    {
        ViewBag.FV = model.CalculateFutureValue(); //calculate value
        return View(model); 
    }
}


/* old code
using Microsoft.AspNetCore.Mvc; // import all classes from MVC
using System;

namespace FutureValue.Controllers // references the folder it is in
{
    public class HomeController : Controller //
    {
        public IActionResult Index()
        {
            //Viewbag is a dynamic property of the controller
            ViewBag.Name = "Mary"; //Add name property
            ViewBag.FV = 99999.99; //Add future value property
            
            return View();
        }
    }
}
*/


