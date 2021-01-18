package com.fsi.jasperreport.fsi;

import com.fsi.jasperreport.fsi.entity.User;
import com.fsi.jasperreport.fsi.repository.UserRepository;
import com.fsi.jasperreport.fsi.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.util.List;

@SpringBootApplication
public class FsiApplication extends SpringBootServletInitializer {
    @Autowired
    private UserRepository repository;

    @Autowired
    private ReportService reportService;
    @GetMapping("/getUserDetails")
    public List<User> getUserDetails(){
        return repository.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return reportService.export(format);

    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FsiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(FsiApplication.class, args);
        System.out.println("Hello");
    }

}
