package com.czetsuyatech.web.exceptions.client.mappers;

import com.czetsuyatech.web.exceptions.client.services.pojos.User;
import com.czetsuyatech.web.exceptions.client.web.models.UserV1;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR,
    unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface Web2ServiceMapper {

  User asUser(UserV1 userV1);
}
