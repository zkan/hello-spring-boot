package team.bears.mockito;

import org.springframework.beans.factory.annotation.Autowired;

public class BearService {
    @Autowired
    Bear bear;

    public String say() {
        return bear.roar();
    }
}
