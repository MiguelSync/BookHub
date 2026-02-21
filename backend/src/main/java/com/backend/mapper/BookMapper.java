package com.backend.mapper;

import com.backend.dto.BookDto;
import com.backend.entity.BookEntity;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface BookMapper {

    public BookDto toDto(BookEntity bookEntity);

    public BookEntity toClass(BookDto bookDto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void updateEntityFromDto(BookDto dto, @MappingTarget BookEntity entity);
}
