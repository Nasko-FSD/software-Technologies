﻿namespace ShoppingList.Controllers
{
    using Microsoft.AspNetCore.Mvc;
    using System.Collections.Generic;
    using System.Linq;
    using Models;

    public class ProductController : Controller
    {
        private readonly ShoppingListDbContext dbContext;

        public ProductController(ShoppingListDbContext dbContext)
        {
            this.dbContext = dbContext;
        }

        [HttpGet]
        [Route("")]
        public IActionResult Index()
        {
            var products = this.dbContext.Products.ToList();

            return View(products);
        }

        [HttpGet]
        [Route("/create")]
        public IActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("/create")]
        public IActionResult Create(Product product)
        {
            if (ModelState.IsValid)
            {
                this.dbContext.Products.Add(product);
                this.dbContext.SaveChanges();

                return Redirect("/");
            }

            return View(product);
        }

        [HttpGet]
        [Route("/edit/{id}")]
        public IActionResult Edit(int? id)
        {
            var project = this.dbContext.Products.Find(id);

            if (project == null)
            {
                return NotFound(404);
            }

            return View(project);
        }

        [HttpPost]
        [Route("/edit/{id}")]
        public IActionResult Edit(Product product)
        {            
                this.dbContext.Products.Update(product);
                this.dbContext.SaveChanges();

                return Redirect("/");                        
        }

        [HttpGet]
        [Route("/delete/{id}")]
        public IActionResult Delete(int? id)
        {
            var project = this.dbContext.Products.Find(id);

            if (project == null)
            {
                return NotFound(404);
            }

            return View(project);
        }

        [HttpPost]
        [Route("/delete/{id}")]
        public IActionResult Delete(Product product)
        {
            this.dbContext.Products.Remove(product);
            this.dbContext.SaveChanges();

            return Redirect("/");
        }
    }
}
