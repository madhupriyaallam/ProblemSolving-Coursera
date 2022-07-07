package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfActions {
    public static final List<String> actionsCommonToAllRegionTypes = new ArrayList<>(Arrays.asList
            ("Protect the community through warning systems and adapt to the changing climate", "Be prepared by constructing areas where we can store food and etc at the time of floods","Proper planning should be made while constructing buildings"));
    public static final List<String> actionsSpecificToCoastalRegion = new ArrayList<>(Arrays.asList
            ("Floods barriers, seawalls etc should be constructed for safe side", "Raising roads above sea level can help drain water and reduce tidal flooding"));
    public static final List<String> actionsSpecificToCities = new ArrayList<>(Arrays.asList
            ("As population is more in cities frequently check whether drainage system is proper", "If there is any problem with roads and etc try to fix them as soon as possible"));
    public static final List<String> actionsSpecificToVillages = new ArrayList<>(Arrays.asList
            ("Identify stock, machinery and tools that can easily be moved off the farm to prevent loss or damage", "Identify any chemicals or fuels on the farm that could contaminate floodwater and think about how they could be moved to safety during a flood"));
}
