namespace YouTubeEgitim
{

    class Program
    {
        static void Main(String[] args)
        {
            CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
            customerManager.GiveCredit();
                Console.ReadLine();
            /*
                        CreditManager creditManager   = new CreditManager();
                        creditManager.Calculate();
                        creditManager.Save();

                        Customer customer = new Customer();
                        //örneğini oluşturmak yada instance oluşturmak
                        customer.Id = 1;
                        customer.City = "İstanbul";

                        CustomerManager customerManager = new CustomerManager(customer);
                        customerManager.Save();
                        customerManager.Delete();

                        Company company = new Company();
                        company.TaxNumber = "549875";
                        company.CompanyName = "Beko";
                        company.Id = 100;

                        CustomerManager customerManager2 = new CustomerManager(new Company());

                        Person person = new Person();
                        person.NationalIdentity ="741852";

                        Customer customer1 = new Customer();
                        Customer customer2 = new Person();
                        Customer customer3 = new Company();
                    */

        }
    }
    class  CreditManager 
    {
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi kaydedildi");
        }
    }

    interface ICreditManager
    {
        void Calculate();
        void Save();
    }

    //sınıflarda kullanılan ortak işlemleriçin abtract sınıf kullandık
    abstract class BaseCreditManager:ICreditManager
    {
        //sınıflarda kullanılan ortak işlemleriçin abtract kullandık
        public abstract void Calculate();
        
        //diğer sınıflarda save işlemi aynı işlevi yerine getirdiği için ortak kısma yazıldı
        //abstract sınıfta genel bir işlemde özel bir durum oluşturmak için virtual kullanılır
        public virtual void Save()
        {
            Console.WriteLine("Kredi keydedildi");
        }
    }

    //BaseCreditManager inherit edildi 
    class TeacherCreditManager : BaseCreditManager, ICreditManager
    {
        //Calculate işlemi override ile özelleştirildi 
        public override void Calculate()
        {
            Console.WriteLine("Öğretmen Kredisi Hesaplandı");
        }
        //genel olarak save işlemi ortak iken TeacherCreditMAnager sınıfı için özelleştirildi
        public override void Save()
        {
            base.Save();
        }
    }

    class MilitaryCreditManager :BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Asker Kredisi Hesaplandı");
        }

    }

    class CarCreditManager : BaseCreditManager, ICreditManager
    {
        public override void Calculate()
        {
            Console.WriteLine("Araba Kredisi Hesaplandı");
        }

    }


    class Customer 
    {
        public Customer()
        {
            Console.WriteLine("Müşteri Nesnesi başlatıldı");
        }

        public int Id { get; set; }
        public string City { get; set; }

    }

    class Person:Customer
    {
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string NationalIdentity { get; set; }
    }

    class Company:Customer// : javadaki extends anlamı taşır
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    
    class CustomerManager
    {

        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager)
        {

            _customer = customer;
            _creditManager = creditManager;
        }
        public void Save()
        {
            Console.WriteLine("Müşteri Kaydedildi");
        }
        public void Delete()
        {
            Console.WriteLine("Müşteri silindi" );
        }

        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi ");
        }
    }

}
