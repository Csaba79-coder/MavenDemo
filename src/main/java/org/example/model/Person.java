package org.example.model;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.file.PathUtils;

public class Person {

    // getter and setter of lombok (only for one field!)
    @Getter
    @Setter
    String name;

    // if you want to use for more field repeat getter and setter!
    @Getter
    @Setter
    String age;

    @Getter
    @Setter
    PathUtils pathUtils;
}
