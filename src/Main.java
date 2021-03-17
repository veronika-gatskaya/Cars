import com.company.details.Engine;
import com.company.professionals.Driver;
import com.company.service.OutputInfoServiceImpl;
import com.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver("Name", 25, 2);
        Engine engine = new Engine(100, "company");
        SportCar sportCar = new SportCar("Car class", "Reno", engine, driver, 120.4);

        OutputInfoServiceImpl output = new OutputInfoServiceImpl();
        output.printInfo(sportCar, engine, driver);

    }
}
