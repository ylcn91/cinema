package cinema.config;

import cinema.model.Cinema;
import cinema.exception.CinemaException;
import cinema.model.Statistic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfig {
    @Bean
    public Cinema cinema(){
        return new Cinema();
    }
    @Bean
    public CinemaException myException(){
        return new CinemaException();
    }
    @Bean
    public Statistic statistic(){
        return new Statistic();
    }
}
