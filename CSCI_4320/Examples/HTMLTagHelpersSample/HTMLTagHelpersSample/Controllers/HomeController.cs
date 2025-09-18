using HTMLTagHelpersSample.Models;
using Microsoft.AspNetCore.Mvc;

namespace HTMLTagHelpersSample.Controllers
{
    public class HomeController : Controller
    {
        [HttpGet]
        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Index(MyModel model)
        {
            ViewBag.LoginStatus = model.PerformLogin();
            ViewBag.FavSports = model.GetFavSports();
            ViewBag.Major = "Your selected major is: " + model.SelectedMajor;
            ViewBag.CarMake = "Your selected car make is: " + model.SelectedCarMake;
            return View(model);
        }
    }
}
