package com.jcs.BateriaStore.dtos;

import com.jcs.BateriaStore.entities.Country;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto implements Serializable {
    private Long id;
    private String code;
    private String name;

    public CountryDto (Country entity) {
        id = entity.getId();
        code = entity.getCode();
        name = entity.getName();
    }
}