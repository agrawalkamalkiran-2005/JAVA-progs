/*6. Create the classes as given in the below figure. Display the interest rate in the following format:
SBI Rate of Interest : 8
ICICI Rate of Interest : 7
AXIS Rate of Interest : 9*/
class Bank {
    int getRateOfInterest() {
        return 0;
    }
}
class SBI extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}
class ICICI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}
class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}
public class Driver6 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest : " + b.getRateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest : " + b.getRateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest : " + b.getRateOfInterest());
    }
}
