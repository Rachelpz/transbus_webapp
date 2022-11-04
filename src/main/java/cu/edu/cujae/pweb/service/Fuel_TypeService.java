package cu.edu.cujae.pweb.service;

import cu.edu.cujae.pweb.dto.FuelDto;
import java.util.List;

public interface Fuel_TypeService {
    List<FuelDto> getFuels();
    FuelDto getFuelById(Integer FuelId);
    void createFuel(FuelDto fuel);
    void updateFuel(FuelDto fuel);
    void deleteFuel(Integer id);
}
