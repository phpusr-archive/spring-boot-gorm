package gorm.domain

import grails.persistence.Entity
import groovy.transform.EqualsAndHashCode

/**
 * @author Doronin Sergey
 * Date: 22.04.2016
 * Time: PM 6:09
 */

@Entity
@EqualsAndHashCode(includes="id")
class Post {

    String title
    String text
    //Date dateCreated

    static constraints = {
        title size: 5..100
        text blank: false
    }

}
