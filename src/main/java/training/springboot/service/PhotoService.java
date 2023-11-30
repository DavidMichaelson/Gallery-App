package training.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.springboot.model.Photo;
import training.springboot.repository.PhotoRepository;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public void savePhoto(Photo photoGallery) {
        photoRepository.save(photoGallery);
    }
    // public List<Photo> getPhotos() {
    //     return photoGalleryRepository.findAll();
    // }
}
