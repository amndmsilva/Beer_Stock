package com.amandasantos.beerstock.mapper;

import com.amandasantos.beerstock.entity.Beer;
import com.amandasantos.beerstock.dto.BeerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
