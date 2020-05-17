package hospitalServer.service;

import hospitalServer.bean.Registration;

/**
 * @author: Huxley
 * @version: v1.0
 * @description: hospitalServer.service
 **/
public interface RegistrationService {
    Registration doRegistration(String userId, int schId);
}
