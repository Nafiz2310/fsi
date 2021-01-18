package com.fsi.jasperreport.fsi.service;


import com.fsi.jasperreport.fsi.entity.User;
import com.fsi.jasperreport.fsi.repository.UserRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {

    @Autowired
    private UserRepository userRepository;


    public String export(String reportFormat) throws FileNotFoundException,  JRException {

        String path ="F:\\ReportsGenerated";
        List<User> userList =userRepository.findAll();

        //load file and compile it
        File file = ResourceUtils.getFile("classpath:UserReport.jrxml");

        JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(userList);

        Map<String,Object> parameters = new HashMap<>();
        parameters.put("created by","Nafizul");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,dataSource);
        if(reportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint,path+ "\\UserReport.Html");
        }
        if(reportFormat.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jasperPrint,path+"\\UserReport.Pdf");
        }
        return "report generated in path" +path;
    }
}
