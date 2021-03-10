package ru.itsjava.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itsjava.service.*;

@Configuration
public class MyConfig {
    @Bean
    public ServiceCoffee serviceCoffee(ServiceMenu menuService, ServiceScanner scannerService) {
        return new ServiceCoffeeImpl(menuService, scannerService);
    }
    @Bean
    public ServiceMenu serviceMenu() {
        return new ServiceMenuImpl();
    }
    @Bean
    public ServiceScanner serviceScanner(){
        return new ServiceScannerImpl();
    }
}
