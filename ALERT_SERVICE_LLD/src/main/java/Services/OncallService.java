package Services;

import dto.Developer;

import java.util.HashMap;
import java.util.Map;

public class OncallService {
    private Map<String, Developer> onCallDeveloperMap;
    public OncallService(){
        this.onCallDeveloperMap = new HashMap<String, Developer>();
    }
    public void setOnCallDeveloper(String team, Developer developer) {
        onCallDeveloperMap.put(team, developer);
    }

    public Developer getOnCallDeveloper(String team){
        Developer primaryDeveloper = onCallDeveloperMap.get(team);
        return primaryDeveloper;
    }


}
