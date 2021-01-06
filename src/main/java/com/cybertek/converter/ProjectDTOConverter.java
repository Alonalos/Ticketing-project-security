package com.cybertek.converter;

import com.cybertek.dto.ProjectDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


@Component
@ConfigurationPropertiesBinding
class ProjectDtoConverter implements Converter<String, ProjectDTO> {
    @Override
    public ProjectDTO convert(String source) {
        return null;
    }


//    @Autowired
//    ProjectService projectService;
//
//    @Override
//    public ProjectDTO convert(String source) {
//        return projectService.findById(source);
//    }
}
