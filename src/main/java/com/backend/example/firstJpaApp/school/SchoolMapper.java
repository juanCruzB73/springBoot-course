package com.backend.example.firstJpaApp.school;

import org.springframework.stereotype.Service;

@Service
public class SchoolMapper {
    public School toSchool(SchoolDto schoolDto){
        return new School(schoolDto.name());
    }
    public SchoolDto toSchoolDto(School school){
        return new SchoolDto(school.getSchoolName());
    }
}
