package training.springboot.controller;

import training.springboot.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import training.springboot.service.PhotoService;

@RestController
@RequestMapping(path = "/photo")
public class PhotoController {

    @Autowired
    PhotoService photoService;

    @GetMapping("save/{name}/{description}")


    public ResponseEntity<?> savePhoto(@PathVariable String name, @PathVariable String description) {
        try {
            Photo photo = new Photo();
            photo.setName(name);
            photo.setDescription(description);
//            savePhoto(photo);
            photoService.savePhoto(photo);
            System.out.println(photo);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}