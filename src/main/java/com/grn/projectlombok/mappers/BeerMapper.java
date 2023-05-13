package com.grn.projectlombok.mappers;

import com.grn.projectlombok.entities.Beer;
import com.grn.projectlombok.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}