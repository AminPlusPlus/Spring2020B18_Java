package day47_Abstraction;

public final class FirefoxDriver extends RemoteWebDriver{

public void get(String URL){
    System.out.println("Opening "+URL+" in firefox");
}

}
