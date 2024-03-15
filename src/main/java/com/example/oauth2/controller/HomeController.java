package com.example.oauth2.controller;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *main Controller.
 * with 2 functions
 */

@NoArgsConstructor
@RestController
public class HomeController{

    /**
     * get mapping for root url.
     * @return home string
     */
    @GetMapping
    public final String home() 
    {
        return "home";
    }

    /**
     * get mapping for secured url.
     * @return secured string
     */
    @GetMapping("/secured")
    public final String secured() {
        int x;
        return "Secured Page";
    }


}
