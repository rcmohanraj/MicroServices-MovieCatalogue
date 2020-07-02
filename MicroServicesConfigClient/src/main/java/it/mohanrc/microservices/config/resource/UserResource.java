package it.mohanrc.microservices.config.resource;

import it.mohanrc.microservices.config.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @Autowired
    private UserData userData;

    @GetMapping("/userdata")
    public String getUserData() {
        return userData.getLocation()+userData.getName();
    }
}
