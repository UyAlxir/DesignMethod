import java.sql.Time;
import java.util.ArrayList;
import java.util.Timer;

public class MainSystem implements Mediator{
    private ArrayList<SubSystem> subSystemList;
    private AirPortsSubSystem airPortsSubSystem;
    private HotelsSubSystem hotelsSubSystem;
    private RavelCompaniesSubSystem ravelCompaniesSubSystem;
    private RestaurantsSubSystem restaurantsSubSystem;
    private TourismAttractionsSubSystem tourismAttractionsSubSystem;

    public MainSystem(){
        this.createSubsystem();
        airPortsSubSystem.sentInfo("test 1");
        hotelsSubSystem.sentInfo("test 2");
        ravelCompaniesSubSystem.sentInfo("test 3");
        restaurantsSubSystem.sentInfo("test 4");
        tourismAttractionsSubSystem.sentInfo("test 5");
    }


    @Override
    public void createSubsystem() {
        airPortsSubSystem = new AirPortsSubSystem();
        hotelsSubSystem = new HotelsSubSystem();
        ravelCompaniesSubSystem = new RavelCompaniesSubSystem();
        restaurantsSubSystem = new RestaurantsSubSystem();
        tourismAttractionsSubSystem = new TourismAttractionsSubSystem();
        subSystemList = new ArrayList<SubSystem>();
        subSystemList.add(airPortsSubSystem);
        subSystemList.add(hotelsSubSystem);
        subSystemList.add(restaurantsSubSystem);
        subSystemList.add(ravelCompaniesSubSystem);
        subSystemList.add(tourismAttractionsSubSystem);
        for(SubSystem subSystem:subSystemList){
            subSystem.setMediator(this);
        }
    }

    @Override
    public void recieveInfo(String info, SubSystem subSystem) {
        radio2SunSyetems(info, subSystem);
    }

    @Override
    public void radio2SunSyetems(String info, SubSystem subSystem) {
        for(SubSystem subSystem1:subSystemList){
            if(subSystem1.equals(subSystem))continue;
            subSystem1.recieveInfo(info);
        }
    }
}
