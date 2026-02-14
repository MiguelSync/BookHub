package com.backend.mapper;

import com.backend.dto.BookDto;
import com.backend.entity.BookEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    public BookDto toDto(BookEntity bookEntity);

    public BookEntity toClass(BookDto bookDto);
}
