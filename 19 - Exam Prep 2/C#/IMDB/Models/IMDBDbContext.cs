namespace IMDB.Models
{
    using Microsoft.EntityFrameworkCore;
    using System;

    public class IMDBDbContext : DbContext
    {
        public DbSet<Film> Films { get; set; }

        public IMDBDbContext()
        {
            this.Database.EnsureCreated();
        }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseMySQL("server=localhost;database=imdb_asp;user=root;");
        }

        internal object Where(Func<object, bool> value)
        {
            throw new NotImplementedException();
        }
    }
}
