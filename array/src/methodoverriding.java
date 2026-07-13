//method overiding

class Bank{
    public void RateOfInterest(){
        System.out.println("Generally the rate is 6%");
    }
}

class SBI extends Bank {
    public void RateOfInterest() {
        System.out.println("Generally the rate is 7%");
    }
}

    class IOB extends Bank {
        public void RateOfInterest() {
            System.out.println("Generally the rate is 7%");
        }
    }
public class methodoverriding {
            public static void main(String[]args){
            Bank obj = new Bank();
            SBI obj1 = new SBI();
            IOB obj3 = new IOB();
            obj1.RateOfInterest();
            obj.RateOfInterest();
            obj3.RateOfInterest();
  }
}

