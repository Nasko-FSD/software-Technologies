namespace LogNoziroh.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using Models;
    using System.Linq;

    public class ReportController : Controller
    {
        private readonly LogNozirohDbContext dbContext;

        public ReportController(LogNozirohDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            var allReports = this.dbContext
                .Reports
                .ToList();

            return View(allReports);
        }

        [HttpGet]
        [Route("details/{id}")]
        public IActionResult Details(int id)
        {
			Report currentReport = this.dbContext
                .Reports
                .Find(id);

            return View(currentReport);
        }

        [HttpGet]
        [Route("create")]
        public IActionResult Create()
        {			
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public IActionResult Create(Report report)
        {
			this.dbContext.Reports.Add(report);
            this.dbContext.SaveChanges();

            return Redirect("/");
        }

        [HttpGet]
        [Route("delete/{id}")]
        public IActionResult Delete(int id)
        {
            var currentReport = this.dbContext.Reports.Find(id);

            return View(currentReport);
        }

        [HttpPost]
        [Route("delete/{id}")]
        [ValidateAntiForgeryToken]
        public IActionResult DeleteConfirm(Report reportModel)
        {
			this.dbContext.Reports.Remove(reportModel);
            this.dbContext.SaveChanges();

            return Redirect("/");
        }
    }
}
