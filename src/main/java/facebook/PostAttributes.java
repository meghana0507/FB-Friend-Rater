package facebook;

import com.restfb.types.Event;

import java.security.acl.Owner;
import java.util.List;

public class PostAttributes {

    //add variables about photos
   
    private int numberOfTags;
   
    public int getNumberOfTags(){
        return numberOfTags;
    }

    public void setNumberOfTags(int value){
        this.numberOfTags = value;
    }

}
