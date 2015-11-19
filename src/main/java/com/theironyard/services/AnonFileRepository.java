package com.theironyard.services;

import com.theironyard.entities.AnonFile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alhanger on 11/18/15.
 */
public interface AnonFileRepository extends CrudRepository<AnonFile, Integer> {

    @Query("SELECT f FROM AnonFile f WHERE isPermanent = false ORDER BY id")
    List<AnonFile> findFalse();
}
