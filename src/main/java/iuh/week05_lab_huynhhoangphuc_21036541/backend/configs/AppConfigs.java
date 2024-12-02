package iuh.week05_lab_huynhhoangphuc_21036541.backend.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigs {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}