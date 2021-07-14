package bdd.API.Framework.stepDefinations;

import bdd.API.Framework.pojo.pojoSerialized.AddPlace;
import bdd.API.Framework.pojo.pojoSerialized.Location;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {

    public AddPlace addPlacePayload(){
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress("elkipalki");
        p.setLanguage("america");
        p.setPhone_number("808885553535");
        p.setWebsite("https://site.com");
        p.setName("Oleg");

        List<String> muList = new ArrayList<String>();
        muList.add("chernykovka");
        muList.add("hata");
        p.setTypes(muList);

        Location l = new Location();
        l.setLat(38.883913);
        l.setLng(-38.891234);
        p.setLocation(l);
        return p;
    }
}
