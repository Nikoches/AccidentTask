package main.repository;

import main.model.Accident;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

@Repository
public class AccidentMem {
    private final HashMap<Integer, Accident> accidents;

    public AccidentMem(HashMap<Integer, Accident> accidents) {
        this.accidents = accidents;
    }

    public Collection<Accident> getAccidents() {
        return accidents.values();
    }

    public void addAccident(Integer x, Accident accident) {
        this.accidents.put(x,accident);
    }
    public void modifyAccident(Integer x, Accident accident) {
        this.accidents.put(x, accident);
    }
    public void removeAccident(Integer x) {
        this.accidents.remove(x);
    }
}
