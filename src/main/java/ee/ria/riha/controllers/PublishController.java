package ee.ria.riha.controllers;

import ee.ria.riha.service.InfosystemStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublishController {

  @Autowired InfosystemStorageService storageService;

  @RequestMapping(value = "/infosystems/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public String infosystems() {
    return storageService.load();
  }
}
