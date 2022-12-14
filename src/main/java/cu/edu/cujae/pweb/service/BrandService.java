package cu.edu.cujae.pweb.service;

import cu.edu.cujae.pweb.dto.BrandDto;

import java.util.List;

public interface BrandService {
    List<BrandDto> getBrands();
    BrandDto getBrandById(Integer BrandId);
    void createBrand(BrandDto brand);
    void updateBrand(BrandDto brand);
    boolean deleteBrand(Integer id);
    Integer getBrandsSize();
}
