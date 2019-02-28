/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.bsuir.akkerman.mobile.server.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Lena
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(by.bsuir.akkerman.mobile.server.service.CallForwardingService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.CallInfoService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.ContractService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.GroupTariffService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.InternetInfoService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.MmsInfoService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.SmsInfoService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.SubscriberService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.TariffPlanService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.TypePersonService.class);
        resources.add(by.bsuir.akkerman.mobile.server.service.VoiceMessageService.class);
    }
    
}
