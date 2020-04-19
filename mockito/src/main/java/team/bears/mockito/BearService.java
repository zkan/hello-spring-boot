package team.bears.mockito;

public class BearService {
    private Bear bear;

    public BearService(Bear bear) {
        this.bear = bear;
    }

    public String say() {
        return this.bear.roar();
    }
}
