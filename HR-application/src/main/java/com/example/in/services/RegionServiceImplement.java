package com.example.in.services;
import com.example.in.entities.Region;
import com.example.in.exceptions.RegionNotFoundException;
import com.example.in.repositories.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigDecimal;
import java.util.List;
@Service
public class RegionServiceImplement implements RegionService {
    private RegionRepository regionRepository;
    @Autowired
    public void setRegionRepository(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }
    @Override
    public String addRegion(Region region) {
        regionRepository.save(region);
        return "Record Created Successfully";}
    @Override
    public String modifyRegion(Region region) {
        regionRepository.save(region);
        return "Record Modified Successfully";}
    @Override
    public List<Region> getAllRegions() {
        return regionRepository.findAll();}
    @Override
    public Region getRegionById(BigDecimal regionId) {
      return regionRepository.findByRegionId(regionId).orElseThrow(()->new RegionNotFoundException("Region Not Found"));}
    @Override
    @Transactional
    public void deleteRegion(BigDecimal regionId) {
        if(regionRepository.findByRegionId(regionId).isPresent()) {
            try {
                regionRepository.deleteRegionByRegionId(regionId);
            } catch (RuntimeException ex) {
                throw new RegionNotFoundException("Cannot delete or update a parent row: a foreign key constraint fails");
            }
        }else{
            throw new RegionNotFoundException("Region Not Found");
        }
    }
}

