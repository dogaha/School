namespace HTMLTagHelpersSample.Models
{
    public class MyModel
    {
        public string Username { get; set; } = "";
        public string Password { get; set; } = "";
        public bool IsNFL { get; set; }
        public bool IsNBA { get; set; }
        public bool IsMLB { get; set; }
        public bool IsTennis { get; set; }
        public string SelectedMajor { get; set; } = "";
        public string SelectedCarMake { get; set; } = "";

        public string PerformLogin()
        {
            if ((Username == "user1" && Password == "pwd")
            || (Username == "user2" && Password == "pwd"))
            {
                return "Successfully logged in!";
            }
            else
            {
                return "Login failed!";
            }
        }

        public string GetFavSports()
        {
            string favSports = "Your favorite sports are:";
            if(IsNFL == true)
            {
                favSports = favSports + " NFL";
            }
            if (IsNBA == true)
            {
                favSports = favSports + " NBA";
            }
            if (IsMLB == true)
            {
                favSports = favSports + " MLB";
            }
            if (IsTennis == true)
            {
                favSports = favSports + " Tennis";
            }
            return favSports;
        }
    }
}
