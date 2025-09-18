using Microsoft.AspNetCore.Mvc;
using PQ2.Models;

namespace PQ2.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Index(CustomerModel model)
        {
            (string error, string success) = model.CreateAccount();
            ViewBag.ErrorMessage = error;
            ViewBag.SuccessMessage = success;
            return View(model);
        }
    }
}
