package domain.performer;

import exceptions.PerformanceException;

public interface Performer {

    public void perform() throws PerformanceException;
}